package com.ejercicio_practico.ejercicio_practico.infrastructure.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio_practico.ejercicio_practico.domain.Producto;

@Repository
public class ProductoRepository {
    private final List<Producto> productos = new ArrayList<>();

    public List<Producto> findAll(){
        return new ArrayList<>(productos);
    }

    public void save(Producto producto){
        productos.add(producto);
    }

    public void deleteByCode(String code){
        productos.removeIf(producto -> producto.getCodigo().equals(code));
    }
}
