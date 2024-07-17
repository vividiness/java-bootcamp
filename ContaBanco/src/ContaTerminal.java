import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    String nomeCliente;
    String agencia;
    int numeroConta;
    float saldo;

    Scanner input = new Scanner(System.in);

    System.out.println("Usuário: ");
    nomeCliente = input.nextLine();

    System.out.println("Agencia ");
    agencia = input.nextLine();

    System.out.println("Número da conta: ");
    numeroConta = input.nextInt();

    System.out.println("Saldo:  ");
    saldo = input.nextFloat();

    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
  }
}