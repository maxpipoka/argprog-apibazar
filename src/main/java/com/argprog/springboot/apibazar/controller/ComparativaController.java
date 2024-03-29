package com.argprog.springboot.apibazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.argprog.springboot.apibazar.model.Producto;
import com.argprog.springboot.apibazar.service.IComparativaService;

@RestController
public class ComparativaController {
    
    @Autowired
    private IComparativaService compaInter;

    @GetMapping("/comparativa/lower")
    public Producto getLowerPriceProduct(){
        return compaInter.getLowerPriceProduct();
    }

    @GetMapping("/comparativa/highest")
    public Producto getHighestPriceProduct(){
        return compaInter.getHighestPriceProduct();
    }

    @GetMapping("/comparativa/lowertohighest")
    public List<Producto> getLowerToHighestList(){
        return compaInter.getLowerToHighestPriceList();
    }

    @GetMapping("/comparativa/highesttolower")
    public List<Producto> getHighestToLowerList(){
        return compaInter.getHighestToLowerPriceList();
    }
}
