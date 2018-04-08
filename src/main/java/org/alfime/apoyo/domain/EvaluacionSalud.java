package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EvaluacionSalud implements Serializable {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Evaluacion evaluacion;

    @ManyToOne
    private Regimen regimen;

    @ManyToOne
    private EPS eps;

    @ManyToOne
    private CajaCompensacion cajaCompensacion;

    @ManyToOne
    private Pension fondoPension;

    @Column
    private Byte asistencia1;

    @Column
    private Byte frecuencia1;

    @Column
    private Byte asistencia2;

    @Column
    private Byte frecuencia2;

    @Column
    private Byte asistencia3;

    @Column
    private Byte frecuencia3;

    @Column
    private Byte asistencia4;

    @Column
    private Byte frecuencia4;

    @Column
    private Byte asistencia5;

    @Column
    private Byte frecuencia5;
}
