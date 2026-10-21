import java.util.Scanner;

public class Katas4 {
    public static void main(String[] args) {

        int dia = 0;
        int hora = 0;


        Scanner Entrada = new Scanner(System.in);

        System.out.println("Horario cafetería JAVA");

        System.out.println("Ingrasa el día (1=Lunes ; 7=Domingo): ");
        dia = Entrada.nextInt();

        System.out.println("Ingresa la hora (0-23): ");
        hora = Entrada.nextInt();

        while(dia < 1 || dia > 7){
            System.out.println("Formato erroneo. Ingrese del 1 al 7: ");
            dia = Entrada.nextInt();
        }


        System.out.println("Ingrese la hora (0 a 23):");
        hora = Entrada.nextInt();


        while(hora < 0 || hora > 23){
            System.out.println("Formato erroneo. Ingrese nuevamente la hora: ");
            hora = Entrada.nextInt();

        }

        boolean memoria = false;
        switch (dia){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                memoria = (hora >= 6 && hora < 20);
                break;

            case 6:
                memoria = (hora >= 7 && hora < 14);
                break;
            case 7:
                memoria = false;
                break;
            default:
                System.out.println("Ingresa un numero del 1 a 7");
        }

        if (memoria) {
            System.out.println("La cafetería está abierta.");
        } else {
            System.out.println("La cafetería está cerrada.");
        }


    }
}