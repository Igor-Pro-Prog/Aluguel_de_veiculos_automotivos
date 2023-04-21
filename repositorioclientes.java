


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


}
