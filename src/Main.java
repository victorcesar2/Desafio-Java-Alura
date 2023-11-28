import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Claudio Ramos";
        String tipoConta = "Conta Corrent";
        double saldo = 5000.00;
        int op = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Cliente: "+ nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Dísponivel: " + saldo);
        System.out.println("**************************");

        while (op != 4) {
            System.out.println("\nOperações");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Depositar valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\n Digite a opção desejada: ");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Seu saldo disponível é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Favor inserir o valor a ser depositado: ");
                    double valDep = ler.nextDouble();
                    saldo += valDep;
                    break;
                case 3:
                    System.out.println("Favor inserir o valor a ser transferido: ");
                    double valTrans = ler.nextDouble();
                    if (valTrans > saldo){
                        System.out.println("Não há saldo suficiente para realizar essa transação");
                    }else {
                        saldo -= valTrans;
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por nos escolher! Tenha um ótimo dia!");
                    break;
                default:
                    System.out.println("Essa opção é invalida.");
                    break;
            }
        }

    }
}