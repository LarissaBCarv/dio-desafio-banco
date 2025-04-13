import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       dados (args);
    
}
    
        public static void dados (String [] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, insira o númera da conta: ");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, insira o o número da sua agência: ");
            String agencia = scanner.nextLine();
            
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("\n Olá "+ nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque!");
            
        }
    }

