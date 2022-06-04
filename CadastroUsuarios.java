package logicaviradonojiraya.ifelse;

import java.util.Scanner;

public class CadastroUsuarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = input.next();
        // para comprar strings devemos utilizar a variavel .equals trata-se de uso exclusivo para comprar string.
        // ja o equals ignore case sera para os casos que independente se a palavra sera maiscula ou miniscula ela em si sera comparada
        if (nome.equalsIgnoreCase("admin") || nome.equals("administrador")) {
            System.out.println(nome + " Usuario Invalido");
        } else {
            System.out.println(nome + " Cadastrado com sucesso");
        }
    }
}
