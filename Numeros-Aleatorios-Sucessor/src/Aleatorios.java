import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[1] = numero;

        }
        System.out.print("Os números aleatórios são: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero + " ");
        }
        System.out.print("\nOs sucessores dos números aleatórios são: ");
        for (int numero : numerosAleatorios) {

            System.out.print((numero + 1) + " ");
        }

    }
}
