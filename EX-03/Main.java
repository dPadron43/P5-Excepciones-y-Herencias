public class Main {
    public static void main(String[] args) {

        int[] array  = new int[5];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
            System.out.println("El Array que se intentó acceder es " + e.getMessage());
            System.out.println("");
            System.out.println("Error: " + e.getMessage());
        }


    }
}