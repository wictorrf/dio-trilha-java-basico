import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        String Agencia;
        String NomeCliente;
        float Saldo;

        System.out.println("Por favor, digite o número da conta.");
        System.out.println("Número: ");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite o número da agência.");
        System.out.println("Agência: ");
        Agencia = scan.nextLine();
        System.out.println("Por favor, digite seu nome.");
        System.out.println("Nome: ");
        NomeCliente = scan.nextLine();
        System.out.println("Para finalizar, digite seu saldo.");
        System.out.println("Saldo: ");
        Saldo = scan.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + Saldo + " já está disponivel para saque");
    }
}
