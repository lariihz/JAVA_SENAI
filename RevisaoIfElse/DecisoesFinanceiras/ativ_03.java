package RevisaoIfElse.DecisoesFinanceiras;

import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario");
        double salario = scanner.nextDouble();

        if ( salario >= 3000){
            System.out.println("Voce pode financiar im imovel ! PARABNES! ");
        }
        else {
            System.out.println("Voce infelizmente não pode financiar seu imovel");

        }
    }
}
