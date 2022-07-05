import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el 1er numero 1: ");
        var a = scanner.nextDouble();

        System.out.print("Ingrese el 2ndo numero 2: ");
        var b = scanner.nextDouble();

        System.out.print("Ingrese el 3er numero 3: ");
        var c = scanner.nextDouble();

        System.out.print("Ingrese el 4to numero 4: ");
        var d = scanner.nextDouble();

        System.out.print("Ingrese el 5to numero 5: ");
        var e = scanner.nextDouble();

        scanner.close();

        var moneda = "PEN";
        var aprecio = String.valueOf(a).concat(moneda);
        var bprecio = String.valueOf(b).concat(moneda);
        var cprecio = String.valueOf(c).concat(moneda);
        var dprecio = String.valueOf(d).concat(moneda);
        var eprecio = String.valueOf(e).concat(moneda);

        var listaPrecioSoles = new ArrayList<String>();
        listaPrecioSoles.add(aprecio);
        listaPrecioSoles.add(bprecio);
        listaPrecioSoles.add(cprecio);
        listaPrecioSoles.add(dprecio);
        listaPrecioSoles.add(eprecio);

        var sumaTotal = 0.0;

        for (var precioX : listaPrecioSoles) {
            var indexSoles = precioX.indexOf("PEN");
            String precioSinMoneda = precioX.substring(0,indexSoles);
            var precioEnNumero = Double.parseDouble(precioSinMoneda);
            sumaTotal = sumaTotal + precioEnNumero;
        }

        var imprimirSumatotal = String.format("Precio total: S/ %f",sumaTotal);
        System.out.println(imprimirSumatotal);
    }
}
