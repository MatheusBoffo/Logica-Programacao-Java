package logicaviradonojiraya.ifelse;

import java.util.Scanner;

public class ClassificacaoNomeIdadeComTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Nome do Participante:");
        String nome = input.next();
        System.out.println("Idade do Participante:");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " participara da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participara da categoria juvenil" );
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participara da categoria Pre-Adulto" );
        } else if (idade >= 20) {
            System.out.println(nome + " participar da categoria adulto");
        }

    }
}
