public class Moto implements Vehiculo {

    private String marca;
    private String color;
    private double precio;

    public Moto(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" MOTO:");
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Precio: $" + precio);
        System.out.println("----");
    }
}
