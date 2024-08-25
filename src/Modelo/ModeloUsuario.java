
package Modelo;


public class ModeloUsuario {
    
    private int id;
    private String nome;
    private String username;
    private String sexo;
    private String email;
    private String estado;
    private String perfil;
    private String senha;
    private String dataCriacao;

    public ModeloUsuario() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "ModeloUsuario{" + "id=" + id + ", nome=" + nome + ", username=" + username + ", sexo=" + sexo + ", email=" + email + ", estado=" + estado + ", perfil=" + perfil + ", senha=" + senha + ", dataCriacao=" + dataCriacao + '}';
    }

   
    
}
