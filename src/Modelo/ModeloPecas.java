
package Modelo;


public class ModeloPecas {
    
    private int id;
    private String descriacao;
    private double precocompra;
    private double precovenda;
    private int quantidade;
    private String datacriacao;

    public ModeloPecas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(String datacriacao) {
        this.datacriacao = datacriacao;
    }

    @Override
    public String toString() {
        return "ModeloPecas{" + "id=" + id + ", descriacao=" + descriacao + ", precocompra=" + precocompra + ", precovenda=" + precovenda + ", quantidade=" + quantidade + ", datacriacao=" + datacriacao + '}';
    }
    
    


}
