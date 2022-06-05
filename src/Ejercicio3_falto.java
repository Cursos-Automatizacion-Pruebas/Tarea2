import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3_falto {
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

        for (int i=1; i<=n; i++) {
            lista.add(i);
            System.out.println("----: " + i);
        }
    }
}
