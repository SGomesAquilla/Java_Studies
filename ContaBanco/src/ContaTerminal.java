import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao banco!");
        System.out.println("Vamos realizar o seu login.");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}