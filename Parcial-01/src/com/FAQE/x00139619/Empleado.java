package com.FAQE.x00139619;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Empleado {
    Scanner scan = new Scanner(System.in);


    protected String nombre,puesto,numero;
    protected double salario;

    protected List<Documento>ListD = new ArrayList<>();

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    public abstract void empleado(String nombr,String puesto, double salario);

    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public List<Documento> getListD() { return ListD; }

    public void AddDocument(){
        ListD.add(new Documento(nombre,numero));
    }
    public void RemoveDocument(){
        System.out.println("nombre del documento a eliminar: ");
        String nom = scan.nextLine();

        ListD.removeIf(obj -> nombre.equalsIgnoreCase(nom));
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
