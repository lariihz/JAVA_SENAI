package RevisaoIfElse.SituacoesCotidianas;

import java.util.Scanner;

public class ativ_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Cadastro");
        System.out.print("Insira um nome de usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Insira uma senha: ");
        String senha = scanner.nextLine();

        System.out.println();

        System.out.println("Login");
        System.out.print("Usuário: ");
        String usuarioVerif = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaVerif = scanner.nextLine();

        if (usuario.equals(usuarioVerif) && senha.equals(senhaVerif)) {
            System.out.println("Login efetuado com sucesso.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
