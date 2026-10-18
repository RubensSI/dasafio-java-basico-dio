import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        var entrada = new Scanner(System.in);

        System.out.println("Crie sua conta");
        System.out.println();

        System.out.println("Digite o numero da conta");
        int numero = entrada.nextInt();

        System.out.println("Digite sua agencia");
        String agencia = entrada.next();

        System.out.println("Digite seu nome: ");
        String nome = entrada.next();

        System.out.println("Digite o saldo: ");
        double saldo = entrada.nextDouble();

        var mesagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para uso",
                nome, agencia, numero, saldo);
        System.out.println(mesagem);

        entrada.close();
    }
}
