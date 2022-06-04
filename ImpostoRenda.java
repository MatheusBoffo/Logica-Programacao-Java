package logicaviradonojiraya.ifelse;

public class ImpostoRenda {
    public static void main(String[] args) {
        double salario = 1800;
        if (salario <= 1500){
            System.out.println("ISENTO");
        } else if (salario >= 1501 && salario <= 1599) {
            System.out.println("7.5% " + salario * 0.075);
        } else if (salario >= 1600 && salario <= 1699) {
            System.out.println("10% " + salario * 0.10);
        } else if (salario >= 1700 && salario <= 1799) {
            System.out.println("15% " + salario * 0.15);
        } else System.out.println("20% " + salario * 0.20);
    }
}
