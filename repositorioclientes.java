package pkt; 
import java.util.ArrayList;
import java.util.List;

public class repositorioclientes {
    public List<cliente> clientes =  new ArrayList<cliente>();

    public  repositorioclientes() {
    	cliente c1 = new cliente();
    	c1.setNome("fulano");
    	c1.setCpf("101101");
    	c1.setNumero(001);
        clientes.add(c1);
    }
    public void cadastrarCliente(cliente cliente) {
        clientes.add(cliente);
       
    }

    public void deletarCliente(int numero){
    	cliente clienta = new cliente();
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
        System.out.println("33trteturr");
        return null;
    }
}