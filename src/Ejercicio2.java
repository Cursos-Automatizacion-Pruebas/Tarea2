import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        double a;
        double b;
        double c;
        double d;
        double e;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el 1er numero 1: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese el 2ndo numero 2: ");
        b = scanner.nextDouble();
        System.out.print("Ingrese el 3er numero 3: ");
        c = scanner.nextDouble();
        System.out.print("Ingrese el 4to numero 4: ");
        d = scanner.nextDouble();
        System.out.print("Ingrese el 5to numero 5: ");
        e = scanner.nextDouble();
        scanner.close();

        String moneda = "PEN";
        String aprecio = String.valueOf(a).concat(moneda);
        String bprecio = String.valueOf(b).concat(moneda);
        String cprecio = String.valueOf(c).concat(moneda);
        String dprecio = String.valueOf(d).concat(moneda);
        String eprecio = String.valueOf(e).concat(moneda);

        List<String> listaPrecioSoles = new ArrayList<>();
        listaPrecioSoles.add(aprecio);
        listaPrecioSoles.add(bprecio);
        listaPrecioSoles.add(cprecio);
        listaPrecioSoles.add(dprecio);
        listaPrecioSoles.add(eprecio);

        double sumaTotal = 0.0;

        for (var precioX : listaPrecioSoles) {
            var indexSoles = precioX.indexOf("PEN");
            String precioSinMoneda = precioX.substring(0,indexSoles);
            double precioEnNumero = Double.parseDouble(precioSinMoneda);
            sumaTotal = sumaTotal + precioEnNumero;
        }

        // String.format: sirve para xpath dinamico
        var msg = String.format("Precio total: S/ %f",sumaTotal);
        System.out.println(msg);
    }
}
