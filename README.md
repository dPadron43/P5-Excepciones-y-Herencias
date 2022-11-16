#Explicación

A diferencia de practicas anteriores, este no me costó mucho trabajo
entender como hacerlos y si tenia alguna duda, lo conseguía en internet
sin mucha dificultad por lo que sentí más confianza que el resto.

###Ejercicio 3

```java
public class Main {
    public static void main(String[] args) {

        int[] array  = new int[5];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
            System.out.println("El Array que se intenta acceder es " + e.getMessage());
            System.out.println("");
            System.out.println("Error: " + e.getMessage());
        }


    }
}
```

###Ejercicio 4

```java
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
```