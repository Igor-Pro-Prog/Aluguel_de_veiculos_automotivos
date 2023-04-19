import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CadastroDeLogin extends JFrame {
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private JButton btnCadastrar;

    public CadastroDeLogin() {
        // Configurações básicas da janela
        setTitle("Cadastro de Login de Cliente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação dos componentes para a tela de cadastro de cliente
        lblLogin = new JLabel("Login:");
        lblSenha = new JLabel("Senha:");
        txtLogin = new JTextField(10);
        txtSenha = new JPasswordField(10);
        btnEntrar = new JButton("Entrar");
        btnCadastrar = new JButton("Cadastrar");

        // Configuração do layout da tela de cadastro de cliente
        setLayout(new GridLayout(4, 2));
        add(lblLogin);
        add(txtLogin);
        add(lblSenha);
        add(txtSenha);
        add(new JLabel()); // Espaço vazio para alinhar botão
        add(btnEntrar);
        add(btnCadastrar);

        // Configuração do evento de clique no botão de entrar
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                String senha = String.valueOf(txtSenha.getPassword());

                // Verificação de login e senha
                if (login.equals("sorvete") && senha.equals("sorvete")) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo como Cliente!");
                    abrirTelaCliente();
                } else if (login.equals("admin") && senha.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo como Gerente!");
                    abrirTelaGerente();

                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
                }
            }

            private void abrirTelaGerente() {
                TelaGerente telaGerente = new TelaGerente();
                telaGerente.setVisible(true);
                dispose();
            }
        });

        // Configuração do evento de clique no botão de cadastrar
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                String senha = String.valueOf(txtSenha.getPassword());

                // Salva os dados de login do cliente em um arquivo CSV
                salvarCadastroCliente(login, senha);

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                abrirTelaCliente();
            }
        });
    }
    // Método para abrir a tela de cliente
    private void abrirTelaCliente() {
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setVisible(true);
        dispose();
    }

    // Método para salvar o cadastro do cliente em um arquivo CSV
    private void salvarCadastroCliente(String login, String senha) {
        try {
            // Abre o arquivo CSV em modo de escrita
            FileWriter fileWriter = new FileWriter("clientes.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escreve os dados de login e senha do cliente no arquivo CSV
            bufferedWriter.write(login + "," + senha);
            bufferedWriter.newLine();

            // Fecha o arquivo
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CadastroDeLogin cadastroDeLogin = new CadastroDeLogin();
        cadastroDeLogin.setVisible(true);
    }
}


