package com.markusdev.tiendamusicalentities.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tipoidentificacion")
@Getter
@Setter
public class IdentityType extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoIdentificacion")
    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String name;
}
