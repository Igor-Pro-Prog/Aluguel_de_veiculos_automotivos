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
		System.out.println("\033[0;32mSeja bem vindo ao login inicial\033[0m");
		System.out.println("\033[0;32mPrimeiramente cadastre-se como um Cidadão\033[0m\n");
		System.out.println("DIGITE SEU NOME:");
		String nome = scanner.nextLine();
		System.out.println("DIGITE SEU CPF:");
		int cpf = Integer.valueOf(scanner.nextLine());
		pessoa pessoa = new pessoa(nome,cpf);
		System.out.println("\n\033[0;32mCadastro de Cidadão Concluído:\033[0m");
		pessoa.mostrarDados();
		System.out.println("\n\033[0;32mAgora cadastre-se como um Gerente\033[0m");
		System.out.println("\nDIGITE O LOGIN QUE DESEJA CADASTRAR:");
		String loginGer = scanner.nextLine();
		System.out.println("DIGITE A SENHA(PIN) QUE DESEJA CADASTRAR:");
		int senhaGer = Integer.valueOf(scanner.nextLine());
		gerente gerente = new gerente(nome, cpf, loginGer, senhaGer);
		System.out.println("\n\033[0;32mCadastro de Gerente Concluído!\033[0m");
		System.out.println("\n\033[0;32mAviso: O programa já começa com um carro e um cliente cadastrado apenas para facilitar\033[0m");
		repositoriocarro.listar();
		repositorioclientes.listar();
		
        do {
        	System.out.println("\n\033[0;32mSEJA BEM VINDO A LOCALIZA 2.0\033[0m\n"
        	+ "Por favor, informe seu tipo de usuário selecionando um número (gerente/cliente)\n"
        	+ "Digite 1 para: Gerente \n"
        	+ "Digite 2 para: Cliente  \n"
        	+ "Digite 3 para: Sair do programa");
        	int opcao = Integer.valueOf(scanner.nextLine());
        	switch(opcao){
        		case 1:  
        			System.out.println("\n\033[0;32mVocê escolheu a opção Gerente\033[0m");
        			System.out.println("Digite o login do gerente:");
        			String loginteste = scanner.nextLine();
        			System.out.println("Digite a senha(pin) do gerente:");
        			int senhateste = Integer.valueOf(scanner.nextLine());
        			if (loginteste.equals(loginGer) && senhateste == gerente.getsenhaGer()) {
        				System.out.println("\n\033[0;32mLogin de gerente bem-sucedido!\033[0m");
        				boolean sair1 = false;
        				do {
        					System.out.println("\n\033[0;32mGerente o que deseja fazer:\033[0m\n"
        					+ "Digite 1 para: Cadastrar Veiculo \n"
        					+ "Digite 2 para: Remover Veiculo \n"
        					+ "Digite 3 para: Cadastrar Cliente \n"
        					+ "Digite 4 para: Remover Cliente \n" 
        					+ "Digite 5 para: Listar Clientes \n"
        					+ "Digite 6 para: Mudar seu login ou senha\n"
        					+ "Digite 7 para: Sair do menu gerente"); 
        					int opcao1 = Integer.valueOf(scanner.nextLine());
        					switch(opcao1){
        						case 1:
        							System.out.println("\n\033[0;32mVocê escolheu Cadastrar Veiculo\033[0m");
        							System.out.println("Digite o nome do modelo:");
        							String modelo = scanner.nextLine();
        							System.out.println("Digite o nome da marca:");
        							String marca = scanner.nextLine();
        							System.out.println("Digite o codigo:");
        							int codigo = Integer.valueOf(scanner.nextLine());
        							veiculo veiculo = new veiculo(modelo,marca,codigo);
        							repositoriocarro.cadastrarVeiculo(veiculo);       							
        							repositoriocarro.listar();
        							break;

        						case 2:
        							System.out.println("\n\033[0;32mVocê escolheu Remover Veiculo\033[0m");
        							System.out.println("Digite o codigo do carro:");
        							int cod = Integer.valueOf(scanner.nextLine());    							
        							repositoriocarro.deletarVeiculo(cod);
        							repositoriocarro.listar();
        							break;

        						case 3:
        							System.out.println("\n\033[0;32mVocê escolheu Cadastrar Cliente\033[0m");
        							System.out.println("Digite o nome do cliente:");
        							String nome3 = scanner.nextLine();
        							System.out.println("Digite o CPF do cliente:");
        							int cpf3 = Integer.valueOf(scanner.nextLine());
        							System.out.println("Digite o login:");
        							String loginCli = scanner.nextLine();
        							System.out.println("Digite a senha(pin):");
        							int senhaCli = Integer.valueOf(scanner.nextLine());
        							cliente cliente = new cliente(nome3, cpf3,loginCli, senhaCli);
        							repositorioclientes.cadastrarCliente(cliente);
        							repositorioclientes.listar();
        							break;

        						case 4:
        							System.out.println("\n\033[0;32mVocê escolheu Remover Cliente\033[0m");									
        							System.out.println("Digite o CPF do cliente:");
        							int delCpf = Integer.valueOf(scanner.nextLine());
        							repositorioclientes.deletarCliente(delCpf);
        							repositorioclientes.listar();
        							break;
        						
        						case 5:
        							System.out.println("\n\033[0;32mLISTA DE CLIENTES:\033[0m");
        							repositorioclientes.listar();
        							break;
        							
        						case 6:
        							System.out.println("\n\033[0;32mVocê escolheu mudar login/senha\033[0m");
            						System.out.println("1-login / 2-senha");
            						int opcao6 = Integer.valueOf(scanner.nextLine());
            						if(opcao6 == 1) {
            							System.out.println("\n\033[0;31mVocê escolheu mudar login\033[0m");
            							System.out.println("Digite seu novo login:");
            							String login = scanner.nextLine();
            							gerente.setLoginGer(login);
            							System.out.println("\n\033[0;32mLogin mudado com sucesso!\033[0m");
            						}else if(opcao6 == 2) {
            							System.out.println("Digite sua nova senha(pin):");
            							int novasenha = Integer.valueOf(scanner.nextLine());
            							gerente.setsenhaGer(novasenha);
            							System.out.println("\n\033[0;32mSenha mudada com sucesso!\033[0m");
            						}else {
            							System.out.println("\n\033[0;31mOPÇÃO NÃO EXISTE!\033[0m");
            						}
            						break;       							
        							
        						case 7:
        							System.out.println("\n\033[0;32mSAINDO DO MENU GERENTE...\033[0m");
        							sair1 = true;
        							break;
        							
        						default:
        							System.out.println("\n\033[0;31mOPÇÃO NÃO EXISTE!\033[0m");
        		        			break;
        					}
        				}while(!sair1);
        			}else{
        				System.out.println("\n\033[0;33mLogin ou Senha errado!\033[0m");
        			}
        			break;
          
        		case 2:
        			System.out.println("\n\033[0;32mVocê escolheu a opção Cliente\033[0m");
        			System.out.println("Digite o login do cliente:");
        			String login2 = scanner.nextLine();
        			System.out.println("Digite a senha(pin) do cliente:");
        			int senha2 = Integer.valueOf(scanner.nextLine());
        			cliente cliente = repositorioclientes.login(login2, senha2);
        			if (cliente != null) {
        				System.out.println("\n\033[0;32mLogin de Cliente bem-sucedido!\033[0m");
        				boolean sair2 = false;
        				do {
        					System.out.println("\n\033[0;32mCliente o que deseja fazer:\033[0m\n"
        					+ "Digite 1 para: Alugar veiculo \n"
        					+ "Digite 2 para: Devolver veiculo\n"
        					+ "Digite 3 para: Pesquisar todos os veiculos\n"
        					+ "Digite 4 para: Ver veiculos disponiveis\n"
        					+ "Digite 5 para: Mudar login ou senha\n"
        					+ "Digite 6 para: Sair do menu cliente");                
        					int opcao2 = Integer.valueOf(scanner.nextLine());
        					switch(opcao2){            
            					case 1:
            						System.out.println("\n\033[0;32mVocê escolheu alugar veiculo\033[0m");
            						System.out.println("Digite o nome do modelo:");
            						String modelo = scanner.nextLine();
            						repositoriocarro.alugarVeiculo(modelo,cliente);  
            						repositoriocarro.verCarrosAlugados(cliente);
            						break;
            					
            					case 2: 
            						System.out.println("\n\033[0;32mVocê escolheu devolver veiculo\033[0m");
            						System.out.println("Digite o nome do modelo:");
            						String modelo2 = scanner.nextLine();
            						repositoriocarro.devolverVeiculo(modelo2,cliente);
            						repositoriocarro.verCarrosAlugados(cliente);
            						break;
            						
            					case 3:
            						System.out.println("\n\033[0;32mVocê escolheu pesquisar todos os veiculos\033[0m");
            						repositoriocarro.listar();
            						break;
            					
            					case 4:
            						System.out.println("\n\033[0;32mVocê escolheu ver veiculos disponiveis\033[0m");
            						repositoriocarro.listardisponibilidade();
            						break;
            					
            					case 5:
            						System.out.println("\n\033[0;31mVocê escolheu mudar login/senha\033[0m");
            						System.out.println("1-login / 2-senha");
            						int opcao5 = Integer.valueOf(scanner.nextLine());
            						if(opcao5 == 1) {
            							System.out.println("\n\033[0;31mVocê escolheu mudar login\033[0m");
            							System.out.println("Digite seu novo login:");
            							String login = scanner.nextLine();
            							cliente.setLoginCli(login);
            							System.out.println("\n\033[0;32mLogin mudado com sucesso!\033[0m");
            						}else if(opcao5 == 2) {
            							System.out.println("\n\033[0;31mVocê escolheu mudar senha\033[0m");
            							System.out.println("Digite sua nova senha(pin):");
            							int senha = Integer.valueOf(scanner.nextLine());
            							cliente.setsenhaCli(senha);
            							System.out.println("\n\033[0;32mSenha mudada com sucesso!\033[0m");
            						}else {
            							System.out.println("\n\033[0;31mOPÇÃO NÃO EXISTE!\033[0m");
            						}
            						break;
            						          						
            					case 6:
            						System.out.println("\n\033[0;32mSAINDO DO MENU CLIENTE...\033[0m");
        							sair2 = true;
        							break;        							
            					default:
            						System.out.println("\n\033[0;31mOPÇÃO NÃO EXISTE!\033[0m");
        		        			break;
        					}
        				}while(!sair2);
        			}else{
        				System.out.println("\n\033[0;33mLogin ou Senha errado\033[0m");
        			}
        			break;       			
        		case 3:
        			System.out.println("\n\033[0;32mFIM DO PROGRAMA, SAINDO...\033[0m");
        			sair = true;
        			break;
        		default:
        			System.out.println("\n\033[0;31mOPÇÃO NÃO EXISTE!\033[0m");
        			break;
        	} 
        }while(!sair);
        scanner.close();
	}
}
