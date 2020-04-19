package com.FAQE.x00139619;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre de la empresa: ");
        String nombE = scan.nextLine();
        Empresa empresa = new Empresa(nombE);

        int op;
      do{
          System.out.println("1)Agregar empleado\n2)Despedir empleado\n3)Ver lista de empleados\n4)Calcular sueldo\n" +
                  "5)Mostrar totales\n0) Salir");
          op = scan.nextInt(); scan.nextLine();

          switch(op){
              case 1:
                  empresa.addEmpleado();
                  //funciona casi del todo noc porque pero al agregar otro empleado se salta el nombre :(
                  // pero al imprimir la lista funciona bien, solo q el nombre esta vacio
                  break;
              case 2:
                  // solo para ver la lista de los empleados
                  System.out.println(empresa.getPlanilla());
                  break;
              case 3:
                  //noc porq no sirve, en si eso creo q es, revisare mas tarde, porq al imprimir la lista again
                  // aun incluye al empleado despedido :p
                  System.out.println("Nombre del empleado a despedir: ");
                  String nombre = scan.nextLine();

                  empresa.quitEmpleado(nombre);
                  break;

          }

      }while(op != 0);
    }
}
