import java.util.Scanner;


public class Media {
    public static void main(String[] args) {
        double[] Num = new double[50];
        double media, soma = 0;


        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");


            Num[i] = scanner.nextDouble();
            soma += Num[i];
        }


        media = soma / 10;
        System.out.println("A média dos números digitados é: " + media);
        
        scanner.close();
    }
}
