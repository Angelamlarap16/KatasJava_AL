import java.util.Scanner;

public class Katas3 {
    public static void main(String[] args) {
        // Pide el precio de cada producto que el cliente pide
        // do while para varios productos |  0 para salir
        // subtotal
        // iva
        // total = subtotal + iva

        // total > 50000 - 10%
        // si ingresa
        int precios;
        int valor_productos = 0;
        int subtotal= 0;
        int total = 0 ;
        int opcion =-2;
        int IVA = 19;
        int descuento = 50000;
        int porcentaje_descuento = 10;
        Scanner Entrada = new Scanner(System.in);

        do {
            System.out.println("\n--- MENÚ DE VENTAS ---");
            System.out.println("1. Ingresar valor de un producto");
            System.out.println("0. Salir y ver total");
            System.out.print("Seleccione una opción: ");
            opcion = Entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del producto: ");
                    precios = Entrada.nextInt();
                    subtotal += precios;
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 0:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");


            }
        }while(opcion != 0);


        total = subtotal + ((subtotal*IVA)/100);
        System.out.println("subtotal : $"+subtotal);
        System.out.println("Iva(19%) : $"+(subtotal*IVA)/100);
        System.out.println("Total con iva: $"+total);

        if (total >= descuento){
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************************");
            System.out.println("*********************************************************");
            System.out.println("felicidades ganaste un decuento del 10% sobre la compra");
            System.out.println("Descuento:"+ (total*porcentaje_descuento)/100);
            total = total -((total*porcentaje_descuento)/100);

            System.out.println("total a pagar :"+ total);
            System.out.println("*********************************************************");
            System.out.println("*********************************************************");
        }




    }

}
