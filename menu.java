


import java.util.Scanner;

public class menu {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("seja bem vindo");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Localiza 2. 0:\n"
        + "Por favor, informe seu tipo de usuário (gerente/cliente):\n"
        + "Digite 1 para: Gerente \n"
        + "Digite 2 para: Cliente  \n"
        + "Digite 3 para: Sair \n");
        int opcao = entrada.nextInt();



        switch(opcao){
            case 1:  
            System.out.println("gerente");  
            break;
            
           


            case 2:

            while(opcao != 4){ 
              System.out.println("vc é um cliente:\n"
              + "Digite 1 para: Alugar veiculo \n"
              + "Digite 2 para: deixar carro \n"
              + "Digite 3 para: Sair \n");

              Scanner novaentrada = new Scanner(System.in);
              int opcao2 = novaentrada.nextInt();
                       
              switch(opcao2){
              
                case 1:
               
                System.out.println("Bem-vindo ao sistema de aluguel de veículos!");
                System.out.println("Por favor, informe o seu nome :"); 
                String nome = scanner.nextLine();
                System.out.println("Por favor, informe seu CPF:");
                String cpf = scanner.nextLine();
                cliente cliente =new cliente(nome, cpf);
                System.out.println("Por favor, informe o nome do modelo q deseja:"); 
                String modelo = scanner.nextLine();
               
                cliente.alugarVeiculo(modelo, cpf);
                opcao = 4;
                break;
    
                case 2:
                opcao = 4;
                break;
    
                case 3:
                opcao = 4;
                 break;
                default:
                  System.out.println("opcao digitada invalida");  
              }
          }
        }
      }
        }
      
  

 

    
