import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //este programa es sencillo y lo que hace es generar un numero random entre 1 y 100
        int numero = (int) (Math.random() * 100 + 1);
        System.out.println("El numero es: " + numero);
        //y mediante las excepciones, se verifica si es par o impar
        try {
            if (numero % 2 == 0) {
                throw new Exception("El numero es par");
            } else {
                throw new Exception("El numero es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}