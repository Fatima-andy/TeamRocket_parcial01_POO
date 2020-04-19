package com.FAQE.x00139619;

public class Test extends Empleado {


    //Este solo esta para ver si podria usar bien la lista


    private int numeroEmpleado= 1;

    public Test(String nombre, String puesto, double salario, int numeroEmpleado) {
        super(nombre, puesto, salario);
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(int numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    @Override
    public String toString() {
        return "Test: " +
                "\nnumeroEmpleado: " + numeroEmpleado +
                "\nnombre: " + nombre  +
                "\npuesto:" + puesto  +
                "\nsalario:" + salario+ "\n";
    }
}
