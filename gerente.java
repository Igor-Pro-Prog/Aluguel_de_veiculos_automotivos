
import java.util.ArrayList;
import java.util.List;

public class gerente {
    private String nome;
    private String senha;
    public List<veiculo> veiculos;
    public List<cliente> clientes;

    public gerente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public void cadastrarVeiculo(String modelo, String marca) {
        veiculo veiculo = new veiculo(modelo, marca);
        veiculos.add(veiculo);
        
    }

    public void cadastrarCliente(String nome, String cpf) {
        cliente cliente = new cliente(nome, cpf);
        clientes.add(cliente);
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
