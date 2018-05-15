package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class EvaluacionFamilia implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @ManyToOne
    private TipoDocumento padreDocumento;

    @ManyToOne
    private FamiliaTipo familiaTipo;

    @Column
    private String calidadRelaciones;

    @Column(length = 20)
    private String padreIdentificacion;

    @Column(length = 100)
    private String padreNombre;

    @ManyToOne
    private TipoDocumento madreDocumento;

    @Column(length = 20)
    private String madreIdentificacion;

    @Column(length = 100)
    private String madreNombre;

    @Column(columnDefinition = "text")
    private String actividadesRecreativas;

    @Column
    private Boolean actitud1;

    @Column
    private Boolean actitud2;

    @Column
    private Boolean actitud3;

    @Column
    private Boolean actitud4;

    @Column
    private Boolean actitud5;

    @Column
    private Boolean actitud6;

    @OneToMany(mappedBy = "evaluacion")
    private List<Familia> miembros;

    @ManyToOne
    private EstadoCivil estadoCivil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public TipoDocumento getPadreDocumento() {
        return padreDocumento;
    }

    public void setPadreDocumento(TipoDocumento padreDocumento) {
        this.padreDocumento = padreDocumento;
    }

    public FamiliaTipo getFamiliaTipo() {
        return familiaTipo;
    }

    public void setFamiliaTipo(FamiliaTipo familiaTipo) {
        this.familiaTipo = familiaTipo;
    }

    public String getCalidadRelaciones() {
        return calidadRelaciones;
    }

    public void setCalidadRelaciones(String calidadRelaciones) {
        this.calidadRelaciones = calidadRelaciones;
    }

    public String getPadreIdentificacion() {
        return padreIdentificacion;
    }

    public void setPadreIdentificacion(String padreIdentificacion) {
        this.padreIdentificacion = padreIdentificacion;
    }

    public String getPadreNombre() {
        return padreNombre;
    }

    public void setPadreNombre(String padreNombre) {
        this.padreNombre = padreNombre;
    }

    public TipoDocumento getMadreDocumento() {
        return madreDocumento;
    }

    public void setMadreDocumento(TipoDocumento madreDocumento) {
        this.madreDocumento = madreDocumento;
    }

    public String getMadreIdentificacion() {
        return madreIdentificacion;
    }

    public void setMadreIdentificacion(String madreIdentificacion) {
        this.madreIdentificacion = madreIdentificacion;
    }

    public String getMadreNombre() {
        return madreNombre;
    }

    public void setMadreNombre(String madreNombre) {
        this.madreNombre = madreNombre;
    }

    public String getActividadesRecreativas() {
        return actividadesRecreativas;
    }

    public void setActividadesRecreativas(String actividadesRecreativas) {
        this.actividadesRecreativas = actividadesRecreativas;
    }

    public Boolean getActitud1() {
        return actitud1;
    }

    public void setActitud1(Boolean actitud1) {
        this.actitud1 = actitud1;
    }

    public Boolean getActitud2() {
        return actitud2;
    }

    public void setActitud2(Boolean actitud2) {
        this.actitud2 = actitud2;
    }

    public Boolean getActitud3() {
        return actitud3;
    }

    public void setActitud3(Boolean actitud3) {
        this.actitud3 = actitud3;
    }

    public Boolean getActitud4() {
        return actitud4;
    }

    public void setActitud4(Boolean actitud4) {
        this.actitud4 = actitud4;
    }

    public Boolean getActitud5() {
        return actitud5;
    }

    public void setActitud5(Boolean actitud5) {
        this.actitud5 = actitud5;
    }

    public Boolean getActitud6() {
        return actitud6;
    }

    public void setActitud6(Boolean actitud6) {
        this.actitud6 = actitud6;
    }

    public List<Familia> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Familia> miembros) {
        this.miembros = miembros;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
