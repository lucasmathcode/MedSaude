package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class I5_ListarConsultas_DAO {

    private Connection conexao;

    public ArrayList<Object> ListaConsultas() throws SQLException, ParseException {
        conexao = (Connection) new ConnectionFactory().getConnection();
        PreparedStatement comando_sql = null;
        ResultSet resultado = null;
        ArrayList<Object> TabConsultas = new ArrayList<Object>();

        comando_sql = conexao.prepareStatement("""
       select tbl_paciente.nome, tbl_paciente.cpf, tbl_consulta.data_consulta, 
        tbl_consulta.horario, tbl_consulta.medico
        from tbl_consulta inner join tbl_paciente on tbl_consulta.id_paciente = 
        tbl_paciente.id_paciente order by tbl_paciente.nome;""");
        resultado = comando_sql.executeQuery();
        while (resultado.next()) {
            Object[] Consulta = new Object[5];
            Consulta[0] = resultado.getString(1);
            Consulta[1] = resultado.getString(2);
            Consulta[2] = resultado.getString(3);
            Consulta[3] = resultado.getString(4);
            Consulta[4] = resultado.getString(5);
            TabConsultas.add(Consulta);
        }
        comando_sql.close();
        conexao.close();
        return TabConsultas;

    }

}
