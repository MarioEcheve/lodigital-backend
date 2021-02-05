package com.lodigital.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.openhtmltopdf.pdfboxout.PdfBoxRenderer;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

@Service("pdfservice")
public class PDFServicesImpl {
	
	SpringTemplateEngine templateEngine;
    ResourceLoader resourceLoader;

    public PDFServicesImpl(SpringTemplateEngine springTemplateEngine, ResourceLoader resourceLoader) {
        this.templateEngine = springTemplateEngine;
        this.resourceLoader = resourceLoader;
    }
    
    public InputStream generarPdf(String rutaPlantilla, Map<String, Object> parametros, String baseUri) throws IOException {
        String html = obtieneHtmlDesdeArchivo(rutaPlantilla);
        final String plantillaHtml = generarRepresentacionDesdePlantillaHtml(templateEngine, parametros, html);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PdfRendererBuilder builder = new PdfRendererBuilder();
        builder.useFastMode();
        builder.withHtmlContent(plantillaHtml, baseUri);
        builder.toStream(outputStream);

        final PdfBoxRenderer pdfBoxRenderer = builder.buildPdfRenderer();
        pdfBoxRenderer.layout();
        pdfBoxRenderer.createPDF();
        outputStream.close();
        return new ByteArrayInputStream(outputStream.toByteArray());
    }

    private String construirParametros(SpringTemplateEngine templateEngine, Map<String, ?> parametros, String plantillaHtml) {
        Context context = new Context();
        parametros.forEach(context::setVariable);
        return templateEngine.process(plantillaHtml, context);
    }

    private String generarRepresentacionDesdePlantillaHtml(SpringTemplateEngine templateEngine, Map<String, ?> parametros, String plantillaHtml) {
        return construirParametros(templateEngine, parametros, plantillaHtml);
    }

    private String obtieneHtmlDesdeArchivo(String rutaPlantilla) throws IOException {
        Resource resource = resourceLoader.getResource(ResourceLoader.CLASSPATH_URL_PREFIX.concat(rutaPlantilla));
        InputStream fileInputStream = resource.getInputStream();
        final String html = IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);
        //log.debug("Obtengo html desde el arhivo {} HTML {}", rutaPlantilla, html);
        return html;
    }
	
	
}