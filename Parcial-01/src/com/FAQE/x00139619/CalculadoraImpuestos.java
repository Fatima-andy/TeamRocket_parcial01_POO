package com.FAQE.x00139619;

public final class CalculadoraImpuestos {
    private static double totalRenta, totalISSS, totalAFP;

    private CalculadoraImpuestos() {
    }

    public static double calcularPago(Empleado colaborador) {
        double salarioNeto = colaborador.salario,
                salarioRestante, pago = 0,
                auxAFP, auxISSS, auxRenta = 0;
        if (colaborador instanceof PlazaFija) {
            auxAFP = 0.0625 * salarioNeto;
            auxISSS = 0.03 * salarioNeto;
            salarioRestante = salarioNeto - auxAFP - auxISSS;
            if (salarioRestante >= 0.01 && salarioRestante <= 472.00)
                auxRenta = 0;
            else if (salarioRestante >= 472.01 && salarioRestante <= 895.24)
                auxRenta = 0.1 * (salarioRestante - 472) + 17.67;
            else if (salarioRestante >= 895.25 && salarioRestante <= 2038.10)
                auxRenta = 0.2 * (salarioRestante - 895.24) + 60;
            else if (salarioRestante >= 2038.11)
                auxRenta = 0.3 * (salarioRestante - 2038.10) + 288.57;
            pago = salarioRestante - auxRenta;
            totalISSS += auxISSS;
            totalAFP += auxAFP;
            totalRenta += auxRenta;
        } else if (colaborador instanceof ServicioProfesional) {
            auxRenta = 0.1 * salarioNeto;
            pago = salarioNeto - auxRenta;
        }

        return pago;
    }

    public static String mostrarTotales(){
        String AFP = String.format("%.2f",totalAFP);
        String ISSS = String.format("%.2f",totalISSS);
        String renta = String.format("%.2f",totalRenta);

        return "AFP: $" + AFP + "\nISSS: $" + ISSS + "\nRenta: $" + renta;
    }
}
