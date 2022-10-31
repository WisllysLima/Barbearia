package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList();

    public ClienteDAO() {
        conexao = new ConnectionFactory().getConexao();
    }

    public ArrayList<Cliente> listarAlunos(String sql) {
        //String sql = "SELECT * FROM aluno";

        try {
            pstm = (com.mysql.jdbc.PreparedStatement) conexao.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));

                lista.add(cliente);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Clientes" + e);
        }
        return lista;
    }

    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, sobrenome, email, telefone) VALUES (?,?,?,?)";

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
