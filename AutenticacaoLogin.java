package logicaviradonojiraya.ifelse;

public class AutenticacaoLogin {
    public static void main(String[] args) {
        String login = "jamile";
        int senha = 123456;
        if (login == "jamile" && senha == 123456){
            System.out.println("Welcome!!!");
        } else System.out.println("Login ou senha errados");
    }
}
