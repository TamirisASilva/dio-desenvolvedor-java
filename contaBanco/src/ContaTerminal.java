import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nome;
        float saldo;

        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite sua agência: ");
        agencia = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextFloat();



        System.out.println("Olá " + nome + "!. Obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo "+ saldo + ". Já disponível para saque.");

    }
}
