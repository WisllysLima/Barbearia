package View;

import Dao.ConnectionFactory;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {

    public static void main(String[] args) {
        
        ConnectionFactory cn = new ConnectionFactory();
        
        cn.getConexao();
        
        

        /*Usuario usuario = new Usuario(01, "Admin", "admin", "ADM", "22/05/1969", "85989732122", "will@gmail.com", "admin@2022");

        Cliente cliente = new Cliente(01, "Will", "Lima", "23/01/2001", "85989732122", "will@gmail.com", "182306");

        Servico servico = new Servico(01, "Corte Degrade", 25.0);
        
        Agendamento agendamento = new Agendamento(01,cliente,servico,30,"23/10/2022 15:00");

        servico.visualizarServico();
        cliente.visualizarCadastro();
        usuario.visualizarUsuario();
        
        System.out.println(agendamento.getCliente().getDataNascimento());*/
    }
}
