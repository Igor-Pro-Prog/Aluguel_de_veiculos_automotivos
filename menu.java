import java.util.Scanner;

public class menu {
   
    public static void main(String[] args) {

        int z=0;
        int e = 0;
        System.out.println("seja bem vindo");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Localiza 2. 0:\n"
        + "vc é gerente ou cliente da localiza\n"
        + "Digite 1 para: Gerente \n"
        + "Digite 2 para: Cliente  \n"
        + "Digite 3 para: Sair \n");
        int opcao = entrada.nextInt();
        switch(opcao){
            case 1:
            break;
            



            case 2:
            System.out.println("cliente\n"
            + "\n"
            + "\n");
            int a , b = 0;
            


            
            while(opcao != 4){ 
              System.out.println("Caixa eletronico:\n"
              + "Digite 1 para: pegar carro \n"
              + "Digite 2 para: deixar carro \n"
              + "Digite 3 para: Sair \n");
              Scanner novaentrada = new Scanner(System.in);
              int opcao2 = novaentrada.nextInt();
                       
              switch(opcao2){
                case 1:
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
    


