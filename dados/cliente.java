package dados;
import java.util.ArrayList;

public class cliente extends pessoa{
	private String loginCli;
    private int senhaCli;
    public ArrayList<veiculo> veiculos;
    
    public cliente(String nome ,int cpf,String loginCli, int senhaCli) {
    	   super(nome,cpf);
    	   this.loginCli = loginCli;
           this.senhaCli = senhaCli;
           this.veiculos = new ArrayList<veiculo>();    }
    
    public int getsenhaCli() {
        return senhaCli;
    }

    public void setsenhaCli(int senha) {
        this.senhaCli = senha;
    }
    
    @Override
	public void mostrarDados(){
        System.out.println("NOME: "+ getNome() + " CPF: " + getCpf() + " LOGIN: " + getLoginCli() + " SENHA: " + getsenhaCli());
    }
    
    public veiculo buscarVeiculoalugado(String placa) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getplaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }
    
    public void adicionarVeiculonaListadoCliente(veiculo veiculo) {
        if (veiculo != null) {
            veiculos.add(veiculo);
        }
    }
    
    public void removerVeiculonalistadoCliente(veiculo veiculo) {
    	if(veiculo != null) {
    		veiculos.remove(veiculo);
    	}
    }

	public String getLoginCli() {
		return loginCli;
	}

	public void setLoginCli(String loginCli) {
		this.loginCli = loginCli;
	}
}
