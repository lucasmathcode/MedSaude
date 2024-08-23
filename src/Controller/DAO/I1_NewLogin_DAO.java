package Controller.DAO;

import Conexao_BD.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class I1_NewLogin_DAO {
    private Connection conexao;
    // Declaração de uma variável de instância privada para armazenar a conexão com o banco de dados.

    public void addadm(String usuario, String senha) throws SQLException {
        // Método público addadm que recebe um nome de usuário e uma senha como parâmetros.

        conexao = (Connection) new ConnectionFactory().getConnection();
        // Inicializa a conexão com o banco de dados usando uma fábrica de conexões.
        // ConnectionFactory é presumivelmente uma classe que gerencia a criação de conexões.

        PreparedStatement comando_sql = null;
        //Para que o sistema entenda o comando sql, precisamos usar a classe "PreparedStatement".

        comando_sql = conexao.prepareStatement("INSERT INTO tbl_login (usuario, senha) VALUES (?, ?)");
        // Inicializa o objeto PreparedStatement com um comando SQL para inserir um novo registro na tabela tbl_login.
        //?= Significa que nessas posições algum dado vai ser mandado

        comando_sql.setString(1, usuario);
        comando_sql.setString(2, senha);
        // Define os valores dos parâmetros no comando SQL.
        // O primeiro parâmetro (?) será substituído pelo valor da variável 'usuario'.
        // O segundo parâmetro (?) será substituído pelo valor da variável 'senha'.

        comando_sql.execute();
        // Executa o comando SQL, inserindo os valores no banco de dados.

        comando_sql.close();
        // Fecha o objeto PreparedStatement para liberar os recursos.

        conexao.close();
        // Fecha a conexão com o banco de dados para liberar os recursos.
    }
}
