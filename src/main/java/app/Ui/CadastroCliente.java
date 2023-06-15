package app.Ui;

import app.Funcoes.Cadastros.Cadastros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JFrame {


    public JPanel panelCadastroUsuario;
    public JTextField textCpf;
    public JTextField textNome;
    public JTextField textRG;
    public JTextField textPeso;
    public JComboBox comboBoxCidade;
    public JTextField textEndereco;
    public JTextField textTelefone;
    public JTextField textDataInicio;
    public JButton cadastrarButton;
    public JTextField textDataNasc;
    public JTextField textAltura;
    public JComboBox comboBoxSexo;
    public JTextField textRelatorio;



public CadastroCliente()  {
    cadastrarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        Cadastros cadastros = new Cadastros();
        cadastros.cadastrarAluno();

        }
    });
}
}