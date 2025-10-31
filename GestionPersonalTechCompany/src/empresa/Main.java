package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("*** REGISTRO EMPLEADO ***");
            System.out.println("Ingrese el nombre del empleado: ");
            String nombreE = sc.nextLine();
            System.out.println("Ingrese edad del empleado: ");
            int edadE = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el salario base del empleado: ");
            double salarioE = Double.parseDouble(sc.nextLine());

            Empleado e1 = new Empleado(nombreE, edadE, salarioE);

            System.out.println("\n*** REGISTRO GERENTE ***");
            System.out.println("Ingrese nombre del gerente: ");
            String nombreG = sc.nextLine();
            System.out.println("Ingrese edad del gerente: ");
            int edadG = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el salario base del gerente: ");
            double salarioG = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese el numero de empleados a cargo del gerente: ");
            int numEmp = Integer.parseInt(sc.nextLine());

            Gerente g1 = new Gerente(nombreG, edadG, salarioG, numEmp);

            System.out.println("\n*** REGISTRO PRACTICANTE ***");
            System.out.println("Ingrese nombre del aprendiz: ");
            String nombreAp  = sc.nextLine();
            System.out.println("Ingrese edad del aprendiz: ");
            int edadAp = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el numero de horas de practicas: ");
            int horasDePracticante = Integer.parseInt(sc.nextLine());

            Practicante Ap1 = new Practicante(nombreAp, edadAp, horasDePracticante);

            //toString
            System.out.println(e1.toString());
            System.out.println(g1.toString());
            System.out.println(Ap1.toString());

            //Polimorfismo: referencia base
            Persona[] personas = new Persona[]{e1,g1,Ap1};
            for (Persona p : personas){
                System.out.println(p.describir());
                System.out.println("Pago = " + p.calcularPago());
            }

            //Sobrecarga de Empleado
            System.out.println("Ingrese bono para el empleado: ");
            double bonoE = Double.parseDouble(sc.nextLine());
            System.out.println("Pago empleado con bono: " + e1.calcularPago(bonoE));

            System.out.println(e1.trabajar());
            System.out.println("Ingrese las horas trabajadas por el empleado: ");
            int horasE = Integer.parseInt(sc.nextLine());
            System.out.println(e1.calcularPago(horasE));

            //Sobrecarga y sobrescritura en Gerente
            System.out.println(g1.trabajar());
            System.out.println("Ingrese horas trabajadas del gerente: ");
            int horasG = Integer.parseInt(sc.nextLine());
            System.out.println(g1.trabajar(horasG));

            System.out.println("Ingrese bono variable para el gerente:");
            double bonoVar = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese bono de liderazgo para el gerente:");
            double bonoLider = Double.parseDouble(sc.nextLine());
            System.out.println("Pago gerente con bonos: " + g1.calcularPago(bonoVar, bonoLider));

            //Interfaz y reporte
            System.out.println(((Reportable)e1).generarReporte());
            System.out.println("¿Gerente implementa Reportable? " + (g1 instanceof Reportable));
        }
    }
}
