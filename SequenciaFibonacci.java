import java.util.Scanner;

public class SequenciaFibonacci {
    public static boolean verificaFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;

        while (atual <= numero) {
            if (atual == numero) {
                return true;
            }

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroVerificar = scanner.nextInt();

        if (verificaFibonacci(numeroVerificar)) {
            System.out.println("O número " + numeroVerificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroVerificar + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
