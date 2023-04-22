package pkt;
import java.util.ArrayList;
import java.util.List;

public class repositoriocarro {
    public List<veiculo> veiculos =  new ArrayList<veiculo>();
    
    public  repositoriocarro() {
       veiculo v1 = new veiculo();
       v1.setModelo("gol");
       v1.setMarca("volks");
       v1.setCodigo(1);
       veiculos.add(v1);
    }
    
    public void cadastrarVeiculo(veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void deletarVeiculo(int codigo){
    	veiculo veicula = new veiculo();
        for(veiculo veiculo : veiculos){
            if(veiculo.getCodigo() == codigo){
            	veicula = veiculo;
            }
        }
        veiculos.remove(veicula);
    }

    public void listaveiculos(){
        for (int i = 0; i <veiculos.size(); i++) {
            System.out.println( "modelo:" + veiculos.get(i).getModelo() +"," + "marca:" + veiculos.get(i).getMarca() + "," + "codigo:" + veiculos.get(i).getCodigo() + "," + "disponivel:" + veiculos.get(i).isDisponivel());
        }
    }

    public veiculo buscarVeiculo(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo)) {
                return veiculo;
            }
        }
        return null;
    }
    
    public veiculo buscarVeiculoDisponivel(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo) && veiculo.isDisponivel()) {
                return veiculo;
            }
        }
        return null;
    }
    
    public void devolverVeiculo(String modelo) {
        veiculo veiculo = buscarVeiculo(modelo);

        if (veiculo != null && !veiculo.isDisponivel()) {
            veiculo.setDisponivel(true);
            System.out.println("Veículo " + veiculo.getModelo() + " devolvido.");
        } else {
            System.out.println("Veículo não encontrado ou já está disponível.");
        }
    }
    
    public void alugarVeiculo(String modelo, cliente cliente) {
        veiculo veiculo = buscarVeiculoDisponivel(modelo);
        if (veiculo != null && cliente != null) {
            veiculo.setDisponivel(false);
            cliente.adicionarVeiculonalista(veiculo);
            System.out.println("Veículo " + veiculo.getModelo() + " alugado para o cliente " + cliente.getNome());
        } else {
            System.out.println("Veículo não disponível ou cliente não encontrado.");
        }
    }
}