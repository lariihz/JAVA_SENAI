package POO.ativ_01.application;

import POO.ativ_01.entities.Numeros;

import java.util.Scanner;

public class app {
    //Verifique se um número é positivo ou negativo//
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            Numeros numero = new Numeros(num);

            System.out.println(numero.verificacaoPositivoNegativo());
        }
    }

