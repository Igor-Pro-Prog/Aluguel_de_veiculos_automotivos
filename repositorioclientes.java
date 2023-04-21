

import java.util.ArrayList;
import java.util.List;

public class repositorioclientes {

    public List<cliente> clientes =  new ArrayList<cliente>();
    cliente cliente = new cliente();

    public  repositorioclientes() {
       

        

    }
    public void cadastrarCliente(cliente cliente) {
        clientes.add(cliente);
       
    }

    public void deletarCliente(int numero){
        for(cliente cliente  : clientes){
            if(cliente.getNumero() == numero){
                clientes.remove(cliente);
            }
        }
    }


    public void listaclientes(){
        for (int i = 0; i <clientes.size(); i++) {
            System.out.println( "mome:" + clientes.get(i).getNome() +"," + "cpf:" + clientes.get(i).getCpf() );
            
          }
    } 

}
