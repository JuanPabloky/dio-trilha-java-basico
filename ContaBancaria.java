import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        //Conhecer e importar classe Scanner
        Scanner ler = new Scanner(System.in);
        String numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 281.50;


        //Obter dados pelo terminal
        System.out.print("Insira o numero da conta: ");
        numeroConta = ler.nextLine();

        System.out.print("insira a agencia: ");
        agencia = ler.nextLine();

        System.out.print("Insira seu nome: ");
        nomeCliente = ler.nextLine();

        //Exibir mensagem final

        String dados = "Olá ".concat(nomeCliente) .concat(", obrigado por criar uma conta em nosso banco, sua agencia é: ").concat(agencia)
                .concat(" e do numero de conta: ").concat(numeroConta).concat(" e seu saldo ")
                .concat(String.valueOf(saldo).concat(" já esta disponivel para saque!"));

        System.out.println(dados);
    }
}
