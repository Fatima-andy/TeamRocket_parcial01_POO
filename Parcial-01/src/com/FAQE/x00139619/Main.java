package com.FAQE.x00139619;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre de la empresa: ");
        String nombE = scan.nextLine();

        Empresa empresa = new Empresa(nombE);
        int num = 0;

        int op;
      do{
          System.out.println("1)Agregar empleado\n2)Despedir empleado\n3)Ver lista de empleados\n4)Calcular sueldo\n" +
                  "5)Mostrar totales\n0) Salir");
          op = scan.nextInt(); scan.nextLine();

          switch(op){
              case 1:
                  System.out.print("Nombre del empleado: ");
                  String nombre = scan.nextLine();
                  System.out.print("Puesto del empleado: ");
                  String puesto = scan.nextLine();
                  System.out.print("Salario del empleado: ");
                  double salario = scan.nextDouble();  scan.nextLine();

                  empresa.addEmpleado(new Test(nombre,puesto,salario,num));

                  break;
              case 2:
                  System.out.println("Nombre del empleado a despedir: ");
                  String nombreEmp = scan.nextLine();

                  empresa.quitEmpleado(nombreEmp);
                  break;
              case 3:
                  System.out.println(empresa.getPlanilla());
                  break;


          }

      }while(op != 0);
    }
}
