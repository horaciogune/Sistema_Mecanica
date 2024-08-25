
package Modelo;


public class ModeloOrdemServico {
    
    private int id;
    private String dataAbertura;
    private String dataFechamento;
    private int idCliente;
    private String nomeCliente;
    private String matriculaVeiculo;
    private String marcaVeiculo;
    private String servico;
    private String pecas;
    private double precoTotal;
    private String problema;
    private String observacoes;
    private String nomeMecanico;
    private String status;

    public ModeloOrdemServico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMatriculaVeiculo() {
        return matriculaVeiculo;
    }

    public void setMatriculaVeiculo(String matriculaVeiculo) {
        this.matriculaVeiculo = matriculaVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

  
    public String getNomeMecanico() {
        return nomeMecanico;
    }

    public void setNomeMecanico(String nomeMecanico) {
        this.nomeMecanico = nomeMecanico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ModeloOrdemServico{" + "id=" + id + ", dataAbertura=" + dataAbertura + ", dataFechamento=" + dataFechamento + ", idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", matriculaVeiculo=" + matriculaVeiculo + ", marcaVeiculo=" + marcaVeiculo + ", servico=" + servico + ", pecas=" + pecas + ", precoTotal=" + precoTotal + ", problema=" + problema + ", observacoes=" + observacoes + ", nomeMecanico=" + nomeMecanico + ", status=" + status + '}';
    }

   
    
}
