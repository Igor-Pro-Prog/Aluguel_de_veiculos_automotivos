
import java.util.List;

public class cliente extends pessoa{
    private String nome;
    private String cpf;
    private int numero;
    public List<veiculo> veiculos;
    public List<cliente> clientes;
    
    public cliente(String nome ,String cpf, int numero) {
    	   super(nome,cpf);
           this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarDados(){
        System.out.println("nome:"+getNome() + "cpf:" + getCpf() + "numero:" + getNumero() );
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