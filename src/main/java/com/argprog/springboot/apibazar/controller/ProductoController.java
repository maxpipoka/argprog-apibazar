package com.argprog.springboot.apibazar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.springboot.apibazar.model.Producto;
import com.argprog.springboot.apibazar.service.IProductoService;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService prodInter;

    @GetMapping("/productos/traer")
    public List<Producto> getProductos(){
        return prodInter.getProductos();
    }

    @PostMapping("/productos/crear")
    public void saveProducto(@RequestBody Producto producto){
        prodInter.saveProducto(producto);
    }

    @DeleteMapping("/productos/eliminar/{idProducto}")
    public void deleteProducto(@PathVariable Long idProducto){
        prodInter.deleteProducto(idProducto);
    }

    @PutMapping("/productos/editar/{id}")
    public void editProducto(@PathVariable Long idProducto,
                            @RequestBody String nombre,
                            @RequestBody double precio){
        Producto productoAEditar = prodInter.findProductoById(idProducto);
        productoAEditar.setNombre(nombre);
        productoAEditar.setPrecio(precio);
        prodInter.saveProducto(productoAEditar);
                            }

    @GetMapping("/productos/traer/{id}")
    public Producto findProductoById(Long idProducto){
        return prodInter.findProductoById(idProducto);
    }


}
