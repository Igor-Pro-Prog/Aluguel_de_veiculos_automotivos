import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("1 - Cadastrar veículo");
                System.out.println("2 - Cadastrar cliente");
                System.out.println("3 - Cadastrar gerente");
                System.out.println("4 - Sair");
                System.out.print("Digite a opção desejada: ");
                opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite a marca do veículo: ");
                        String marca = sc.nextLine();
                        System.out.print("Digite o modelo do veículo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Digite o ano do veículo: ");
                        int ano = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Digite o valor do aluguel do veículo: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Digite a placa do veículo: ");
                        String placa = sc.nextLine();
                        System.out.print("Digite a cor do veículo: ");
                        String cor = sc.nextLine();
                        System.out.print("Digite o tipo do veículo: ");
                        String tipo = sc.nextLine();
                        Veiculo veiculo = new Veiculo(marca, modelo);
                        System.out.println("Veículo cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.print("Digite o nome do cliente: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite o CPF do cliente: ");
                        String cpf = sc.nextLine();
                        Cliente cliente = new Cliente(nome, cpf);
                        System.out.println("Cliente cadastrado com sucesso!");
                        break;
                    case 3:
                        System.out.print("Digite o nome do gerente: ");
                        String nomeGerente = sc.nextLine();
                        System.out.print("Digite a senha do gerente: ");
                        String senha = sc.nextLine();
                        Gerente gerente = new Gerente(nomeGerente, senha);
                        System.out.println("Gerente cadastrado com sucesso!");
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "menu []";
    }
}
