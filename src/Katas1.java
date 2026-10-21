import java.util.Scanner;

public class Katas1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        float valor_producto = 0;
        int valor_porcentaje = 0;
        float total_pagar = 0;

    System.out.println("");
    System.out.println("Bienvenido al restaurante JAVA");
    System.out.println("Ingresa el valor de la compra: ");
    valor_producto = Entrada.nextFloat();
    System.out.println("Ingresa el valor de la propina que quieres dar: ");
    valor_porcentaje = Entrada.nextInt();

    total_pagar = valor_producto + ((valor_porcentaje*valor_producto)/100);

    Integer valor_procentaje_mejorado =  valor_porcentaje;
        if (valor_producto > 0){
           if (valor_porcentaje > 0 && valor_porcentaje <= 100) {
                System.out.println("Total a pagar: " + total_pagar);
                switch (valor_procentaje_mejorado) {
                    case Integer temporal when temporal > 30 -> System.out.println("Propina generosa");
                    case Integer temporal when temporal < 5 -> System.out.println("Propina muy baja");
                    default -> System.out.println("");
                }
            }else{
                System.out.println("Error: porcentaje inválido");
            }
        }else{
            System.out.println("Error: total inválido");
        }
    }
}

