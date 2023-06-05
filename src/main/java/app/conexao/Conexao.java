package app.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    //Criado uma variavel do tipo conexão
    public Connection conexao;
    //Criado uma variavel usada para chamar comandos do SQL
    public Statement statement;
    //Variavel para guardar a URL para se conectar com o banco
    private final String URL = "jdbc:postgresql://localhost:5432/";
    //Variavel para guardar o nome do usuario do banco de dados
    private final String USERNAME = "postgres";
    //Variavel para guardar a senha do usuario do banco de dados
    private final String PASSWORD = "adm123";
    //Variavel para guardar o nome do banco de dados
    private final String DBNAME = "AcademiaUnipar";
    //Variavel para guardar a URL de conexão do banco completa
    private String urlConnection = "";
    //Criado um método construtor que quando chamado seta a urlConnection
    public Conexao(){
        this.urlConnection = URL + DBNAME;
    }
    //Craido função para pegar a conexão
    public void getConnection() throws SQLException {
        //Criado uma variavel que seta que a conexão do banco de dados ira ter tal URL,USUARIO e SENHA
        Connection conexao = DriverManager.getConnection(this.urlConnection,USERNAME,PASSWORD);
        //Setando que a variavel conexao criada lá em cima vai receber esta que esta a cima
        this.conexao = conexao;
        //Intanciado a variavel statement, aqui diz que a statement vai poder consultar no banco conexao
        this.statement = conexao.createStatement();
    }
    //Criado função para fechar a conexão
    public void fecharConexao() throws SQLException{
        //Quando a função ser chamada a conexão ira ser fechada
        this.conexao.close();
    }

}
