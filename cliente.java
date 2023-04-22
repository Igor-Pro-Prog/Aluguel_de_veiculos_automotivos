package pkt;
import java.util.List;

public class cliente {
    private String nome;
    private String cpf;
    private int numero;
    public List<veiculo> veiculos;
    public List<cliente> clientes;
    
    public cliente() {
    	   
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public veiculo buscarVeiculoalugado(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo)) {
                return veiculo;
            }
        }
        return null;
    }
    
    public void adicionarVeiculonalista(veiculo veiculo) {
        if (veiculo != null) {
            veiculos.add(veiculo);
        }
    }
}