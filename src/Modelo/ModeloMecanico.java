
package Modelo;


public class ModeloMecanico {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String especialidade;
    private String dataCriacao;

    public ModeloMecanico() {
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "ModeloMecanico{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", especialidade=" + especialidade + ", dataCriacao=" + dataCriacao + '}';
    }
    
    
    
    
}
