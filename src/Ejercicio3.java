import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1() {
        Scanner scanner = new Scanner(System.in); //inicializamos el scanner

        System.out.print("Ingresar numero del 1 al 10: ");
        var n = scanner.nextInt();

        System.out.print("Ingresar numero del 1 al 20: ");
        var m = scanner.nextInt();

        scanner.close(); //cerrando el scanner

        var lista = new ArrayList<Integer>();

        for (var i=1; i<=n; i++) {
            lista.add(i);
        }

        try {
            lista.get(m);
            System.out.println("jijiji no me caí");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("pipipippipi, me cai");
        }finally {
            System.out.println("así se caiga o no, yo sigo estudiando mucho");
        }
    }
}