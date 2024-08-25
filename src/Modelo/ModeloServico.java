
package Modelo;


public class ModeloServico {
    
    private int id;
    private String descricao;
    private double valor;
    private String tempoEstimado;
    private String pecas;
    private String dataCriacao;

    public ModeloServico() {
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

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "ModeloServico{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", tempoEstimado=" + tempoEstimado + ", pecas=" + pecas + ", dataCriacao=" + dataCriacao + '}';
    }
    
    
    
}
