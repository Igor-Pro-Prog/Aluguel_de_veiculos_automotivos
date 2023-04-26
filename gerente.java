
//import java.util.List;
//import java.util.ArrayList;

public class gerente extends pessoa {
    private String senha;

     public gerente(String nome, String cpf, String senha){
        super(nome,cpf);
        this.senha = senha;
     }

     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}