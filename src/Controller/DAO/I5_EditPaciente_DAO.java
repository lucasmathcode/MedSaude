package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import Model.Consulta;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class I5_EditPaciente_DAO {

    private Connection conexao;

    public boolean AlterarPaciente(Pessoa P) throws SQLException, ParseException {
        conexao = new ConnectionFactory().getConnection();
        PreparedStatement comando_sql = null;

        try {

            // Segunda atualização com todos os campos
            comando_sql = conexao.prepareStatement("UPDATE tbl_paciente SET nome=?, "
                    + "data_nascimento=?, cpf=?, telefone=?, rua=? WHERE cpf=?");
            comando_sql.setString(1, P.getNome());
            comando_sql.setString(2, P.getData_Niver());
            comando_sql.setString(3, P.getCPF());
            comando_sql.setString(4, P.getTelefone());
            comando_sql.setString(5, P.getRua());
            comando_sql.setString(6, P.getCPF()); // CPF novamente para o WHERE
            comando_sql.executeUpdate(); // Usar executeUpdate para atualizações

            return true;
        } finally {
            if (comando_sql != null) {
                comando_sql.close();
            }
            conexao.close();
        }
    }

    public boolean AlterarCpf(String cpfAntigo, String cpfNovo) throws SQLException {
        conexao = new ConnectionFactory().getConnection();
        PreparedStatement comando_sql = null;

        try {
            comando_sql = conexao.prepareStatement("UPDATE tbl_paciente SET cpf = ? WHERE cpf = ?");
            comando_sql.setString(1, cpfNovo);
            comando_sql.setString(2, cpfAntigo);
            int rowsUpdated = comando_sql.executeUpdate();
            return rowsUpdated > 0;
        } finally {
            if (comando_sql != null) {
                comando_sql.close();
            }
            conexao.close();
        }
    }

    public Object[] Pegar_uma_Pessoa(String CPF) throws SQLException, ParseException {
        conexao = new ConnectionFactory().getConnection();
        PreparedStatement comando_sql = null;
        ResultSet resultado = null;
        Object[] Pessoa = new Object[6];

        try {
            comando_sql = conexao.prepareStatement("SELECT nome, data_nascimento, cpf, telefone, rua FROM tbl_paciente WHERE cpf = ?");
            comando_sql.setString(1, CPF);
            resultado = comando_sql.executeQuery();

            if (resultado.next()) {
                Pessoa[0] = resultado.getString(1); // nome
                Pessoa[1] = Dia(resultado.getString(2)); // dia
                Pessoa[2] = Mes(resultado.getString(2)); // mês
                Pessoa[3] = Ano(resultado.getString(2)); // ano
                Pessoa[4] = resultado.getString(4); // telefone
                Pessoa[5] = resultado.getString(5); // rua
            }

            return Pessoa;
        } finally {
            if (resultado != null) {
                resultado.close();
            }
            if (comando_sql != null) {
                comando_sql.close();
            }
            conexao.close();
        }

    }

    private String Dia(String data) {
        String aux = "";
        for (int i = 8; i < 10; i++) {
            aux += data.charAt(i);
        }
        return aux;
    }

    private String Mes(String data) {
        String aux = "";
        for (int i = 5; i < 7; i++) {
            aux += data.charAt(i);
        }
        return aux;
    }

    private String Ano(String data) {
        String aux = "";
        for (int i = 0; i < 4; i++) {
            aux += data.charAt(i);
        }
        return aux;
    }

}
