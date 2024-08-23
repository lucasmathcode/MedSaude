package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import Model.Login;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class I1_Login_DAO {
    private Connection conexao;
/*E pq boleano? Pq ele vai me retornar uma verdade, se caso o usuário já estiver no bd, e falso, caso o usuário não tenha cadastro do bd*/
    
    public boolean logincheck(Login G) throws SQLException{
        conexao = (Connection) new ConnectionFactory().getConnection();
        boolean check = false;
        //Para que o sistema entenda o comando sql, precisamos usar a classe "PreparedStatement".
        PreparedStatement comando_sql = null;
        //E sempre vamos precisar de um resultado quando usarmos o "SELECT"
        ResultSet resultado = null;
        //?= Significa que nessas posições algum dado vai ser mandado
        comando_sql = conexao.prepareStatement("SELECT * FROM tbl_login WHERE usuario = ? and senha = ?");
        comando_sql.setString(1, G.getUsuario());
        comando_sql.setString(2, G.getSenha());
        resultado = comando_sql.executeQuery();
        if(resultado.next()){
            check = true;
        }        
        return check;
    }       
}
