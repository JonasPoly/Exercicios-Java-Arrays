public class OrdemInversa {
    public static void main(String[] args) throws Exception {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };

        System.out.print("O vetor é: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nO vetor invertido é: ");
        for (int i = (vetor.length - 1); 1 >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
