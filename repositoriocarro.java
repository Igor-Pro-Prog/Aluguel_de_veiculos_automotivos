import java.util.ArrayList;
import java.util.List;


public class repositoriocarro {
    public List<veiculo> veiculos =  new ArrayList<veiculo>();
    veiculo veiculo = new veiculo();
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
        for(veiculo veiculo : veiculos){
            if(veiculo.getCodigo() == codigo){
                veiculos.remove(veiculo);
            }
        }
    }

    public void listaveiculos(){
        for (int i = 0; i <veiculos.size(); i++) {
            System.out.println( "modelo:" + veiculos.get(i).getModelo() +"," + "marca:" + veiculos.get(i).getMarca() + "," + "codigo:" + veiculos.get(i).getCodigo());
            
          }
    } 


}
