package tp2;

public class CalculadoraTeste {

    public static void main(String[] args) {

        float numeroA = Float.valueOf(args[0]);
        float numeroB = Float.valueOf(args[1]);
        float resultado = 0;
        String nome = args[3];
        int operacao = 0; //1 - Soma; 2 - Subtração; 3 - Divisão; 4 - Multiplicação

        System.out.println("Escolha a operação desejado no menu abaixo");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        operacao = Integer.valueOf(args[2]);

        if (operacao == 1) {
            resultado = numeroA + numeroB;
            System.out.println("[" + nome + "]" + " Soma: " + numeroA + " + " + numeroB + " = " + resultado);
        } else if (operacao == 2) {
            resultado = numeroA - numeroB;
            System.out.println("[" + nome + "]" + " Subtração: " + numeroA + " - " + numeroB + " = " + resultado);
        } else if (operacao == 3) {
            resultado = numeroA / numeroB;
            System.out.println("[" + nome + "]" + " Divisão: " + numeroA + " ÷ " + numeroB + " = " + resultado);
        } else if (operacao == 4) {
            resultado = numeroA * numeroB;
            System.out.println("[" + nome + "]" + " Multiplicação: " + numeroA + " x " + numeroB + " = " + resultado);
        }else{
            System.out.println("[" + nome + "]" + "Operação Inválida: " + operacao + "!!!!");
        }
    }
}
