import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Recebendo os dados via terminal
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        // Exibindo a mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}


