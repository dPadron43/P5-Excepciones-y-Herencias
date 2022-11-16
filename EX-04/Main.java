import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;

            System.out.println("Introduce un numero: ");
            //con este bucle while se controla el caracter introducido, asi dando el mensaje de que se debe
        //introducir un numero y no un caracter
            while (!sc.hasNextInt()) {
                System.out.println("Incorrecto. Introduce un numero! ");
                sc.next();
            }
            i = sc.nextInt();

            System.out.println("El numero introducido es: " + i + " por lo tanto entero y es valido!");

    }
}