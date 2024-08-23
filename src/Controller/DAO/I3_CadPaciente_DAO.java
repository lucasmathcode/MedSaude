package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class I3_CadPaciente_DAO {
    private Connection conexao;
    public void AddPac(Pessoa P) throws SQLException{
    conexao = (Connection) new ConnectionFactory().getConnection();
    PreparedStatement comando_sql = null;
    
    comando_sql = conexao.prepareStatement("INSERT INTO tbl_paciente (nome, data_nascimento, cpf, telefone, rua) VALUES (?,?,?,?,?)");
    comando_sql.setString(1, P.getNome());
    comando_sql.setString(2, P.getData_Niver());
    comando_sql.setString(3, P.getCPF());
    comando_sql.setString(4, P.getTelefone());
    comando_sql.setString(5, P.getRua());
    comando_sql.execute();
    comando_sql.close();
    conexao.close();
    
    }   
}
