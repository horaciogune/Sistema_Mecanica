
package Modelo;

public class ModeloFluxo {
    private int id;               
    private String matricula;     
    private String estado;        
    private java.util.Date data;   

  
    public ModeloFluxo() {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public java.util.Date getData() {
        return data;
    }

    public void setData(java.util.Date data) {
        this.data = data;
    }

    
    @Override
    public String toString() {
        return "ModeloFluxo{" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", estado='" + estado + '\'' +
                ", data=" + data +
                '}';
    }
}

