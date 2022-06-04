package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1(){
        int edad1;
        String nombre1;
        double peso1;
        int edad2;
        String nombre2;
        double peso2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------VALORES 1----------------");
        System.out.print("Ingrese la edad1: ");
        edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la nombre1: ");
        nombre1= scanner.nextLine();
        System.out.print("Ingrese el peso1: ");
        peso1 = scanner.nextDouble();
        System.out.println("---------------------VALORES 2----------------");
        System.out.print("Ingrese la edad2: ");
        edad2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la nombre2: ");
        nombre2= scanner.nextLine();
        System.out.print("Ingrese el peso2: ");
        peso2 = scanner.nextDouble();
        scanner.close();

        var oso1=new Oso();
        oso1.setEdad(edad1);
        oso1.setPeso(peso1);
        oso1.setNombre(nombre1);

        var oso2=new Oso(edad2,nombre2,peso2);

        System.out.println("---------------------RESULTADOS----------------");

        System.out.println("Nombre 1: " +oso1.getNombre());
        System.out.println("Nombre 2: " +oso2.getNombre());

        if (oso1.getNombre().equals(oso2.getNombre())){
            System.out.println("Nombres Iguales");
        }else {
            System.out.println("Nombres Distintos");
        }

        System.out.println("Edad 1: " +oso1.getEdad());
        System.out.println("Edad 2: " +oso2.getEdad());

        if (oso1.getEdad()==oso2.getEdad()){
            System.out.println("Edades Iguales");
        }else {
            System.out.println("Edades Distintos");
        }

        System.out.println("Peso 1: " +oso1.getPeso());
        System.out.println("Peso 2: " +oso2.getPeso());

        if (oso1.getPeso()==oso2.getPeso()){
            System.out.println("Pesos Iguales");
        }else {
            System.out.println("Pesos Distintos");
        }
    }
}
