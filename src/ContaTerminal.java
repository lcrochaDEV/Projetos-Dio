import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua Agência: ");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome: ");
        scanner.useDelimiter("\n");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu Saldo: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + Agencia + " conta, " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}
