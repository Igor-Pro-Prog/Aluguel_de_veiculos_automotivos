package repositorio;
import java.util.ArrayList;
import java.util.List;
import dados.cliente;
import dados.veiculo;

public class repositoriocarro {
    public List<veiculo> veiculos =  new ArrayList<veiculo>();
    
    public repositoriocarro() {
    	veiculo v = new veiculo("volks", "gol", 1996);
    	veiculos.add(v);
    }
    
    public void cadastrarVeiculo(veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("\n\033[0;32mVeiculo Cadastrado!\033[0m");
    }

    public void deletarVeiculo(int codigo){
        for(veiculo veiculo : veiculos){
            if(veiculo.getCodigo() == codigo){
            	veiculos.remove(veiculo);
				System.out.println("\n\033[0;32mVeiculo Removido!\033[0m");
				break;
            }
        }
    }

    public void listar(){
    	System.out.println("VEICULOS DA LOJA:");
    	if(veiculos.size() > 0) {
    		for (int i = 0; i <veiculos.size(); i++) {
    			System.out.println("MODELO: " + veiculos.get(i).getModelo() + " MARCA: " + veiculos.get(i).getMarca() + " CODIGO: " + veiculos.get(i).getCodigo() + " DISPONIVEL: " + veiculos.get(i).isDisponivel());
    		}
    	}else {
    		System.out.println("NENHUM VEICULO NA LOJA");
    	}
    }
    
    public void listardisponibilidade(){
    	System.out.println("VEICULOS DISPONIVEIS:");
    	if(veiculos.size() > 0) {
    		for (int i = 0; i <veiculos.size(); i++) {
            	if(veiculos.get(i).isDisponivel() == true) {       		
                System.out.println( "modelo:" + veiculos.get(i).getModelo() +",  " + "marca:" + veiculos.get(i).getMarca() + ",  " + "codigo:" + veiculos.get(i).getCodigo() + ",  " + "disponivel:" + veiculos.get(i).isDisponivel());
            	}        	
            }
    	}else {
    		System.out.println("NENHUM VEICULO DISPONIVEL NA LOJA");
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
            System.out.println("Veículo alugado");       
        } else {
            System.out.println("\n\033[0;33mVeículo não disponível ou cliente não encontrado\033[0m");
        }
    }
    
    public void verCarrosAlugados(cliente cliente) {
    	System.out.println("\nCARROS ALUGADOS POR VOCÊ:");
    	System.out.println(cliente.veiculos);
    }
}
