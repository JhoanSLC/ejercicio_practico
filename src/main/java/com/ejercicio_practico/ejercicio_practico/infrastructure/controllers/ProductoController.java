package com.ejercicio_practico.ejercicio_practico.infrastructure.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ejercicio_practico.ejercicio_practico.application.ProductoService;
import com.ejercicio_practico.ejercicio_practico.domain.Producto;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductoController {
    private final ProductoService productService;

    public ProductoController(ProductoService productService) {
        this.productService = productService;
    }

    @GetMapping({"", "/"})
    public String getAllProducts(Model model) {
    List<Producto> products = productService.obtenerProductos();
    model.addAttribute("products", products);
    model.addAttribute("product", new Producto());  // Asegúrate de agregar un nuevo Producto vacío
    return "index";
}


    @PostMapping
    public String addProduct(@ModelAttribute Producto product) {
        productService.añadirProducto(product);
        return "redirect:/products"; 
    }

    @DeleteMapping("/{codigo}")
    public String deleteProduct(@PathVariable String codigo) {
        productService.eliminarProducto(codigo);
        return "redirect:/products"; 
    }
    
}
