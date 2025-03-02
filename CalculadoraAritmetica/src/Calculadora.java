import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita a operação desejada
        System.out.print("Digite a operação (somar, subtrair, multiplicar, dividir): ");
        String operacao = scanner.next().toLowerCase();

        double resultado;
        switch (operacao) {
            case "somar":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "subtrair":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "multiplicar":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "dividir":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Use: somar, subtrair, multiplicar ou dividir.");
        }

        scanner.close();
    }
}
