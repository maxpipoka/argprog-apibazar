package com.argprog.springboot.apibazar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.springboot.apibazar.model.Producto;
import com.argprog.springboot.apibazar.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductoRepository produRepo;

    @Override
    public List<Producto> getProductos() {
        return produRepo.findAll();
    }

    @Override
    public void saveProducto(Producto producto) {
        produRepo.save(producto);
        
    }

    @Override
    public void deleteProducto(Long idProducto) {
        produRepo.deleteById(idProducto);
    }

    @Override
    public Producto findProductoById(Long idProducto) {
        Producto findedProducto = produRepo.findById(idProducto).orElse(null);
        return findedProducto;
    }

}
