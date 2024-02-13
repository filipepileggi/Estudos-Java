import java.util.Scanner;

public class exercícioComFor {
    public static void main(String[] args) {

        double nota1, nota2, media;
        Scanner teclado = new Scanner (System.in);

        for(int na = 1; na<=1000;na++) {
        System.out.println("Aluno: " + na);
        System.out.println("Digite a nota 1: ");
        nota1=teclado.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2=teclado.nextDouble();

        media = (nota1+nota2)/2;
        System.out.println("Média: " + media);

        
        }
    }
}