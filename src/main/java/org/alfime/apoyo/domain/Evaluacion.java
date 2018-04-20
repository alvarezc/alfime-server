package org.alfime.apoyo.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Evaluacion extends Auditable implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private boolean aceptado;

    @Column(columnDefinition = "text")
    private String observaciones;

    @Column(columnDefinition = "text")
    private String conclusiones;

    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "programa_id"))
    private List<Programa> plan;

    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "programa_id"))
    private List<Programa> aspiracion;

    @ManyToOne
    private Remitente remitente;

    @OneToOne(mappedBy = "evaluacion", fetch = FetchType.LAZY)
    private EvaluacionFamilia familia;

    @OneToOne(mappedBy = "evaluacion", fetch = FetchType.LAZY)
    private EvaluacionMedico medico;

    @OneToOne(mappedBy = "evaluacion", fetch = FetchType.LAZY)
    private EvaluacionOcupacion ocupacion;

    @OneToOne(mappedBy = "evaluacion", fetch = FetchType.LAZY)
    private EvaluacionSalud salud;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Asociado evaluador;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }

    public List<Programa> getPlan() {
        return plan;
    }

    public void setPlan(List<Programa> plan) {
        this.plan = plan;
    }

    public List<Programa> getAspiracion() {
        return aspiracion;
    }

    public void setAspiracion(List<Programa> aspiracion) {
        this.aspiracion = aspiracion;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public EvaluacionFamilia getFamilia() {
        return familia;
    }

    public void setFamilia(EvaluacionFamilia familia) {
        this.familia = familia;
    }

    public EvaluacionMedico getMedico() {
        return medico;
    }

    public void setMedico(EvaluacionMedico medico) {
        this.medico = medico;
    }

    public EvaluacionOcupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(EvaluacionOcupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public EvaluacionSalud getSalud() {
        return salud;
    }

    public void setSalud(EvaluacionSalud salud) {
        this.salud = salud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Asociado getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Asociado evaluador) {
        this.evaluador = evaluador;
    }
}
