package com.salesianostriana.E02.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Producto {

    @Id
    private UUID id;

    private String nombre;
    private String imagen;
    private double precio;

    public Producto(){

        id = UUID.randomUUID();
    }
}
