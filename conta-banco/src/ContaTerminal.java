import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Inicio do Scanner 
        Scanner leitor = new Scanner(System.in);
        
        // Entrada de Dados
        System.out.print("Por Favor, Digite seu Nome? ");
        String nome = leitor.nextLine();
        
        System.out.print("Por Favor, Digite o número da Agência: ");
        String agencia = leitor.nextLine();

        System.out.print("Digite o número de sua Conta: ");
        int numeroDeContaBancaria = leitor.nextInt();

        System.out.print("Por Favor, Informe seu saldo em Conta: ");
        double saldo = leitor.nextDouble();
        
        // Saida de Dados
        System.out.println("Olá " + nome + "! Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ". Número da Conta bancaria: " + numeroDeContaBancaria + " e seu saldo de " + saldo + " já está disponível para saque");

    }
}
