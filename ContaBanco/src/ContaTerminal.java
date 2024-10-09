import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroConta;
        String numeroAgencia, nomeCliente;
        float saldoCliente;

        System.out.println("Por favor, digite o número de Conta: ");
        numeroConta = sc.nextInt();

        // Consumir el salto de línea que queda en el buffer
        sc.nextLine();

        // Pedir número de agencia
        System.out.println("Por favor, digite o número de Agência: ");
        numeroAgencia = sc.nextLine();

        // Pedir nombre del cliente
        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();

        // Pedir saldo
        System.out.println("Por favor, digite o saldo da Conta: ");
        saldoCliente = sc.nextFloat();

        System.out.printf("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua  Agência é: " + numeroAgencia + ", Conta: " + numeroConta + " e seu Saldo: " + saldoCliente + "0 Já está disponível para saque." );

        System.out.println();
    }
}