package Model;

import java.util.Date;

public class Cliente extends Pessoa {

    private String senha;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
        this.senha = senha;
    }

    public Cliente(int id, String nome, String sobrenome, String dataNascimento, String telefone, String email, String senha) {
        super(id, nome, sobrenome, dataNascimento, telefone, email);
        this.senha = senha;
    }

    public void visualizarCadastro() {

        System.out.printf("ID: %d, \nNome: %s, \nSobrenome: %s, \nNascimento: %s,\nTelefone: %s, \nEmail: %s, \nSenha: %s\n",
                id, nome, sobrenome, dataNascimento, telefone, email, senha);
        System.out.println("----------------------------------------------------");
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
