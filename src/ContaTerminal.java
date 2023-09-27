import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = null;
        String nomeCliente = null;
        double saldo = 0;

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está" +
                " disponível para saque");
    }

}
