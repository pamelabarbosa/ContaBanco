import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        var agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        var numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente: ");
        var nomeCliente = scanner.next();  
        System.out.println("Por favor, digite o saldo da conta: ");
        var saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", 
                          nomeCliente, agencia, numeroConta, saldo);

    }
}
