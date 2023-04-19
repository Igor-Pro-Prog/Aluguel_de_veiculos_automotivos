import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCliente extends JFrame {
    private JButton btnAgendarAluguel;
    private JButton btnListarCarrosDisponiveis;
    private JButton btnAgendarManutencao;
    private JButton btnAgendarDevolucao;
    ;

    public TelaCliente() {
        // Configurações básicas da janela
        setTitle("Tela do Cliente");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação dos botões para as opções do cliente
        btnAgendarAluguel = new JButton("Agendar Aluguel de Carro");
        btnListarCarrosDisponiveis = new JButton("Listar Carros Disponíveis");
        btnAgendarManutencao = new JButton("Agendar Manutenção");
        btnAgendarDevolucao = new JButton("Agendar Devolução");
    

        // Configuração do layout da tela do cliente
        setLayout(new GridLayout(4, 1));
        add(btnAgendarAluguel);
        add(btnListarCarrosDisponiveis);
        add(btnAgendarManutencao);
        add(btnAgendarDevolucao);

        // Configuração do evento de clique no botão de agendar aluguel
        btnAgendarAluguel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Agendar Aluguel de Carro");
                // Configuração do layout da tela de agendamento de aluguel
                setLayout(new GridLayout(4, 2));
                JLabel lblDataInicio = new JLabel("Data de Início:");
                JLabel lblveiculo = new JLabel("Nome do Veículo:");
                JLabel lblNome = new JLabel("Nome do Cliente:");
                JLabel lbCPFJ = new JLabel("CPF ou CNPJ:");
                JTextField txtDataInicio = new JTextField(10);
                JTextField txtveiculo = new JTextField(10);
                JTextField txtNome = new JTextField(10);
                JTextField txtCPFJ = new JTextField(10);
                JButton btnAgendar = new JButton("Agendar");
                add(lblDataInicio);
                add(txtDataInicio);
                add(lblveiculo);
                add(txtveiculo);
                add(lblNome);
                add(txtNome);
                add(lbCPFJ);
                add(txtCPFJ);
                add(new JLabel()); // Espaço vazio para alinhar botão
                add(btnAgendar);

                btnAgendar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Aluguel agendado com sucesso!");
                       
                    }
                });
            }
        });
        // Configuração do evento de clique no botão de listar carros disponíveis
        btnListarCarrosDisponiveis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Listar Carros Disponíveis");
                // Implemente a lógica para listar os carros disponíveis aqui
            }
        });

        // Configuração do evento de clique no botão de agendar manutenção
        btnAgendarManutencao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Agendar Manutenção");
                // Implemente a lógica para agendar a manutenção de um carro aqui
            }
        });

        // Configuração do evento de clique no botão de agendar devolução
        btnAgendarDevolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: Agendar Devolução");
                // Implemente a lógica para agendar a devolução de um carro aqui
            }
        });
    }
}