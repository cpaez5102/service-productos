package com.shop.springboot.app.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shop.springboot.app.productos.models.entity.Producto;
import com.shop.springboot.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {
	
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll().stream().map(producto ->{
		return producto;
		}).collect(Collectors.toList());		
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable long id){
		Producto producto = productoService.findById(id);			
		return productoService.findById(id);
	}

}
