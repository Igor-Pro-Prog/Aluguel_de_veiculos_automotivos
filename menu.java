



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
            while(opcao != 4){ 
              System.out.println("vc é um cliente:\n"
              + "Digite 1 para: opcoes gerente \n"
              + "Digite 2 para: opcoes gerente \n"
              + "Digite 3 para: Sair \n");

              Scanner novaentrada2 = new Scanner(System.in);
              int opcao3 = novaentrada2.nextInt();
                       
              switch(opcao3){
              
                case 1:
                System.out.println("opcao 1");
                opcao = 4;
                break;
    
                case 2:
                System.out.println("opcao 2");
                opcao = 4;
                break;
    
                case 3:
                System.out.println("opcao 3");
                opcao = 4;
                 break;
                default:
                  System.out.println("opcao digitada invalida");  
              }
          }
            
           


            case 2:
            System.out.println("cliente");
            while(opcao != 4){ 
              System.out.println("vc é um cliente:\n"
              + "Digite 1 para: Alugar veiculo \n"
              + "Digite 2 para: deixar carro \n"
              + "Digite 3 para: Sair \n");

              Scanner novaentrada = new Scanner(System.in);
              int opcao2 = novaentrada.nextInt();
                       
              switch(opcao2){
              
                case 1:
                Scanner novaentrada3 = new Scanner(System.in);
                int opcao4 = novaentrada3.nextInt();
                       
                switch(opcao4){
              
                  case 1:
                  System.out.println("opcao 1");
                  opcao = 4;
                  break;
      
                  case 2:
                  System.out.println("opcao 2");
                  opcao = 4;
                  break;
      
                  case 3:
                  System.out.println("opcao 3");
                  opcao = 4;
                   break;
                  default:
                  System.out.println("opcao digitada invalida");  
              }
          }
              }
          }
        }
      }
        
      
  
