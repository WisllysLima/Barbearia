package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conexao;
    PreparedStatement pstm;

    public ClienteDAO() {
        conexao = new ConnectionFactory().getConexao();
    }

    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, sobrenome, email, telefone) VALUES (?,?,?,?)";

        try {
            pstm = (PreparedStatement) conexao.prepareStatement(sql);

            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSobrenome());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getTelefone());

            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cadastrar Cliente:" + e);
        }
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado:");
    }

}
