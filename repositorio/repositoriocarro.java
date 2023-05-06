package repositorio;
import java.util.ArrayList;
import java.util.List;
import dados.cliente;
import dados.veiculo;

public class repositoriocarro {
    public List<veiculo> veiculos =  new ArrayList<veiculo>();
    
    public repositoriocarro() {
    	veiculo v = new veiculo("gol", "hyper", 9);
    	veiculos.add(v);
    }
    
    public void cadastrarVeiculo(veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void deletarVeiculo(int codigo){
        for(veiculo veiculo : veiculos){
            if(veiculo.getCodigo() == codigo){
            	veiculos.remove(veiculo);
            }
        }
    }

    public void listar(){
    	System.out.println("Veiculos da loja:");
        for (int i = 0; i <veiculos.size(); i++) {
            System.out.println( "modelo:" + veiculos.get(i).getModelo() +",  " + "marca:" + veiculos.get(i).getMarca() + ",  " + "codigo:" + veiculos.get(i).getCodigo() + ",  " + "disponivel:" + veiculos.get(i).isDisponivel());
        }
    }
    
    public void listardisponibilidade(){
    	System.out.println("Veiculos disponiveis:");
        for (int i = 0; i <veiculos.size(); i++) {
        	if(veiculos.get(i).isDisponivel() == true) {       		
            System.out.println( "modelo:" + veiculos.get(i).getModelo() +",  " + "marca:" + veiculos.get(i).getMarca() + ",  " + "codigo:" + veiculos.get(i).getCodigo() + ",  " + "disponivel:" + veiculos.get(i).isDisponivel());
        	}        	
        }
    }
    
    public veiculo buscarVeiculoDisponivel(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo) && veiculo.isDisponivel()) {
                return veiculo;
            }
        }
        return null;
    }
    
    public void devolverVeiculo(String modelo, cliente cliente) {
        veiculo veiculo = cliente.buscarVeiculoalugado(modelo);

        if (veiculo != null && !veiculo.isDisponivel()) {
            veiculo.setDisponivel(true);
            cliente.removerVeiculonalistadoCliente(veiculo);
            System.out.println("Veículo " + veiculo.getModelo() + " devolvido.");
        } else {
            System.out.println("Veículo não encontrado");
        }
    }
    
    public void alugarVeiculo(String modelo, cliente cliente) {
        veiculo veiculo = buscarVeiculoDisponivel(modelo);
    
        if (veiculo != null && cliente != null) {
            veiculo.setDisponivel(false);
            cliente.adicionarVeiculonaListadoCliente(veiculo);
            System.out.println("Veículo:" + veiculo.getModelo() + "," + " alugado para o cliente " + cliente.getNome());
            System.out.println("veiculo alugado");       
        } else {
            System.out.println("Veículo não disponível ou cliente não encontrado.");
        }
    }
    
    public void verCarrosAlugados(cliente cliente) {
    	System.out.println(cliente.veiculos);
    }
}