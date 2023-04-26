
import java.util.ArrayList;
import java.util.List;

public class repositorioclientes extends repositoriocarro {
    public List<cliente> clientes =  new ArrayList<cliente>();

    public  repositorioclientes() {
    	cliente c1 = new cliente("fulano","101101",001);
        clientes.add(c1);
    }
    public void cadastrarCliente(cliente cliente) {
        clientes.add(cliente);
       
    }

    public void deletarCliente(cliente c){
    	cliente clienta = c;
        for(cliente cliente  : clientes){       	
            if(cliente.getNumero() == c.getNumero()){
            clienta = cliente;
            }
        }
        clientes.remove(clienta);
    }
    @Override
    public void listar(){
        for (int i = 0; i <clientes.size(); i++) {
            System.out.println( "nome:" + clientes.get(i).getNome() +",  " + "cpf:" + clientes.get(i).getCpf() +",  " + "numero:" + clientes.get(i).getNumero());    
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