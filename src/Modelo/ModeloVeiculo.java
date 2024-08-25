
package Modelo;


public class ModeloVeiculo {
    
    private int id;
    private String matricula;
    private String modelo;
    private String marca;
    private String cliente;
    private String dataCriacao;

    public ModeloVeiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "MedeloVeiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", cliente=" + cliente + ", dataCriacao=" + dataCriacao + '}';
    }
    
    
    
}
