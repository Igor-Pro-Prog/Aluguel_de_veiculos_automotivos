import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaGerente extends JFrame {
    private JButton btnCadastrarVeiculo;
    private JButton btnListarVeiculosDisponiveis;
    private JButton btnAdicionarVeiculos;
    private JButton btnRemoverVeiculos;
    private JButton listarVeiculosAlugados;
    private JButton AlugarVeiculos;

    public TelaGerente() {
        // Configurações básicas da janela
        setTitle("Tela do Cliente");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação dos botões para as opções do gerente
        btnCadastrarVeiculo = new JButton("Cadastrar Veiculo");
        btnListarVeiculosDisponiveis = new JButton("Listar Veiculos Disponiveis");
        btnAdicionarVeiculos = new JButton("Adicionar Veiculos");
        btnRemoverVeiculos = new JButton("Remover Veiculos");
        listarVeiculosAlugados = new JButton("Listar Veiculos Alugados");
        AlugarVeiculos = new JButton("Alugar Veiculos");

    

        // Configuração do layout da tela do gerente

        setLayout(new GridLayout(6, 1));
        add(btnCadastrarVeiculo);
        add(btnListarVeiculosDisponiveis);
        add(btnAdicionarVeiculos);
        add(btnRemoverVeiculos);
        add(listarVeiculosAlugados);
        add(AlugarVeiculos);
        
        

        // Configuração do evento de clique no botão 
        btnCadastrarVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Cadastrar Veiculo");
                // Configuração do layout da tela de agendamento de aluguel
                setLayout(new GridLayout(4, 2));
                JLabel lblMarca = new JLabel("Marca:");
                JLabel lblModelo = new JLabel("Modelo:");
                JLabel lblAno = new JLabel("Ano:");
                JLabel lblPlaca = new JLabel("Placa:");
                JTextField txtMarca = new JTextField(10);
                JTextField txtModelo = new JTextField(10);
                JTextField txtAno = new JTextField(10);
                JTextField txtPlaca = new JTextField(10);
                JButton btnCadastrar = new JButton("Cadastrar");
                add(lblMarca);
                add(txtMarca);
                add(lblModelo);
                add(txtModelo);
                add(lblAno);
                add(txtAno);
                add(lblPlaca);
                add(txtPlaca);
                add(new JLabel()); // Espaço vazio para alinhar botão
                add(btnCadastrar);

                btnCadastrar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
                    }
                });
            }
        });
        // Configuração do evento de clique no botão
        btnListarVeiculosDisponiveis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Listar Veiculos Disponiveis");
                // Implemente a lógica para listar os veículos disponíveis aqui
       
            }
        });

        // Configuração do evento de clique no botão 
        btnAdicionarVeiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Adicionar Veiculos");
                // Implemente a lógica para adicionar veículos aqui
            }
        });

        // Configuração do evento de clique no botão
        btnRemoverVeiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Remover Veiculos");
                // Implemente a lógica para remover veículos aqui
            }
        });
        // Configuração do evento de clique no botão
        listarVeiculosAlugados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Listar Veiculos Alugados");
                // Implemente a lógica para listar os veículos alugados aqui
            }
        });
        // Configuração do evento de clique no botão
        AlugarVeiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Alugar Veiculos");
                // Implemente a lógica para alugar veículos aqui
            }
        });
    }
}