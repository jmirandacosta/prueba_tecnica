package com.springboot.prueba.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.prueba.models.dao.IProductoDao;
import com.springboot.prueba.models.entity.Producto;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	IProductoDao productoDao;

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoDao.deleteById(id);
		
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

}
