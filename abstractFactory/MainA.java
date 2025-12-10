import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainA {

    /* Lista para guardar todos los vehículos */
    static List<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("5")) {

            System.out.println("\n MENU PRINCIPAL");
            System.out.println("1. Crear Carro");
            System.out.println("2. Crear Moto");
            System.out.println("3. Mostrar Vehículos Registrados");
            System.out.println("4. Limpiar Lista");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextLine();
            System.out.println("");

            switch (opcion) {

                case "1":
                    crearVehiculo(new FabricaCarro());
                    break;

                case "2":
                    crearVehiculo(new FabricaMoto());
                    break;

                case "3":
                    mostrarVehiculos();
                    break;
                
                case "4":
                    vehiculos.clear();
                    System.out.println("Lista limpiada.");
                    break;

                case "5":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

    public static void crearVehiculo(AbstractFactory factory) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = Double.parseDouble(sc.nextLine());

        Vehiculo vehiculo = factory.crearVehiculo(marca, color, precio);

        /* Se guarda en la lista */
        vehiculos.add(vehiculo);

        System.out.println("\nVehículo creado con éxito:");
        System.out.println("----");
        vehiculo.mostrarInfo();
    }

    public static void mostrarVehiculos() {

        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        System.out.println("VEHÍCULOS REGISTRADOS");

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}
