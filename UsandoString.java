import java.util.Scanner;

public class UsandoString {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome");
        nome = teclado.next();

        System.out.println("Professor" + nome);
        teclado.close();


    }
}