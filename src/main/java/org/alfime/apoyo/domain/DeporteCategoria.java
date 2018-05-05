package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class DeporteCategoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(length = 50)
    private String nombre;

    @ManyToOne
    private Deporte deporte;

    @ManyToMany
    @JoinTable(name = "deporte_categoria_discapacidad",
            joinColumns = @JoinColumn(name = "deporte_categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "discapacidad_id")
    )
    private List<Discapacidad> discapacidades;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public List<Discapacidad> getDiscapacidades() {
        return discapacidades;
    }

    public void setDiscapacidades(List<Discapacidad> discapacidades) {
        this.discapacidades = discapacidades;
    }
}
