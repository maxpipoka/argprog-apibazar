package com.argprog.springboot.apibazar.service;

import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.springboot.apibazar.model.Producto;
import com.argprog.springboot.apibazar.repository.ProductoRepository;

@Service
public class ComparativaService implements IComparativaService{

    @Autowired
    private ProductoRepository produRepo;

    
    @Override
    public Producto getHighestPriceProduct() {
        List<Producto> allProducts = produRepo.findAll();
        Producto highestPriceProd = new Producto();
        for (Producto tempProd : allProducts) {
            if(tempProd.getPrecio() > highestPriceProd.getPrecio()){
                highestPriceProd = tempProd;
            }
        }
        return highestPriceProd;
    }

    @Override
    public Producto getLowerPriceProduct() {
        List<Producto> allProducts = produRepo.findAll();
        Producto lowerPriceProd = new Producto();
        for (Producto tempProd : allProducts) {
            if(lowerPriceProd.getNombre() == null){
                lowerPriceProd = tempProd;
            }else if(tempProd.getPrecio() <  lowerPriceProd.getPrecio()){
                lowerPriceProd = tempProd;
            }
        }
        return lowerPriceProd;
    }

    @Override
    public List<Producto> getHighestToLowerPriceList() {
        List<Producto> allProducts = produRepo.findAll();
        allProducts.sort(Comparator.comparing(Producto::getPrecio).reversed());
        return allProducts;
    }


    @Override
    public List<Producto> getLowerToHighestPriceList() {
        List<Producto> allProducts = produRepo.findAll();
        allProducts.sort(Comparator.comparing(Producto::getPrecio));
        return allProducts;
    }
    
    
    
}
