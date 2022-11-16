import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {

        int i;
        Scanner sc = new Scanner(System.in);

        //se debe introducir un numero negativo para que se lance la excepcion y asi ver el resultado correcto del programa
        //de no ser asi, el programa se ejecutara sin mostrar la excepcion
        System.out.println("Introduce un numero: ");
        i = sc.nextInt();

        if (i < 0) {
            throw new NegativeNumberException("El numero es negativo");
        }

    }
}