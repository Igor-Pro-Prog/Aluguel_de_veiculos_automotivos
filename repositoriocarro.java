import java.util.ArrayList;
import java.util.List;


public class repositoriocarro {
    public List<veiculo> veiculos;
    public List<cliente> clientes;
    gerente gerente;

   public  repositoriocarro() {
       veiculos = new ArrayList<>();
       veiculos.add(new veiculo("gol","volks"));
       veiculos.add(new veiculo("golf","volks"));
       veiculos.add(new veiculo("polo","volks"));
       veiculos.add(new veiculo("up","volks"));
       veiculos.add(new veiculo("gol quadrado","volks"));
       

   }
   


}