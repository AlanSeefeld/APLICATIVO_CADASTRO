package app.conexao;

import java.sql.*;

public class Conectar {
    public static void main(String[] args) {
        conectarBancoDeDados();
    }

    public static void conectarBancoDeDados(){
        try{
            //Instanciando uma conexão com o nome con
            Conexao con = new Conexao();
            //Pegando a coneão
            con.getConnection();
            //Imprime no terminal que conectou no banco
            System.out.println("Conectado ao banco de dados");

        }catch(Exception e){
            //Vai exibir os erros caso não de certo para conectar
            e.printStackTrace();
        }

    }
}
