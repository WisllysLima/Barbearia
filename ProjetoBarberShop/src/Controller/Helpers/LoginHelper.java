package Controller.Helpers;

import Model.Usuario;
import View.Login;

public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario obterModelo() {
        String nome = view.getTextUsuarioLogin().getText();
        String senha = view.getTextSenhaLogin().getText();

        Usuario modelo = new Usuario(01, "Admin", "admin123");

        return modelo;
    }

    public void setarModelo(Usuario modelo) {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();

        view.getTextUsuarioLogin().setText(nome);
        view.getTextSenhaLogin().setText(senha);

    }

    public void limparTela() {
        view.getTextUsuarioLogin().setText("");
        view.getTextSenhaLogin().setText("");
    }
}
