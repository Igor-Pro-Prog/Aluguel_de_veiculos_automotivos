package menu;
import java.util.Scanner;
import repositorio.repositoriocarro;
import repositorio.repositorioclientes;
import dados.cliente;
import dados.gerente;
import dados.pessoa;
import dados.veiculo;

public class menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        repositoriocarro repositoriocarro = new repositoriocarro();
		repositorioclientes repositorioclientes = new repositorioclientes();
		System.out.println("Primeiramente cadastre-se como um Cidadão");
		System.out.println("DIGITE SEU NOME:");
		String nome = scanner.nextLine();
		System.out.println("DIGITE SEU CPF:");
		int cpf = Integer.valueOf(scanner.nextLine());
		pessoa pessoa = new pessoa(nome,cpf);
		System.out.println("Cadastro feito:");
		pessoa.mostrarDados();
		System.out.println("AGORA CADASTRE-SE COMO UM GERENTE");
		System.out.println("DIGITE O LOGIN QUE DESEJA CADASTRAR:");
		String loginGer = scanner.nextLine();
		System.out.println("DIGITE A SENHA QUE DESEJA CADASTRAR:");
		int senhaGer = Integer.valueOf(scanner.nextLine());
		gerente gerente = new gerente(nome, cpf, loginGer, senhaGer);
		System.out.println("O PROGRAMA COMEÇA COM UM CARRO E UM CLIENTE CADASTRADO:");
		repositoriocarro.listar();
		repositorioclientes.listar();
		
        do {
        	System.out.println("Seja bem vindo a Localiza 2.0\n"
        	+ "Por favor, informe seu tipo de usuário selecionando um número (gerente/cliente)\n"
        	+ "Digite 1 para: Gerente \n"
        	+ "Digite 2 para: Cliente  \n"
        	+ "Digite 3 para: Sair do programa");
        	int opcao = Integer.valueOf(scanner.nextLine());
        	switch(opcao){
        		case 1:  
        			System.out.println("vc escolheu a opcao Gerente");
        			System.out.println("Digite o login do gerente:");
        			String loginteste = scanner.nextLine();
        			System.out.println("Digite a senha do gerente:");
        			int senhateste = Integer.valueOf(scanner.nextLine());
        			if (loginteste.equals(loginGer) && senhateste == gerente.getsenhaGer()) {
        				System.out.println("Login de gerente bem-sucedido!");
        				boolean sair1 = false;
        				do {
        					System.out.println("Gerente o que deseja fazer:\n"
        					+ "Digite 1 para: cadastrar Veiculo \n"
        					+ "Digite 2 para: remover Veiculo \n"
        					+ "Digite 3 para: cadastrar Cliente \n"
        					+ "Digite 4 para: remover Cliente \n" 
        					+ "Digite 5 para: listar Clientes \n"
        					+ "Digite 6 para: mudar login ou senha\n"
        					+ "Digite 7 para: Sair do menu gerente \n"); 
        					int opcao1 = Integer.valueOf(scanner.nextLine());
        					switch(opcao1){
        						case 1:
        							System.out.println("vc escolheu cadastrar veiculo");
        							System.out.println("Digite o nome do modelo(letras):");
        							String modelo = scanner.nextLine();
        							System.out.println("Digite o nome da marca(letras):");
        							String marca = scanner.nextLine();
        							System.out.println("Digite o codigo(numeros):");
        							int codigo = Integer.valueOf(scanner.nextLine());
        							veiculo veiculo = new veiculo(modelo,marca,codigo);
        							repositoriocarro.cadastrarVeiculo(veiculo);
        							System.out.println("veiculo cadastrado");
        							repositoriocarro.listar();
        							break;

        						case 2:
        							System.out.println("vc escolheu remover veiculo");
        							System.out.println("digite o codigo do carro:");
        							int cod = Integer.valueOf(scanner.nextLine());    							
        							repositoriocarro.deletarVeiculo(cod);
        							repositoriocarro.listar();
        							break;

        						case 3:
        							System.out.println("vc escolheu cadastrar cliente");
        							System.out.println("Digite o nome do cliente(letras):");
        							String nome3 = scanner.nextLine();
        							System.out.println("Digite o cpf do cliente(letras):");
        							int cpf3 = Integer.valueOf(scanner.nextLine());
        							System.out.println("Digite o login");
        							String loginCli = scanner.nextLine();
        							System.out.println("Digite o senha(numeros):");
        							int senhaCli = Integer.valueOf(scanner.nextLine());
        							cliente cliente = new cliente(nome3, cpf3,loginCli, senhaCli);
        							repositorioclientes.cadastrarCliente(cliente);
        							System.out.println("cliente cadastrado");
        							repositorioclientes.listar();
        							break;

        						case 4:
        							System.out.println("vc escolheu remover cliente");									
        							System.out.println("Digite o cpf do cliente(letras):");
        							int delCpf = Integer.valueOf(scanner.nextLine());
        							repositorioclientes.deletarCliente(delCpf);
        							repositorioclientes.listar();
        							break;
        						
        						case 5:
        							System.out.println("LISTA DE CLIENTES:");
        							repositorioclientes.listar();
        							break;
        							
        						case 6:
        							System.out.println("vc escolheu mudar login/senha");
            						System.out.println("1-login / 2-senha");
            						int opcao6 = Integer.valueOf(scanner.nextLine());
            						if(opcao6 == 1) {
            							System.out.println("vc escolheu mudar login");
            							System.out.println("Digite seu novo login:");
            							String login = scanner.nextLine();
            							gerente.setLoginGer(login);
            							System.out.println("login mudado");
            						}else if(opcao6 == 2) {
            							System.out.println("vc escolheu mudar senha");
            							System.out.println("Digite sua nova senha:");
            							int novasenha = Integer.valueOf(scanner.nextLine());
            							gerente.setsenhaGer(novasenha);
            							System.out.println("senha mudada");
            						}else {
            							System.out.println("opção inválida");
            						}
            						break;       							
        							
        						case 7:
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
        			int senha2 = Integer.valueOf(scanner.nextLine());
        			cliente cliente = repositorioclientes.login(login2, senha2);
        			if (cliente != null) {
        				System.out.println("Login de cliente bem-sucedido!");
        				boolean sair2 = false;
        				do {
        					System.out.println("Cliente o que deseja fazer:\n"	
        					+ "Digite 1 para: alugar veiculo \n"
        					+ "Digite 2 para: devolver veiculo\n"
        					+ "Digite 3 para: pesquisar veiculo\n"
        					+ "Digite 4 para: ver disponibilidade do veiculo\n"
        					+ "Digite 5 para: mudar login ou senha\n"
        					+ "Digite 6 para: Sair do menu cliente \n");                
        					int opcao2 = Integer.valueOf(scanner.nextLine());
        					switch(opcao2){            
            					case 1:
            						System.out.println("vc escolheu alugar veiculo");
            						System.out.println("Digite o nome do modelo(letras):");
            						String modelo = scanner.nextLine();
            						repositoriocarro.alugarVeiculo(modelo,cliente);  
            						repositoriocarro.verCarrosAlugados(cliente);
            						break;
            					
            					case 2:            						
            						System.out.println("vc escolheu devolver veiculo");
            						System.out.println("Digite o nome do modelo(letras):");
            						String modelo2 = scanner.nextLine();
            						repositoriocarro.devolverVeiculo(modelo2,cliente);
            						repositoriocarro.verCarrosAlugados(cliente);
            						break;
            						
            					case 3:
            						System.out.println("vc escolheu pesquisar veiculo");
            						repositoriocarro.listar();
            						break;
            					
            					case 4:
            						System.out.println("vc escolheu ver disponibilidade do veiculo ");
            						repositoriocarro.listardisponibilidade();
            						break;
            					
            					case 5:
            						System.out.println("vc escolheu mudar login/senha");
            						System.out.println("1-login / 2-senha");
            						int opcao5 = Integer.valueOf(scanner.nextLine());
            						if(opcao5 == 1) {
            							System.out.println("vc escolheu mudar login");
            							System.out.println("Digite seu novo login:");
            							String login = scanner.nextLine();
            							cliente.setLoginCli(login);
            							System.out.println("login mudado");
            						}else if(opcao5 == 2) {
            							System.out.println("vc escolheu mudar senha");
            							System.out.println("Digite sua nova senha:");
            							int senha = Integer.valueOf(scanner.nextLine());
            							cliente.setsenhaCli(senha);
            							System.out.println("senha mudada");
            						}else {
            							System.out.println("opção inválida");
            						}
            						break;
            						          						
            					case 6:
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