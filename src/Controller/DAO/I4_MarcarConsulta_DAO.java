package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import Model.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class I4_MarcarConsulta_DAO {

    private Connection conexao;

    public void MarcConsul(Consulta c, int id_pessoa) throws SQLException {
        conexao = (Connection) new ConnectionFactory().getConnection();
        PreparedStatement comando_sql = null;

        comando_sql = conexao.prepareStatement("INSERT INTO tbl_consulta (data_consulta, horario, medico, id_paciente) VALUES (?,?,?,?)");
        comando_sql.setString(1, c.getData_Niver());
        comando_sql.setString(2, c.getHorario());
        comando_sql.setString(3, c.getMedico());
        comando_sql.setInt(4, id_pessoa);
        comando_sql.execute();
        comando_sql.close();
        conexao.close();

    }
   
}
