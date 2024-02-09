public class instruçãoSwitch {
    public static void main(String[] args) {

             //Não só de If o homem viverá//
        
        int numero = 3;

        switch (numero) {

        case 1: //case 1 fará teste, caso não obtenha resultado, não haverá nenhuma ação//
            System.out.println("Vc digitou 1");
            break; //utilizar "break" para que o programa pare de realizar teste após encontrar o resultado//

        case 2:
            System.out.println("Vc digitou 2");
            break;
        case 3: 
            System.out.println("Vc digitou 3");
            break;
        default: //equivalente a qualquer outro caso, diferente dos que estão sendo testados//
            System.out.println("Vc digitou um valor invalido");
        }
    }
}
