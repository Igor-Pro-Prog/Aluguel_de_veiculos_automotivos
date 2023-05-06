package dados;
import java.util.List;

public class cliente extends pessoa{
	private String loginCli;
    private int senhaCli;
    public List<veiculo> veiculos;
    
    public cliente(String nome ,int cpf,String loginCli, int senhaCli) {
    	   super(nome,cpf);
    	   this.loginCli = loginCli;
           this.senhaCli = senhaCli;
    }
    
    public int getsenhaCli() {
        return senhaCli;
    }

    public void setsenhaCli(int senha) {
        this.senhaCli = senha;
    }
    
    @Override
	public void mostrarDados(){
        System.out.println("nome:"+ getNome() + "\ncpf:" + getCpf() + "\nlogin:" + getLoginCli() + "\nsenha:" + getsenhaCli() );
    }
    
    public veiculo buscarVeiculoalugado(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo)) {
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