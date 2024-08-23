package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class I5_ListarPaciente_DAO {
    private Connection conexao;

    public ArrayList<Object> ListaPaciente() throws SQLException, ParseException {
        conexao = (Connection) new ConnectionFactory().getConnection();
        PreparedStatement comando_sql = null;
        ResultSet resultado = null;
        ArrayList<Object> TabConsultas = new ArrayList<Object>();

        comando_sql = conexao.prepareStatement("SELECT nome, cpf, data_nascimento, rua, telefone FROM tbl_paciente");
        resultado = comando_sql.executeQuery();
        while (resultado.next()) {
            Object[] Paciente = new Object[5];
            Paciente[0] = resultado.getString(1);
            Paciente[1] = resultado.getString(2);
            Paciente[2] = resultado.getString(3);
            Paciente[3] = resultado.getString(4);
            Paciente[4] = resultado.getString(5);
            TabConsultas.add(Paciente);
        }
        comando_sql.close();
        conexao.close();
        return TabConsultas;

    }
    
}
