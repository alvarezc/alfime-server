package org.alfime.apoyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AgendaEvento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column
    private Byte dia1De;

    @Column
    private Byte dia1A;

    @Column
    private Byte dia1Slots;

    @Column
    private Byte dia1Max;

    @Column
    private Byte dia2De;

    @Column
    private Byte dia2A;

    @Column
    private Byte dia2Slots;

    @Column
    private Byte dia2Max;

    @Column
    private Byte dia3De;

    @Column
    private Byte dia3A;

    @Column
    private Byte dia3Slots;

    @Column
    private Byte dia3Max;

    @Column
    private Byte dia4De;

    @Column
    private Byte dia4A;

    @Column
    private Byte dia4Slots;

    @Column
    private Byte dia4Max;

    @Column
    private Byte dia5De;

    @Column
    private Byte dia5A;

    @Column
    private Byte dia5Slots;

    @Column
    private Byte dia5Max;

    @Column
    private Byte dia6De;

    @Column
    private Byte dia6A;

    @Column
    private Byte dia6Slots;

    @Column
    private Byte dia6Max;

    @Column
    private Byte dia7De;

    @Column
    private Byte dia7A;

    @Column
    private Byte dia7Slots;

    @Column
    private Byte dia7Max;

    @ManyToOne
    private AgendaCategoria categoria;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getDia1De() {
        return dia1De;
    }

    public void setDia1De(Byte dia1De) {
        this.dia1De = dia1De;
    }

    public Byte getDia1A() {
        return dia1A;
    }

    public void setDia1A(Byte dia1A) {
        this.dia1A = dia1A;
    }

    public Byte getDia1Slots() {
        return dia1Slots;
    }

    public void setDia1Slots(Byte dia1Slots) {
        this.dia1Slots = dia1Slots;
    }

    public Byte getDia1Max() {
        return dia1Max;
    }

    public void setDia1Max(Byte dia1Max) {
        this.dia1Max = dia1Max;
    }

    public Byte getDia2De() {
        return dia2De;
    }

    public void setDia2De(Byte dia2De) {
        this.dia2De = dia2De;
    }

    public Byte getDia2A() {
        return dia2A;
    }

    public void setDia2A(Byte dia2A) {
        this.dia2A = dia2A;
    }

    public Byte getDia2Slots() {
        return dia2Slots;
    }

    public void setDia2Slots(Byte dia2Slots) {
        this.dia2Slots = dia2Slots;
    }

    public Byte getDia2Max() {
        return dia2Max;
    }

    public void setDia2Max(Byte dia2Max) {
        this.dia2Max = dia2Max;
    }

    public Byte getDia3De() {
        return dia3De;
    }

    public void setDia3De(Byte dia3De) {
        this.dia3De = dia3De;
    }

    public Byte getDia3A() {
        return dia3A;
    }

    public void setDia3A(Byte dia3A) {
        this.dia3A = dia3A;
    }

    public Byte getDia3Slots() {
        return dia3Slots;
    }

    public void setDia3Slots(Byte dia3Slots) {
        this.dia3Slots = dia3Slots;
    }

    public Byte getDia3Max() {
        return dia3Max;
    }

    public void setDia3Max(Byte dia3Max) {
        this.dia3Max = dia3Max;
    }

    public Byte getDia4De() {
        return dia4De;
    }

    public void setDia4De(Byte dia4De) {
        this.dia4De = dia4De;
    }

    public Byte getDia4A() {
        return dia4A;
    }

    public void setDia4A(Byte dia4A) {
        this.dia4A = dia4A;
    }

    public Byte getDia4Slots() {
        return dia4Slots;
    }

    public void setDia4Slots(Byte dia4Slots) {
        this.dia4Slots = dia4Slots;
    }

    public Byte getDia4Max() {
        return dia4Max;
    }

    public void setDia4Max(Byte dia4Max) {
        this.dia4Max = dia4Max;
    }

    public Byte getDia5De() {
        return dia5De;
    }

    public void setDia5De(Byte dia5De) {
        this.dia5De = dia5De;
    }

    public Byte getDia5A() {
        return dia5A;
    }

    public void setDia5A(Byte dia5A) {
        this.dia5A = dia5A;
    }

    public Byte getDia5Slots() {
        return dia5Slots;
    }

    public void setDia5Slots(Byte dia5Slots) {
        this.dia5Slots = dia5Slots;
    }

    public Byte getDia5Max() {
        return dia5Max;
    }

    public void setDia5Max(Byte dia5Max) {
        this.dia5Max = dia5Max;
    }

    public Byte getDia6De() {
        return dia6De;
    }

    public void setDia6De(Byte dia6De) {
        this.dia6De = dia6De;
    }

    public Byte getDia6A() {
        return dia6A;
    }

    public void setDia6A(Byte dia6A) {
        this.dia6A = dia6A;
    }

    public Byte getDia6Slots() {
        return dia6Slots;
    }

    public void setDia6Slots(Byte dia6Slots) {
        this.dia6Slots = dia6Slots;
    }

    public Byte getDia6Max() {
        return dia6Max;
    }

    public void setDia6Max(Byte dia6Max) {
        this.dia6Max = dia6Max;
    }

    public Byte getDia7De() {
        return dia7De;
    }

    public void setDia7De(Byte dia7De) {
        this.dia7De = dia7De;
    }

    public Byte getDia7A() {
        return dia7A;
    }

    public void setDia7A(Byte dia7A) {
        this.dia7A = dia7A;
    }

    public Byte getDia7Slots() {
        return dia7Slots;
    }

    public void setDia7Slots(Byte dia7Slots) {
        this.dia7Slots = dia7Slots;
    }

    public Byte getDia7Max() {
        return dia7Max;
    }

    public void setDia7Max(Byte dia7Max) {
        this.dia7Max = dia7Max;
    }

    public AgendaCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(AgendaCategoria categoria) {
        this.categoria = categoria;
    }
}
