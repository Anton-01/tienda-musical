package com.markusdev.tiendamusicalentities.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class Common {
    @Column(name = "fechaCreacion", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "fechaModificacion")
    private LocalDateTime updatedAt;

    @Column(name = "estatus")
    private boolean status;
}
