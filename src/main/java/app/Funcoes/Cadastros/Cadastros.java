package app.Funcoes.Cadastros;

import app.conexao.Conexao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Cadastros {

    public void cadastrarAluno(){
        //Intsncia uma conexão com a classe Conexao
        Conexao con = new Conexao();
        try {
            //Pega a conexão
            con.getConnection();

            //VARIAVEIS PESSOA
            ResultSet idPessoa = con.statement.executeQuery("select max(IDpessoa) from public.\"PESSOA\"");
            String nome = "";
            String cpf = "";
            String rg = "";
            Integer dataNasc = 0;
            String sexo = "";
            Double peso = 0d;
            Integer idCidade = 0;
            String endereco = "";
            String telefone = "";
            Integer dataInicio = 0;
            Double altura = 0d;
            String exame = "";
            String descPessoa = "";

            //CADASTRAR PESSOA
            String query = "INSERT INTO public.\"PESSOA\"(\n" +
                    "\t\"IDpessoa\", \"Nome\", \"CPF\", \"RG\", \"DTnasc\", \"SEXO\", \"PESO\", \"IDcidade\", \"Endereco\", \"Telefone\", \"DTinicio\", \"Altura\", \"ExameAm\", \"DescPessoa\")\n" +
                    "\tVALUES ("+idPessoa+","+nome+","+cpf+","+ rg+","+dataNasc+","+ sexo+","+ peso+","+idCidade+","+ endereco+","+ telefone+","+ dataInicio+","+ altura+","+ exame+","+ descPessoa+"); ";
            ResultSet result = con.statement.executeQuery(query);
            result.next();

            //VARAIAVEIS USUARIO
            Integer idUsuario = 0;
            Integer idLocal = 0;

            //CADASTRAR USUARIO
            String query2 = "INSERT INTO public.\"USUARIO\"(\n" +
                    "\t\"IDusuario\", \"IDpessoa\", \"IDlocal\")\n" +
                    "\tVALUES ("+idUsuario+","+ idPessoa+","+ idLocal+");";
            ResultSet result2 = con.statement.executeQuery(query2);

        } catch (SQLException e) {
            //Vai exibir os erros caso não de certo para cadastrar
            e.printStackTrace();
        }
    }
}
