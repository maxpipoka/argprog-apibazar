package com.argprog.springboot.apibazar.service;

import java.util.List;
import com.argprog.springboot.apibazar.model.Producto;

public interface IComparativaService{
    
    public Producto getHighestPriceProduct();
    
    public Producto getLowerPriceProduct();

    public List<Producto> getLowerToHighestPriceList();

    public List<Producto> getHighestToLowerPriceList();
}
