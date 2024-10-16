
package Modelo;


public class ModeloFatura {
    
    private int id;
    private int idOrdem;
    private String metodoPagamento;
    private double valorApagar;
    private double valorRecebido;
    private double trocos;

    public ModeloFatura() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(double valorApagar) {
        this.valorApagar = valorApagar;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getTrocos() {
        return trocos;
    }

    public void setTrocos(double trocos) {
        this.trocos = trocos;
    }

    @Override
    public String toString() {
        return "ModeloFatura{" + "id=" + id + ", idOrdem=" + idOrdem + ", metodoPagamento=" + metodoPagamento + ", valorApagar=" + valorApagar + ", valorRecebido=" + valorRecebido + ", trocos=" + trocos + '}';
    }
    
    
    
    
    
    
}
