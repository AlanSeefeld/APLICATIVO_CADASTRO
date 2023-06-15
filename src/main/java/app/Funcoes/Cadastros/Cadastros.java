package app.Funcoes.Cadastros;

import app.Ui.CadastroCliente;
import app.conexao.Conexao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Cadastros extends CadastroCliente{

    public void cadastrarAluno(){
        //Intsncia uma conexão com a classe Conexao
        Conexao con = new Conexao();
        try {
            //Pega a conexão
            con.getConnection();

            //VARIAVEIS PESSOA
            ResultSet idPessoaResult = con.statement.executeQuery("SELECT MAX(\"IDpessoa\") FROM public.\"PESSOA\"");
            idPessoaResult.next();
            int idPessoa = idPessoaResult.getInt(1) + 1;
            String nome = textNome.getText();
            String cpf = textCpf.getText();
            String rg = textRG.getText();
            String dataNasc = textDataNasc.getText();
            Integer tipoSexo = comboBoxSexo.getSelectedIndex();
            String sexo = "";
            if(tipoSexo == 0){
                sexo = "M";
            } else if (tipoSexo == 1) {
                sexo = "F";
            }else{
                sexo = "O";
            }
            String pesoText = textPeso.getText();
            String alturaText = textAltura.getText();

            double peso = 0.0;
            double altura = 0.0;

            if (!pesoText.isEmpty()) {
                peso = Double.parseDouble(pesoText);
            }

            if (!alturaText.isEmpty()) {
                altura = Double.parseDouble(alturaText);
            }


            Integer idCidade = comboBoxCidade.getSelectedIndex();
            String endereco = textEndereco.getText();
            String telefone = textTelefone.getText();
            String dataInicio = textDataInicio.getText();
            String exame = textRelatorio.getText();

            //CADASTRAR PESSOA
            String query = "INSERT INTO public.\"PESSOA\"(\n" +
                    "\"IDpessoa\", \"Nome\", \"CPF\", \"RG\", \"DTnasc\", \"SEXO\", \"PESO\", \"IDcidade\", \"Endereco\", \"Telefone\", \"DTinicio\", \"Altura\", \"ExameAm\")\n" +
                    "VALUES ("+idPessoa+", '"+nome+"', '"+cpf+"', '"+rg+"', '"+dataNasc+"', '"+sexo+"', "+peso+", "+idCidade+", '"+endereco+"', '"+telefone+"', '"+dataInicio+"', "+altura+", '"+exame+"');";
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
            result2.next();

        } catch (SQLException e) {
            //Vai exibir os erros caso não de certo para cadastrar
            e.printStackTrace();
        }
    }
}
