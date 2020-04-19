package com.FAQE.x00139619;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private List<Empleado> Planilla = new ArrayList();
    Scanner scan = new Scanner(System.in);
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public List<Empleado> getPlanilla() { return  Planilla; }

    public void addEmpleado(){

       System.out.print("Nombre del empleado: ");
       String nombre = scan.nextLine();
       System.out.print("Puesto del empleado: ");
       String puesto = scan.nextLine();
       System.out.print("Salario del empleado: ");
       double salario = scan.nextDouble();  scan.nextLine();
       int num = 1;

       Planilla.add(new Test(nombre,puesto,salario,num));
    }

    public void quitEmpleado(String name){
        Planilla.removeIf(obj -> obj.getNombre().equalsIgnoreCase(name));
    }
}
