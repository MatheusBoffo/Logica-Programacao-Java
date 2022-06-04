package logicaviradonojiraya.ifelse;

public class ClassificacaoNomeIdade {
    public static void main(String[] args) {
        String nome = "Joao";
        int idade = 22;
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
