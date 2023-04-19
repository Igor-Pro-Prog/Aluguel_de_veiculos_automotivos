


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
            gerente gerente= new gerente();
            System.out.println("vc escolheu a opcao gerente");
            System.out.println("Digite o login do gerente:");
            String login = scanner.nextLine();
            System.out.println("Digite a senha do gerente:");
            String senha = scanner.nextLine();
            if (login.equalsIgnoreCase("admin") && senha.equals("admin")) {
                System.out.println("Login de gerente bem-sucedido!");
                System.out.println("Oque deseja fazer:\n"
                + "Digite 1 para: opcoes gerente \n"
                + "Digite 2 para: opcoes gerente \n"
                + "Digite 3 para: Sair \n");                 
                Scanner novaentrada2 = new Scanner(System.in);
                int opcao3 = novaentrada2.nextInt();
                switch(opcao3){
            
                  case 1:
                  System.out.println("deu certo");
                  System.out.println("Digite o nome do modelo:");
                  String modelo = scanner.nextLine();
                  System.out.println("Digite o nome da marca:");
                  String marca = scanner.nextLine();
                  gerente.cadastrarVeiculo(modelo, marca);
                  System.out.println("veiculo cadastrado");
                  System.out.println(gerente.toString());
                  opcao = 4;
                  break;
    
              }
            }
            case 2:
            System.out.println("vc escolheu a opcao cliente");
            System.out.println("Digite o login do cliente:");
            String login2 = scanner.nextLine();
            System.out.println("Digite a senha do gerente:");
            String senha2 = scanner.nextLine();
            if (login2.equalsIgnoreCase("sorvete") && senha2.equals("sorvete"   )) {
                System.out.println("Login de gerente bem-sucedido!");
                System.out.println("Oque deseja fazer:\n"
                + "Digite 1 para: alugar carro \n"
                + "Digite 2 para: devolver carro\n"
                + "Digite 3 para: Sair \n");                 
                Scanner novaentrada3 = new Scanner(System.in);
                int opcao4 = novaentrada3.nextInt();
                switch(opcao4){
            
                  case 1:
                  System.out.println("alugar carro");
                  opcao = 4;
                  break;
    
              }
            }

                    }
                 }     }
                
        
      
        
      
  
