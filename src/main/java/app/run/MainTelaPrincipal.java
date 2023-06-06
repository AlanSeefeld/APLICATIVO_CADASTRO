package app.run;

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

        telaPrincipal.getContentPane().setLayout(new GridLayout(1, 12)); // 2 linhas, 4 colunas
        telaPrincipal.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 3, 1)); // Espaço horizontal: 10, Espaço vertical: 10

        //Criação do botão Usuario
        JButton botaoUsuario = new JButton("USUARIO");
        // Carregamento do ícone
        ImageIcon iconeUsuario = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoUsuario.setIcon(iconeUsuario);
        botaoUsuario.setSize(900,900);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoUsuario);

        //Criação do botão Aluno
        JButton botaoAluno = new JButton("ALUNOS");
        // Carregamento do ícone
        ImageIcon iconeAluno = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoAluno.setIcon(iconeAluno);
        botaoAluno.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoAluno);

        //Criação do botão Materiais
        JButton botaoMateriais = new JButton("MATERIAIS");
        // Carregamento do ícone
        ImageIcon iconeMateriais = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoMateriais.setIcon(iconeMateriais);
        botaoMateriais.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoMateriais);

        //Criação do botão Local
        JButton botaoLocal = new JButton("LOCAL");
        // Carregamento do ícone
        ImageIcon iconeLocal = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoLocal.setIcon(iconeLocal);
        botaoLocal.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoLocal);

        //Criação do botão Modalidades
        JButton botaoModalidades = new JButton("MODALIDADES");
        // Carregamento do ícone
        ImageIcon iconeModalidade = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoModalidades.setIcon(iconeModalidade);
        botaoModalidades.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoModalidades);

        //Criação do botão Estagio
        JButton botaoEstagio = new JButton("ESTAGIO");
        // Carregamento do ícone
        ImageIcon iconeEstagio = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoEstagio.setIcon(iconeEstagio);
        botaoEstagio.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoEstagio);

        //Criação do botão Cidades
        JButton botaoCidades = new JButton("CIDADES");
        // Carregamento do ícone
        ImageIcon iconeCidades = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoCidades.setIcon(iconeCidades);
        botaoCidades.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoCidades);

        //Criação do botão Sair
        JButton botaoSair = new JButton("SAIR");
        // Carregamento do ícone
        ImageIcon iconeSair = new ImageIcon("app/Ui/Icones/TelaPrincipal/aluno.png");
        // Definição do ícone no botão
        botaoSair.setIcon(iconeSair);
        botaoSair.setSize(100,100);
        // Adição do botão à janela
        telaPrincipal.getContentPane().add(botaoSair);

        //Usado para deixar visivel pois se não usar ele abria invisivel
        telaPrincipal.setVisible(true);






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
        JMenuItem usuarios = new JMenuItem("Usuarios");
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
