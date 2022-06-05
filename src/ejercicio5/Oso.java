package ejercicio5;

public class Oso {
    private int edad;
    private String nombre;
    private double peso;

    public Oso(){

    }

    public Oso(int edad,String nombre,double peso){
        this.edad=edad;
        this.nombre=nombre;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    static void gritar(){
        System.out.println("roarrr");
    }

    static void decir(){
        System.out.println("zzzz");
    }

    static void edad(){
        System.out.println("20" + "juan" + "10.5");
    }
}
