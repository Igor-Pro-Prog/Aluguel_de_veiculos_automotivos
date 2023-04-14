

public class veiculo {
    private String modelo;
    private String marca;
    private boolean disponivel;

    public veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.disponivel = true;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    

}

 

    
