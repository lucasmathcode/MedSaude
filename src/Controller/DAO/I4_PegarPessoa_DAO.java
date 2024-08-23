package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;

public class I4_PegarPessoa_DAO {

    private Connection conexao;  // Variável que guarda a conexão com o banco de dados.

    public Pessoa PegarPessoa(String CPF) throws SQLException, ParseException {
        conexao = (Connection) new ConnectionFactory().getConnection();  // Abre uma conexão com o banco de dados.
        PreparedStatement comando_sql = null;
        ResultSet resultado = null;  // Variáveis para o comando SQL e o resultado da consulta.

        comando_sql = conexao.prepareStatement("SELECT * FROM tbl_paciente WHERE cpf = ?"); 
        comando_sql.setString(1, CPF);  // Define o valor do parâmetro CPF na consulta.

        resultado = comando_sql.executeQuery();  // Executa a consulta e guarda o resultado.
        if (resultado.next()) {  // Se a consulta encontrou um registro:

            String nome = resultado.getString("nome");  // Pega o nome do paciente.
            String cpf = resultado.getString("cpf");  // Pega o CPF do paciente.
            String tel = resultado.getString("telefone");  // Pega o telefone do paciente.
            String rua = resultado.getString("rua");  // Pega a rua do paciente.

            String aniversario;
            Calendar calendario = Calendar.getInstance();  // Objeto para trabalhar com datas.
            calendario.setTime(resultado.getDate("data_nascimento"));  // Configura o calendário com a data de nascimento.
            aniversario = calendario.get(Calendar.DAY_OF_MONTH) + "/"
                    + (calendario.get(Calendar.MONTH) + 1) + "/"
                    + calendario.get(Calendar.YEAR);  // Formata a data de nascimento.

            Pessoa P = new Pessoa(nome, cpf, aniversario, tel, rua);  // Cria um objeto Pessoa com os dados recuperados.

            comando_sql.close();  // Fecha o comando SQL.
            conexao.close();  // Fecha a conexão com o banco de dados.
            return P;  // Retorna o objeto Pessoa.
        }

        comando_sql.close();  // Fecha o comando SQL.
        conexao.close();  // Fecha a conexão com o banco de dados.
        return null;  // Retorna null se nenhum paciente foi encontrado.
    }

    public int Pegar_idpessoa(String CPF) throws SQLException, ParseException {
        conexao = (Connection) new ConnectionFactory().getConnection();  // Abre uma conexão com o banco de dados.
        PreparedStatement comando_sql = null;
        ResultSet resultado = null;
        int id_pessoa = 0;  // Variáveis para o comando SQL, o resultado da consulta e o ID da pessoa.

        comando_sql = conexao.prepareStatement("SELECT id_paciente FROM tbl_paciente WHERE cpf = ?");
        comando_sql.setString(1, CPF);  // Define o valor do parâmetro CPF na consulta.

        resultado = comando_sql.executeQuery();  // Executa a consulta e guarda o resultado.
        if (resultado.next()) {  // Se a consulta encontrou um registro:
            id_pessoa = resultado.getInt("id_paciente");  // Pega o ID do paciente.
        }

        comando_sql.close();  // Fecha o comando SQL.
        conexao.close();  // Fecha a conexão com o banco de dados.
        return id_pessoa;  // Retorna o ID do paciente ou 0 se não encontrado.
    }
}