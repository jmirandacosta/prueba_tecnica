package com.springboot.prueba.models.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Producto producto;
	
	private int cantidad;
	
	public Integer getTotal() {
		return producto.getValor() * cantidad;//2.0;//producto.getPrecio() * cantidad.doubleValue();
	}	

}
