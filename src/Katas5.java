import java.util.Scanner;

public class Katas5 {
    public static void main(String[] args) {

        boolean control = true; //Le dice a mi bucle que pare.
        Scanner Entrada = new Scanner(System.in);
        float total = 0;
        //String mensaje = "Elige una opción: ";


        do {
            System.out.println("--- Menú de la Cafetería JAVA ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");

            System.out.println("Ingrese el numero del producto a consumir:");
            int userInput = Entrada.nextInt();

            switch(userInput){
                case 1 -> {
                    System.out.println("Producto agregado: Café ($4.000)");
                    total += 4000;
                }
                case 2 -> {
                    System.out.println("Producto agregado: Muffin ($3.500)");
                    total += 3500;
                }
                case 3 -> {
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                    total += 7500;
                }
                case 4 -> {
                    System.out.println("Producto agregado: Jugo ($5.000)");
                    total += 5000;
                }
                case 5 -> {
                    System.out.println("Producto agregado: Té ($3.000)");
                    total += 3000;
                }
                case 6 -> {
                    System.out.println("Total a pagar: " + String.format("%.0f", total));
                    control = false; //esta es la salida, control cambia a false.
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        } while(control); //Mientras sea verdadero, haga algo.
    }
}
