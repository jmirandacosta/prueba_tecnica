package com.springboot.prueba.models.services;

import com.springboot.prueba.models.entity.Factura;

public interface FacturaService {
	public Factura findAll(String cliente);
}
