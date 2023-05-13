package dados;

public class veiculo {
    private String modelo;
    private String marca;
    private boolean disponivel;
    private String placa;
    
    public veiculo(String modelo,String marca,String placa) {
    	this.modelo = modelo;
    	this.marca = marca;
        this.placa = placa;
        this.disponivel = true;
    }
    
    public String getplaca() {
        return placa;
    }

    public void setCodigo(String placa) {
        this.placa = placa;
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
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String toString() {
    	return "MODELO: " +  this.modelo +  " MARCA: " + this.marca + " PLACA: " + this.placa + " DISPONIBILIDADE: " + this.disponivel;
    }
    
}
