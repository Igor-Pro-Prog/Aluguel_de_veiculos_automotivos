



import java.util.ArrayList;
import java.util.List;

public class repositorioclientes {

     public List<cliente> clientes;


    public  repositorioclientes() {
       this.clientes = new ArrayList<cliente>();

        

    }
    public void cadastrarCliente(String nome, String cpf) {
        cliente cliente = new cliente(nome, cpf);
        clientes.add(cliente);
       
    }
    public void listaclientes(){
        for (int i = 0; i <clientes.size(); i++) {
            System.out.println( "mome:" + clientes.get(i).getNome() +"," + "cpf:" + clientes.get(i).getCpf() );
            
          }
    } 

}
