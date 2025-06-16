import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Numero da Conta
        int acountNumber = (int) (Math.random() * 100);

        // Agencia
        System.out.print("Por favor, digite o número da Agência: ");
        String agency = input.next();

        // Nome do Cliente
        System.out.print("\nPor favor, digite o nome do Cliente: ");
        String name = input.next();

        // Saldo Depositado
        System.out.print("\nPor favor, digite o saldo a ser depositado: ");
        double balance = input.nextDouble();
        double teste = 100;

        // Mensagem final
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", name, agency, acountNumber, balance);
    }
}