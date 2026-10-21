import java.util.Scanner;

public class Katas2 {
    public static void main(String[] args) {

        //Variables
        String nombre_bebida;
        double temperatura_bebida;

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la cafetería JAVA");

        System.out.println("Ingresa el nombre de tu bebida: ");
        nombre_bebida = Entrada.nextLine();

        System.out.println("Ingresa la temperatura");
        temperatura_bebida = Entrada.nextDouble();

        Double temperatura_bebida_cambiada = temperatura_bebida;

        String temperatura_final = switch (temperatura_bebida_cambiada){
            case null -> ("Temperatura no definida");
            case Double temporal when temporal > 60 -> "Caliente";
            case Double temporal when temporal >= 30 -> "Templada";
            case Double temporal -> "Fría";
        };
        System.out.println(nombre_bebida+ " : " + temperatura_final);
    }
}
