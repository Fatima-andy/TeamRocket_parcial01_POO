package com.FAQE.x00139619;

public class PlazaFija extends Empleado {
    private int extensión;

    public PlazaFija(String nombre, String puesto, double salario, int extensión) {
        super(nombre, puesto, salario);
        this.extensión = extensión;
    }

    public int getExtensión() {
        return extensión;
    }

    public void setExtensión(int extensión) {
        this.extensión = extensión;
    }


    @Override
    public String toString() {
        return "PlazaFija{" +
                "extensión=" + extensión +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", documentos=" + documentos +
                "\n";
    }
}
