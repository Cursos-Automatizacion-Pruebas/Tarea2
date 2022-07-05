package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
     }

     static void ex1(){
         Scanner scanner = new Scanner(System.in);

         System.out.print("Ingrese el ID: ");
         var id= scanner.nextLine();

         System.out.print("Ingrese la marca: ");
         var marca= scanner.nextLine();

         System.out.print("Ingrese el peso: ");
         var peso = scanner.nextDouble();

         System.out.print("Ingrese el precio: ");
         var precio = scanner.nextDouble();

         System.out.print("Ingrese el ramEnGB: ");
         var ramEnGb = scanner.nextInt();

         scanner.close();

         var computadora=new Computadora(id,precio,marca);
         computadora.setPeso(peso);
         computadora.setRamEGb(ramEnGb);

         System.out.println("El id es: " + computadora.getId());
         System.out.println("El Marca es: " + computadora.getMarca());
         System.out.println("El Peso es: " + computadora.getPeso());
         System.out.println("El precio es: " + computadora.getPrecio());
         System.out.println("El ramEnGb es: " + computadora.getRamEGb());
     }
}
