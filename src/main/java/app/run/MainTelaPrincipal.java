package app.run;

import app.Acoes.Abrir.AbrirCadUser;
import app.Ui.TelaPrincipal;

import javax.swing.*;
import java.awt.*;


public class MainTelaPrincipal {
    public static void main(String[] args) {
        //Instanciado a TelaPrincipal
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        //Setado o pane dela,aqui diz que a telaPrincipal vai modificar o panelPrincipal
        telaPrincipal.setContentPane(telaPrincipal.panelPrincipal);
        //Setado que a tela vai ser visivel
        telaPrincipal.setVisible(true);
        //Setado o titulo da tela
        telaPrincipal.setTitle("UNIPAR - ACADEMICO");
        //Setado que a tela vai ser responsiva
        telaPrincipal.pack();
        //Setado o tamanho da tela
        telaPrincipal.setSize(600,600);

        //CRIAR BARRA DE MENUS
        JMenuBar menu = new JMenuBar();
        //Aqui esta dizendo que a bara de menu dessa tela sera essa
        telaPrincipal.setJMenuBar(menu);

        //Criando o menu na barra de menus chamado Cadastros
        JMenu cadastros = new JMenu("Cadastros");
        //Adicionado o cadastros no menu
        menu.add(cadastros);

        //Criado um item do menu
        JMenuItem alunos = new JMenuItem("Alunos");
        //Adicionado o item no cadastros
        cadastros.add(alunos);

        //Criado um item do menu
        JMenuItem usuarios = new JMenuItem(new AbrirCadUser());
        usuarios.setText("Usuarios");
        ///Adicionado o item no cadastros
        cadastros.add(usuarios);

        //Criado um item do menu
        JMenuItem materiais = new JMenuItem("Materiais");
        //Adicionado o item no cadastros
        cadastros.add(materiais);

        //Criado um item do menu
        JMenuItem modalidades = new JMenuItem("Modalidades");
        //Adicionado o item no cadastros
        cadastros.add(modalidades);

        //Criado um item do menu
        JMenuItem localTreino = new JMenuItem("Local Treino");
        //Adicionado o item no cadastros
        cadastros.add(localTreino);

        //Criado um item do menu
        JMenuItem estagios = new JMenuItem("Estagios");
        //Adicionado o item no cadastros
        cadastros.add(estagios);

        //Criado um item do menu
        JMenuItem cidades = new JMenuItem("Cidades");
        //Adicionado o item no cadastros
        cadastros.add(cidades);

        //Criado o item para sair
        JMenuItem sair = new JMenuItem("Sair");
        //Adicionado o item no cadastros
        cadastros.add(sair);







    }
}
