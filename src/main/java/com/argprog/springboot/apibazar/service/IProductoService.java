package com.argprog.springboot.apibazar.service;

import java.util.List;
import com.argprog.springboot.apibazar.model.Producto;

public interface IProductoService {
    
    public List<Producto> getProductos();

    public void saveProducto(Producto producto);

    public void deleteProducto(Long idProducto);

    public Producto findProductoById(Long idProducto);


}
