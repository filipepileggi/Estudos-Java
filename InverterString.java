import java.util.Scanner;

public class InverterString {
    public static String inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        int tamanho = caracteres.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        return new String(caracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String textoOriginal = scanner.nextLine();

        String textoInvertido = inverterString(textoOriginal);
        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }
}