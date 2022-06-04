package logicaviradonojiraya.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        char sexo = 'M';
        int idade = 17;
        if ((sexo == 'M' || sexo == 'F') && idade < 18){
            System.out.println("Alistamento nao Permitido");
        } else if (sexo == 'M'&& idade >= 18) {
            System.out.println("Alistamento Obrigatorio");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Voce deseja se alistar?");
        } else System.out.println("Alistamento nao permitido");
    }
}
