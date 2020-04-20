package com.FAQE.x00139619;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Empleado {
    protected String nombre, puesto;
    protected double salario;
    protected List<Documento> ListD = new ArrayList<>();

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

    public List<Documento> getListD() {
        return ListD;
    }

    public void AddDocument(Documento añadir) {
        ListD.add(añadir);
    }

    public void RemoveDocument(String nombre) {
        ListD.removeIf(obj -> obj.getNombreD().equalsIgnoreCase(nombre));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
