package repositorio;
import java.util.ArrayList;
import java.util.List;
import dados.cliente;
import dados.veiculo;

public class repositoriocarro {
    public List<veiculo> veiculos =  new ArrayList<veiculo>();
    
    public repositoriocarro() {
    	veiculo v = new veiculo("volks", "gol", "1fj6");
    	veiculos.add(v);
    }
    
    public void cadastrarVeiculo(veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("\n\033[0;32mVeiculo Cadastrado!\033[0m");
    }

    public void deletarVeiculo(String placa){
        for(veiculo veiculo : veiculos){
            if(veiculo.getplaca().equals(placa)){
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
    			System.out.println("MODELO: " + veiculos.get(i).getModelo() + " MARCA: " + veiculos.get(i).getMarca() + " PLACA: " + veiculos.get(i).getplaca() + " DISPONIVEL: " + veiculos.get(i).isDisponivel());
    		}
    	}else {
    		System.out.println("\033[0;31mNENHUM VEICULO NA LOJA\033[0m");
    	}
    }
    
    public int listardisponibilidade(){
    	System.out.println("VEICULOS DISPONIVEIS:");
    	if(veiculos.size() > 0) {
    		for (int i = 0; i <veiculos.size(); i++) {
            	if(veiculos.get(i).isDisponivel() == true) {       		
                System.out.println( "modelo:" + veiculos.get(i).getModelo() +",  " + "marca:" + veiculos.get(i).getMarca() + ",  " + "placa:" + veiculos.get(i).getplaca() + ",  " + "disponivel:" + veiculos.get(i).isDisponivel());
            	} 
    		}
    		return 0;
    	}
    	System.out.println("\033[0;31mNENHUM VEICULO DISPONIVEL NA LOJA\033[0m");
    	return 1;
    }
    
    public veiculo buscarVeiculoDisponivel(String placa) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getplaca().equals(placa) && veiculo.isDisponivel()) {
                return veiculo;
            }
        }
        return null;
    }
    
    public void devolverVeiculo(String placa, cliente cliente) {
        veiculo veiculo = cliente.buscarVeiculoalugado(placa);

        if (veiculo != null && !veiculo.isDisponivel()) {
            veiculo.setDisponivel(true);
            cliente.removerVeiculonalistadoCliente(veiculo);
            veiculos.add(veiculo);
            System.out.println("\n\033[0;33Veículo " + veiculo.getModelo() + " devolvido.\033[0m");
        } else {
            System.out.println("\n\033[0;31mVeículo não encontrado\033[0m");
        }
    }
    
    public void alugarVeiculo(String placa, cliente cliente) {
        veiculo veiculo = buscarVeiculoDisponivel(placa);
    
        if (veiculo != null && cliente != null) {
            veiculo.setDisponivel(false);
            cliente.adicionarVeiculonaListadoCliente(veiculo);
            veiculos.remove(veiculo);
            System.out.println("\n\033[0;32mVeículo com placa:" + veiculo.getplaca() + "," + " alugado para o cliente " + cliente.getNome()+ "\033[0m");      
        } else {
            System.out.println("\n\033[0;31mVeículo não disponível ou cliente não encontrado\033[0m");
        }
    }
    
    public void verCarrosAlugados(cliente cliente) {
    	System.out.println("\nCARROS ALUGADOS POR VOCÊ:");
    	System.out.println(cliente.veiculos);
    }
}
