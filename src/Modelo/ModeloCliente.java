
package Modelo;


public class ModeloCliente {
    
  private int id;
  private String nome;
  private String documento;
  private String numero;
  private String endereco;
  private String telefone;
  private String dataCriacao;

    public ModeloCliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "ModeloCliente{" + "id=" + id + ", nome=" + nome + ", documento=" + documento + ", numero=" + numero + ", endereco=" + endereco + ", telefone=" + telefone + ", dataCriacao=" + dataCriacao + '}';
    }
    
    
  
  
    
}
