import java.util.ArrayList;
import java.util.List;

class Veiculo {
    private String modelo;
    private String marca;
    private boolean disponivel;

    public Veiculo(String modelo, String marca) {
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

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

class Gerente {
    private String nome;
    private String senha;

    public Gerente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

class AluguelVeiculos {
    private List<Veiculo> veiculos;
    private List<Cliente> clientes;
    private Gerente gerente;

    public AluguelVeiculos() {
        veiculos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void cadastrarVeiculo(String modelo, String marca) {
        Veiculo veiculo = new Veiculo(modelo, marca);
        veiculos.add(veiculo);
    }

    public void cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
    }

    public void cadastrarGerente(String nome, String senha) {
        gerente = new Gerente(nome, senha);
    }

    public boolean autenticarGerente(String senha) {
        if (gerente != null) {
            return gerente.autenticar(senha);
        }
        return false;
    }

    public void alugarVeiculo(String modelo, String cpf) {
        Veiculo veiculo = buscarVeiculoDisponivel(modelo);
        Cliente cliente = buscarCliente(cpf);

        if (veiculo != null && cliente != null) {
            veiculo.setDisponivel(false);
            System.out.println("Veículo " + veiculo.getModelo() + " alugado para o cliente " + cliente.getNome());
        } else {
            System.out.println("Veículo não disponível ou cliente não encontrado.");
        }
    }

    public void devolverVeiculo(String modelo) {
        Veiculo veiculo = buscarVeiculo(modelo);

        if (veiculo != null && !veiculo.isDisponivel()) {
            veiculo.setDisponivel(true);
            System.out.println("Veículo " + veiculo.getModelo() + " devolvido.");
        } else {
            System.out.println("Veículo não encontrado ou já está disponível.");
        }
    }

    private Veiculo buscarVeiculo(String modelo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo)) {
                return veiculo;
            }
        }
        return null;
    }

    private Veiculo buscarVeiculoDisponivel(String modelo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo) && veiculo.isDisponivel()) {
                return veiculo;
            }
        }
        return null;
    }

    private Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}

