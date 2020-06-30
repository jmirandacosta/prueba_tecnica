package com.springboot.prueba.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.prueba.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	
	

}
