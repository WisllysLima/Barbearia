package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    Connection conexao;

    public Connection getConexao() {
        try {
            conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/barbershop", "root", "");
            /*if (conexao != null) {
                System.out.println("Conexao estabelecida com o banco de dados!!");
            }*/
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conexao;
    }

}
