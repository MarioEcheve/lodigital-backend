package com.lodigital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.lodigital.service.impl.PDFServicesImpl;

@Configuration
public class GeneradorPdfConfiguration {

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Bean
    public PDFServicesImpl mineducGeneradorPdfHelper(ResourceLoader resourceLoader) {
        return new PDFServicesImpl(templateEngine(), resourceLoader);
    }    
}