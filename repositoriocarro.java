import java.util.ArrayList;
import java.util.List;


public class repositoriocarro {
    public List<veiculo> veiculos;

    public  repositoriocarro() {
       this.veiculos = new ArrayList<veiculo>();
       veiculos.add(new veiculo("gol","volks"));
       veiculos.add(new veiculo("golf","volks"));
       veiculos.add(new veiculo("polo","volks"));
       veiculos.add(new veiculo("up","volks"));
       veiculos.add(new veiculo("gol quadrado","volks"));
       

    }
    public void cadastrarVeiculo(String modelo, String marca) {
    veiculo veiculo = new veiculo(modelo, marca);
    veiculos.add(veiculo);
    
}
    public void listaveiculos(){
        for (int i = 0; i <veiculos.size(); i++) {
            System.out.println( "modelo:" + veiculos.get(i).getModelo() +"," + "marca:" + veiculos.get(i).getMarca());
            
          }
    } 


}
