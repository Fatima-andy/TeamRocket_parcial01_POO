package com.FAQE.x00139619;

import java.util.List;
import java.util.ArrayList;

public class Empresa {

    private List<Empleado> Planilla = new ArrayList();
    private List<Documento> Doc = new ArrayList<>();
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return Planilla;
    }

    public void addEmpleado(Empleado em) {
        Planilla.add(em);
    }

    public void quitEmpleado(String name) {
        for (int i = 0; i < Planilla.size(); i++) {
            String nameCheck = Planilla.get(i).getNombre();
            if (nameCheck.equalsIgnoreCase(name)) {
                Planilla.remove(i);
            } else {
                System.out.println("El empleado no existe, ");
            }
        }
    }

}
