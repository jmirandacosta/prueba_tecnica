package com.springboot.prueba.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.prueba.models.entity.Factura;
import com.springboot.prueba.models.services.FacturaService;

@RefreshScope
@RestController
@RequestMapping("/api")
public class FacturaController {
	
	@Autowired
	private FacturaService facturaService;
	
	@Value("${configuracion.cantidad}")
	private String cantidad;
	
	@GetMapping("/calcular/{cliente}")
	public Factura listar(@PathVariable String cliente, @Value("${configuracion.cantidad}") String cantidad){
		return facturaService.findAll(cliente, cantidad);
	}
	
	@GetMapping("/obtener-config")
	public ResponseEntity<?> obtenerConfiguracion(){
		Map<String, String> json = new HashMap<>();
		json.put("cantidad", cantidad);
		return new ResponseEntity<Map<String, String>>(json, HttpStatus.OK);
	}

}
