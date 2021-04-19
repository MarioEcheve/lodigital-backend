package com.lodigital.service;

import java.util.List;


import com.lodigital.model.Comuna;

public interface IComunaService extends ICRUD <Comuna>{
	List<Comuna> comunas(Integer idRegion);
}
