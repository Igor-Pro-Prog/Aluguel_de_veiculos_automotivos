

import java.util.List;

public class cliente {
    private String nome;
    private String cpf;
    private int numero;
    public List<veiculo> veiculos;
    public List<cliente> clientes;


    public cliente() {
   
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public cliente buscarCliente(String cpf) {
        for (cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public void alugarVeiculo(String modelo, String cpf) {
        veiculo veiculo = buscarVeiculoDisponivel(modelo);
        cliente cliente = buscarCliente(cpf); 

        if (veiculo != null && cliente != null) {
            veiculo.setDisponivel(false);
            System.out.println("Veículo " + veiculo.getModelo() + " alugado para o cliente " + cliente.getNome());
        } else {
            System.out.println("Veículo não disponível ou cliente não encontrado.");
        }
    }

    public void devolverVeiculo(String modelo) {
        veiculo veiculo = buscarVeiculo(modelo);

        if (veiculo != null && !veiculo.isDisponivel()) {
            veiculo.setDisponivel(true);
            System.out.println("Veículo " + veiculo.getModelo() + " devolvido.");
        } else {
            System.out.println("Veículo não encontrado ou já está disponível.");
        }
    }
    public veiculo buscarVeiculo(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo)) {
                return veiculo;
            }
        }
        return null;
    }

    public veiculo buscarVeiculoDisponivel(String modelo) {
        for (veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo) && veiculo.isDisponivel()) {
                return veiculo;
            }
        }
        return null;
    }

}
