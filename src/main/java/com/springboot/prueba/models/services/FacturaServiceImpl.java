package com.springboot.prueba.models.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.prueba.models.dao.IProductoDao;
import com.springboot.prueba.models.entity.Factura;
import com.springboot.prueba.models.entity.Item;
import com.springboot.prueba.models.entity.Producto;
import com.springboot.prueba.utilidades.Utilidad;

@Service
public class FacturaServiceImpl implements FacturaService {

	@Autowired
	private IProductoDao productoDao;

	@Override
	public Factura findAll(String cliente, String cantidad) {
		
		List<Producto> productos = (List<Producto>) productoDao.findAll();
		int limite = Integer.parseInt(cantidad.trim());
		List<Producto> productosMax = new ArrayList<Producto>();
		
		int index=0;
		while(productosMax.size()<limite) {
			productosMax.add(productos.get(index));
			index++;
		}
		
		Factura fact = new Factura();
		fact.setCliente(cliente);
		fact.setItems(productosMax.stream().map(p -> new Item(p, Utilidad.Cantidad())).collect(Collectors.toList()));
		return fact;
	}

}
