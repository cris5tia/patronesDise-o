public class Carro implements Vehiculo {

    private String marca;
    private String color;
    private double precio;

    public Carro(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" CARRO:");
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Precio: $" + precio);
        System.out.println("----");
    }
}
