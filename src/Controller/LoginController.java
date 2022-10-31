package Controller;

import Controller.Helpers.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        //Pegar o usuario da view;
        Usuario usuario = helper.obterModelo();
        //Pesquisa o usuario no banco;
        // Se o usuario da view tiver o mesmo usuario e senha que vem do banco, vou direcionar para o menu;
        //se nao, vou mostrar uma mensagem ao usuario "usuario e senha invalidos";

    }

    public void FizTarefa() {
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
