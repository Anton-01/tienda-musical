package com.markusdev.tiendamusicalentities.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Person extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long id;

    @Column(name = "numeroIdentificacion", length = 45, nullable = false)
    private String identityNumber;

    @Column(name = "nombre", length = 45, nullable = false)
    private String name;

    @Column(name = "primerApellido", length = 45, nullable = false)
    private String surname;

    @Column(name = "segundoApellido", length = 45, nullable = false)
    private String secondSurname;

    @Column(name = "imagen", length = 45)
    private String photo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idTipoIdentificacion")
    private IdentityType identityType;

    @Column(name = "usuario", length = 45, nullable = false)
    private String user;

    @Column(name = "password", length = 45, nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idRol")
    private Rol rol;
}
