
import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        repositoriocarro repositoriocarro = new repositoriocarro();
		repositorioclientes repositorioclientes = new repositorioclientes();
        do {
        	System.out.println("Seja bem vindo a Localiza 2.0\n"
        	+ "Por favor, informe seu tipo de usuário (gerente/cliente)\n"
        	+ "Digite 1 para: Gerente \n"
        	+ "Digite 2 para: Cliente  \n"
        	+ "Digite 3 para: Sair do programa");
        	int opcao = Integer.valueOf(scanner.nextLine());
        
        	switch(opcao){
        		case 1:  
        			System.out.println("vc escolheu a opcao Gerente");
        			System.out.println("Digite o login do gerente:(admin)");
        			String login = scanner.nextLine();
        			System.out.println("Digite a senha do gerente:(admin)");
        			String senha = scanner.nextLine();
        			if (login.equalsIgnoreCase("admin") && senha.equals("admin")) {
        				System.out.println("Login de gerente bem-sucedido!");
        				boolean sair1 = false;
        				do {
        					System.out.println("Gerente o que deseja fazer:\n"
        					+ "Digite 1 para: cadastrar Veiculo \n"
        					+ "Digite 2 para: remover Veiculo \n"
        					+ "Digite 3 para: cadastrar Cliente \n"
        					+ "Digite 4 para: remover Cliente \n" 
        					+ "Digite 5 para: Sair do menu gerente \n"); 
        					int opcao1 = Integer.valueOf(scanner.nextLine());
        					switch(opcao1){
        						case 1:
        							System.out.println("vc escolheu cadastrar veiculo");
        							System.out.println("Digite o nome do modelo:");
        							String modelo = scanner.nextLine();
        							System.out.println("Digite o nome da marca:");
        							String marca = scanner.nextLine();
        							System.out.println("Digite o codigo:");
        							int codigo = Integer.valueOf(scanner.nextLine());
        							veiculo veiculo = new veiculo();
        							veiculo.setModelo(modelo);
        							veiculo.setMarca(marca);
        							veiculo.setCodigo(codigo);
        							repositoriocarro.cadastrarVeiculo(veiculo);
        							System.out.println("veiculo cadastrado");
        							repositoriocarro.listar();
        							break;

        						case 2:
        							System.out.println("vc escolheu remover veiculo");
        							System.out.println("digite o codigo do carro q deseja remover");
        							int cod = Integer.valueOf(scanner.nextLine());
        							repositoriocarro.deletarVeiculo(cod);
        							repositoriocarro.listar();
        							break;

        						case 3:
        							System.out.println("vc escolheu cadastrar cliente");
        							System.out.println("Digite o nome do cliente:");
        							String nome = scanner.nextLine();
        							System.out.println("Digite o cpf do cliente:");
        							String cpf = scanner.nextLine();
        							System.out.println("Digite o numero:");
        							int numero = Integer.valueOf(scanner.nextLine());
        							cliente cliente = new cliente(nome, cpf, numero);
        							repositorioclientes.cadastrarCliente(cliente);
        							System.out.println("cliente cadastrado");
        							repositorioclientes.listar();
        							break;

        						case 4:
        							System.out.println("vc escolheu remover cliente");
									System.out.println("Digite o nome do cliente:");
        							String delNome = scanner.nextLine();
        							System.out.println("Digite o cpf do cliente:");
        							String delCpf = scanner.nextLine();
        							System.out.println("digite o numero do cliente q deseja remover");
        							int delNum = Integer.valueOf(scanner.nextLine());
									cliente delCliente = new cliente(delNome, delCpf, delNum);
        							repositorioclientes.deletarCliente(delCliente);
        							repositorioclientes.listar();
        							break;
        						
        						case 5:
        							System.out.println("SAINDO DO MENU GERENTE...");
        							sair1 = true;
        							break;
        							
        						default:
        		        			System.out.println("OPÇÃO NÃO EXISTE!");
        		        			break;
        					}
        				}while(!sair1);
        			}else{
        				System.out.println("login ou senha errado");
        			}
        			break;
          
        		case 2:
        			System.out.println("vc escolheu a opcao Cliente");
        			System.out.println("Digite o login do cliente:");
        			String login2 = scanner.nextLine();
        			System.out.println("Digite a senha do cliente:");
        			String senha2 = scanner.nextLine();
        			if (login2.equalsIgnoreCase("1") && senha2.equals("1")) {
        				System.out.println("Login de cliente bem-sucedido!");
        				boolean sair2 = false;
        				do {
        					System.out.println("Clinte o que deseja fazer:\n"
        					+ "Digite 1 para: alugar veiculo \n"
        					+ "Digite 2 para: devolver veiculo\n"
        					+ "Digite 3 para: pesquisar veiculo\n"
        					+ "Digite 4 para: ver disponibilidade do veiculo\n"
        					+ "Digite 5 para: Sair do menu cliente \n");                 
        					int opcao2 = Integer.valueOf(scanner.nextLine());
        					switch(opcao2){            
            					case 1:
            						System.out.println("vc escolheu alugar veiculo");
            						System.out.println("Digite o nome do modelo:");
            						String modelo = scanner.nextLine();
            						System.out.println("Digite o cpf do cliente:");
            						String cpf = scanner.nextLine();
            						repositoriocarro.alugarVeiculo(modelo, repositorioclientes.buscarCliente(cpf));
            						     						
            						break;
            					
            					case 2:
            						System.out.println("vc escolheu devolver veiculo");
            						break;
            						
            					case 3:
            						System.out.println("vc escolheu pesquisar veiculo");
            						break;
            					
            					case 4:
            						System.out.println("vc escolheu ver disponibilidade do veiculo ");
            						break;
            					
            					case 5:
            						System.out.println("SAINDO DO MENU CLIENTE...");
        							sair2 = true;
        							break;
        							
            					default:
        		        			System.out.println("OPÇÃO NÃO EXISTE!");
        		        			break;
        					}
        				}while(!sair2);
        			}else{
        				System.out.println("login ou senha errado");
        			}
        			break;
        			
        		case 3:
        			System.out.println("FIM DO PROGRAMA, SAINDO...");
        			sair = true;
        			break;
        		default:
        			System.out.println("OPÇÃO NÃO EXISTE!");
        			break;
        	} 
        }while(!sair);
        scanner.close();
	}
	
}