
import java.util.ArrayList;
import java.util.List;

public class repositorioclientes {
    public List<cliente> clientes =  new ArrayList<cliente>();

    public  repositorioclientes() {
    	cliente c1 = new cliente("fulano","101101",001);
        clientes.add(c1);
    }
    public void cadastrarCliente(cliente cliente) {
        clientes.add(cliente);
       
    }

    public void deletarCliente(String nome ,String cpf, int numero){
    	cliente clienta = new cliente(nome, cpf, numero);
        for(cliente cliente  : clientes){       	
            if(cliente.getNumero() == numero){
            clienta = cliente;
            }
        }
        clientes.remove(clienta);
    }

    public void listaclientes(){
        for (int i = 0; i <clientes.size(); i++) {
            System.out.println( "nome:" + clientes.get(i).getNome() +"," + "cpf:" + clientes.get(i).getCpf() + "numero:" + clientes.get(i).getNumero());    
        }
    }
    
    public cliente buscarCliente(String cpf) {
        for (cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
            
                return cliente;
            }
        }
        return null;
    }
}