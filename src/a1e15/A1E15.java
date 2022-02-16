import java.util.Scanner;

public class A1E15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables
        int Numero;

        //pedir valor
        System.out.print("Ingrese el nuemero a evaluar: ");
        Numero = scanner.nextInt();

        //condiciones para ver en cual cumple en numero ingresado
        if (Numero == 0) {

            System.out.println("El numero es nulo");

        } else if (Numero > 0) {

            System.out.println("El numero es positivo");

        } else {

            System.out.println("El numero es negativo");

        }
    }

}
