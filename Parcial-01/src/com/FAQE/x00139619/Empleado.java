package com.FAQE.x00139619;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {

    protected String nombre, puesto;
    protected double salario;
    protected List<Documento> documentos = new ArrayList<>();

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void AddDocument(Documento añadir) {
        documentos.add(añadir);
    }

    public void RemoveDocument(String nombre) {
        documentos.removeIf(obj -> obj.getNombreD().equalsIgnoreCase(nombre));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
