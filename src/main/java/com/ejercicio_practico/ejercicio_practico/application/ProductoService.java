package com.ejercicio_practico.ejercicio_practico.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejercicio_practico.ejercicio_practico.domain.Producto;
import com.ejercicio_practico.ejercicio_practico.infrastructure.repositories.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepo){
        this.productoRepository = productoRepo;
    }

    public List<Producto> obtenerProductos(){
        return productoRepository.findAll();
    }

    public void añadirProducto(Producto producto){
        productoRepository.save(producto);
    }

    public void eliminarProducto(String codigo){
        productoRepository.deleteByCode(codigo);
    }
}
