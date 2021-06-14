package com.markusdev.tiendamusicalentities.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rol")

@Getter
@Setter
public class Rol extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String name;
}
