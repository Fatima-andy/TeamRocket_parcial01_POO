package com.FAQE.x00139619;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMeses() {
        return mesesContrato;
    }

    public void setMeses(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }


    @Override
    public String toString() {
        return "ServicioProfesional{" +
                "mesesContrato=" + mesesContrato +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", documentos=" +
                "\n";
    }
}
