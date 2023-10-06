import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * TODO: Conhecer e importar a classe Scanner
         * 
         * Exibir as mensagens para o nosso usuário
         * 
         * Obter pelo Scanner os valores digitados no Terminal
         * 
         * Exibir a mensagem "Conta Criada
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, Digite o código da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu segundo nome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo da conta (Sem pontos ou virgulas) : ");
        double saldo = scanner.nextDouble();

        System.out.println("Bem vindo " + nome + " " + sobrenome
                + ", Obrigado por criar sua conta em nosso banco, sua agência será: " + agencia + ", conta: " + numero
                + ", e seu saldo é de: " + saldo + ", já disponivel para saques!.");

    }
}
