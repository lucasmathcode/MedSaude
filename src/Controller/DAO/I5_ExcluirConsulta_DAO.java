package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class I5_ExcluirConsulta_DAO {
    private Connection conexao;
    public void ExcluirConsult(String CPF) throws SQLException, ParseException{
    conexao = (Connection) new ConnectionFactory().getConnection();
    PreparedStatement comando_sql = null;
    
    I4_PegarPessoa_DAO pegarid = new I4_PegarPessoa_DAO();
    int id_remover = pegarid.Pegar_idpessoa(CPF);
    comando_sql = conexao.prepareStatement("DELETE FROM tbl_consulta WHERE id_paciente = ?");
    comando_sql.setInt(1, id_remover);
    comando_sql.execute();
    comando_sql.close();
    conexao.close();
    }   
    
    public void ExcluirPaciente(String CPF) throws SQLException, ParseException{
    conexao = (Connection) new ConnectionFactory().getConnection();
    PreparedStatement comando_sql = null;
    
    comando_sql = conexao.prepareStatement("DELETE FROM tbl_paciente WHERE cpf = ?");
    comando_sql.setString(1, CPF);
    comando_sql.execute();
    comando_sql.close();
    conexao.close();
    }   
  
}
