package com.argprog.springboot.apibazar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.springboot.apibazar.model.Producto;
import com.argprog.springboot.apibazar.repository.ProductoRepository;

@Service
public class ComparativaService implements IComparativaService{

    @Autowired
    private ProductoRepository produRepo;

    List<Producto> allProducts = produRepo.findAll();

    @Override
    public Producto getHighestPriceProduct() {
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
        Producto lowerPriceProd = new Producto();
        for (Producto tempProd : allProducts) {
            if(tempProd.getPrecio() >  lowerPriceProd.getPrecio()){
                lowerPriceProd = tempProd;
            }
        }
        return lowerPriceProd;
    }

    @Override
    public List<Producto> getHighestToLowerPriceList() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public List<Producto> getLowerToHighestPriceList() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
}
