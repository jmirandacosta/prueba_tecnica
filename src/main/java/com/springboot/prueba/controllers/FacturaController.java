package com.springboot.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.prueba.models.entity.Factura;
import com.springboot.prueba.models.services.FacturaService;

@RestController
@RequestMapping("/api")
public class FacturaController {
	
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("/calcular/{cliente}")
	public Factura listar(@PathVariable String cliente){
		return facturaService.findAll(cliente);
	}

}
