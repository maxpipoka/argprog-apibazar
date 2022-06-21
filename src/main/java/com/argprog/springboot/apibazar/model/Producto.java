package com.argprog.springboot.apibazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idProducto;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private double precio;

    public Producto() {
    }

    public Producto(Long idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
}
