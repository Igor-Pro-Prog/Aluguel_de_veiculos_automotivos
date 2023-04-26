
//import java.util.List;
//import java.util.ArrayList;

public class gerente extends pessoa {
    private String id;

    public gerente(String nome, String cpf, String id){
        super(nome,cpf);
        this.id = id;
     }

    public String getId() {
        return id;
    }

    public void setId(String senha) {
        this.id= id;
    }

    @Override
    public void mostrarDados(){
        System.out.println("nome:"+getNome() + "cpf:" + getCpf() + "Id:" + getId());
    }
}