package com.shop.springboot.app.productos.models.service;

import java.util.List;

import com.shop.springboot.app.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(long id);

}
