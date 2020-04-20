package com.FAQE.x00139619;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre de la empresa: ");
        String nombE = scan.nextLine();

        Empresa empresa = new Empresa(nombE);
        int op = -1;

        String nombre, puesto,documento, numeroDoc;
        double salario;
        int MC, extencion;

        do {
            try {
                System.out.println("1)Agregar empleado\n2)Despedir empleado" +
                        "\n3)Ver lista de empleados\n4)Calcular sueldo\n" +
                        "5)Mostrar totales\n0) Salir");
                op = scan.nextInt();
                scan.nextLine();
                switch (op) {
                    case 1:
                        System.out.println("Ingrese que tipo de empleado desea contratar:" +
                                "\n1. Plaza fija \n2. Servicio Profecional");
                        int op2 = scan.nextInt();
                        scan.nextLine();
                        switch (op2) {
                            case 1:
                                System.out.print("Nombre del empleado: ");
                                nombre = scan.nextLine();
                                System.out.print("Puesto del empleado: ");
                                puesto = scan.nextLine();
                                System.out.print("Salario del empleado: ");
                                salario = scan.nextDouble();
                                scan.nextLine();
                                System.out.print("Extencion:");
                                extencion = scan.nextInt();
                                scan.nextLine();

                                PlazaFija plaz = new PlazaFija(nombre, puesto, salario, extencion);

                                System.out.println("Documento: ");
                                documento = scan.nextLine();
                                System.out.println("Numero: ");
                                numeroDoc = scan.nextLine();

                                plaz.getDocumentos().add(new Documento(documento, numeroDoc));
                                empresa.addEmpleado(plaz);


                                break;
                            case 2:
                                System.out.print("Nombre del empleado: ");
                                nombre = scan.nextLine();
                                System.out.print("Puesto del empleado: ");
                                puesto = scan.nextLine();
                                System.out.print("Salario del empleado: ");
                                salario = scan.nextDouble();
                                scan.nextLine();
                                System.out.print("Meses de contacto:");
                                MC = scan.nextInt();
                                scan.nextLine();

                                ServicioProfesional servi = new ServicioProfesional(nombre, puesto, salario, MC);

                                System.out.println("Documento: ");
                                documento = scan.nextLine();
                                System.out.println("Numero: ");
                                numeroDoc = scan.nextLine();

                                servi.getDocumentos().add(new Documento(documento, numeroDoc));
                                empresa.addEmpleado(servi);


                                empresa.addEmpleado(new ServicioProfesional(nombre, puesto, salario, MC));
                                break;
                            default:throw new InputMismatchException("Opción invalida.");
                        }

                        break;
                    case 2:
                        if (empresa.getPlanilla().isEmpty()) {
                            System.out.println("No hay empleados");
                            break;
                        }
                        System.out.println("Nombre del empleado a despedir: ");
                        String nombreEmp = scan.nextLine();

                        empresa.quitEmpleado(nombreEmp);
                        break;
                    case 3:
                        if (empresa.getPlanilla().isEmpty()) {
                            System.out.println("No hay empleados");
                            break;
                        }
                        for (Empleado emp : empresa.getPlanilla()) {
                            System.out.println(emp.toString());
                        }
                        break;
                    case 4:
                        if (empresa.getPlanilla().isEmpty()) {
                            System.out.println("No hay empleados");
                            break;
                        }
                        System.out.println("Ingrese el nombre del empleado a consultar:");
                        String colaborador = scan.nextLine();
                        List<Empleado> aux = new ArrayList<>();
                        for (Empleado c : empresa.getPlanilla()) {
                            if (c.nombre.equalsIgnoreCase(colaborador))
                                aux.add(c);
                        }
                        if (aux.size() == 0)
                            System.out.println("Empleado no encontrado");
                        else if (aux.size() >= 2) {

                        } else if (aux.size() == 1) {
                            double pago = CalculadoraImpuestos.calcularPago(aux.get(0));
                            System.out.println("Salario neto: $" + aux.get(0).getSalario() +
                                    "\nSalario con descuentos: $" + pago);
                        }
                        break;
                    case 5:
                        System.out.println(CalculadoraImpuestos.mostrarTotales());
                        break;
                    case 0:
                        break;
                    default:
                        throw new InputMismatchException("Opción invalida.");
                }
            } catch (java.util.InputMismatchException ex) {
                if (ex.getMessage().equalsIgnoreCase("null")) {
                    System.out.println("Selección invalida");
                } else
                    System.out.println(ex.getMessage());
            } catch (java.util.NoSuchElementException ex) {
                System.out.println(ex.getMessage());
            }
        } while (op != 0);
    }
}
