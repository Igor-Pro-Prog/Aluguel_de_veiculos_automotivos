package repositorio;
import java.util.ArrayList;
import java.util.List;
import dados.cliente;

public class repositorioclientes {
    public List<cliente> clientes =  new ArrayList<cliente>();
    
    public repositorioclientes() {
    	cliente c = new cliente("teste", 12345, "t", 321);
    	clientes.add(c);
    }
    
    public void cadastrarCliente(cliente cliente) {
        clientes.add(cliente);   
    }

    public void deletarCliente(int cpf){
        for(cliente cliente  : clientes){       	
            if(cliente.getCpf() == cpf){
            	clientes.remove(cliente);
            }
        }
    }
    
    public void listar(){
        for (int i = 0; i <clientes.size(); i++) {
            clientes.get(i).mostrarDados();    
        }
    }
    
    public cliente login(String login, int senha) {
    	for (cliente cliente : clientes) {
    		if(cliente.getLoginCli().equals(login) && cliente.getsenhaCli() == senha) {
    			return cliente;
    		}	
    	}
    	return null;
    }
}