
public class veiculo {
    private String modelo;
    private String marca;
    private boolean disponivel;
    private int codigo;
    public veiculo() {
        
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    

}
