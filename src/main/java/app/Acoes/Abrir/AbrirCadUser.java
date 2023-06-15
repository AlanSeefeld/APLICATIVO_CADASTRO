package app.Acoes.Abrir;

import app.Ui.CadastroCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AbrirCadUser extends AbstractAction {
    //Ação para abrir menu cadastro usuarios
    @Override
    public void actionPerformed(ActionEvent e) {
        //Instanciando da classe CadastroCliente
        CadastroCliente telaCadCliente = new CadastroCliente();
        //Setado o pane dela,aqui diz que a telaPrincipal vai modificar o panelPrincipal
        telaCadCliente.setContentPane(telaCadCliente.panelCadastroUsuario);
        //Setado que a tela vai ser visivel
        telaCadCliente.setVisible(true);
        //Setado o titulo da tela
        telaCadCliente.setTitle("UNIPAR - ACADEMICO");
        //Setado que a tela vai ser responsiva
        telaCadCliente.pack();
        //Setado o tamanho da tela
        telaCadCliente.setSize(400,700);


    }
}
