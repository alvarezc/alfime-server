package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Familia implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(optional = false)
    private Evaluacion evaluacion;

    @ManyToOne(optional = false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    private Parentesco parentesco;

    @ManyToOne(optional = false)
    private Responsabilidad responsabilidad;

    @Column(nullable = false)
    private String nombre;
}
