package repositorio;
import java.util.ArrayList;
import java.util.List;
import dados.cliente;

public class repositorioclientes {
    public List<cliente> clientes =  new ArrayList<cliente>();
    
    public repositorioclientes() {
    	cliente c = new cliente("fulano", 12345, "ful", 321);
    	clientes.add(c);
    }
    
    public void cadastrarCliente(cliente cliente) {
        clientes.add(cliente);   
        System.out.println("\n\033[0;32mCliente cadastrado com sucesso!\033[0m");
    }

    public void deletarCliente(int cpf){
        for(cliente cliente  : clientes){       	
            if(cliente.getCpf() == cpf){
            	clientes.remove(cliente);
            	System.out.println("\n\033[0;32mCliente Removido!\033[0m");
            	break;
            }
        }
    }
    
    public void listar(){
    	System.out.println("CLIENTES CADASTRADOS:");
    	if(clientes.size() > 0) {
    		for (int i = 0; i <clientes.size(); i++) {
                clientes.get(i).mostrarDados();
    		}   
        }else {
        	System.out.println("NENHUM CLIENTE CADASTRADO NA LOJA");
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
