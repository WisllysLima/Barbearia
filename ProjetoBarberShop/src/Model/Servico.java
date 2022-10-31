package Model;

public class Servico {

    private int id;
    private String descricao;
    private double valor;

    public Servico(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void visualizarServico() {
        
        System.out.printf("ID: %d, \nDescricao: %s, \nValor: %.2f\n", 
                this.id, this.descricao, this.valor);
        System.out.println("----------------------------------------------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
