
package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloMecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Mecanicodao extends Conexao_MySql{
    
     public boolean verificarExistenciaPecasDao(ModeloMecanico modeloMecanico) {
    boolean mecanicoExiste = false;
    try {
        String query = "SELECT COUNT(*) FROM mecanicos WHERE nome = ?";
        PreparedStatement stmt = conectar().prepareStatement(query);
        stmt.setString(1, modeloMecanico.getNome());
        
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                mecanicoExiste  = true;
            }
        }
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return mecanicoExiste ;
}

 public int salvarMecanicoDao(ModeloMecanico modeloMecanico){
        
        try{
            
        this.conectar();
       return this.insertSQL(
               
         "INSERT INTO mecanicos ("
                
                 +" id,"
                 +" nome,"
                 +" endereco,"
                 +" telefone,"
                 +" especialidade "
                    
                 
                
                +") VALUES ("
                
                 +"'"+modeloMecanico.getId()+"',"
                 +"'"+modeloMecanico.getNome()+"',"
                 +"'"+modeloMecanico.getEndereco()+"',"
                 +"'"+modeloMecanico.getTelefone()+"',"
                 +"'"+modeloMecanico.getEspecialidade()+"' "
                
             
                 + ");"
        );
            
        }catch(Exception e){
         e.printStackTrace();
         
          return 0;
          
      }finally{
          this.fecharConexao();
      }    
     
 }
 
 public ModeloMecanico getMecanicoPeloNomeDao(String nome) {
    ModeloMecanico modeloMecanico = new ModeloMecanico();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                 +" id,"
                 +" nome,"
                 +" endereco,"
                 +" telefone,"
                 +" especialidade,"
                 +" data "   
                 +" FROM "
                 + " mecanicos" 
                 + " WHERE" 
                 + " nome = '" + nome + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloMecanico.setId(this.getResultSet().getInt(1));
            modeloMecanico.setNome(this.getResultSet().getString(2));
            modeloMecanico.setEndereco(this.getResultSet().getString(3));
            modeloMecanico.setTelefone(this.getResultSet().getString(4));
            modeloMecanico.setEspecialidade(this.getResultSet().getString(5));
            modeloMecanico.setDataCriacao(this.getResultSet().getString(6));
            
            
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return  modeloMecanico;
}
 
 public ModeloMecanico getMecanicoPeloIdDao(int id) {
    ModeloMecanico modeloMecanico = new ModeloMecanico();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                 +" id,"
                 +" nome,"
                 +" endereco,"
                 +" telefone,"
                 +" especialidade,"
                 +" data "   
                 +" FROM "
                 + " mecanicos" 
                 + " WHERE" 
                 + " id = '" + id + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloMecanico.setId(this.getResultSet().getInt(1));
            modeloMecanico.setNome(this.getResultSet().getString(2));
            modeloMecanico.setEndereco(this.getResultSet().getString(3));
            modeloMecanico.setTelefone(this.getResultSet().getString(4));
            modeloMecanico.setEspecialidade(this.getResultSet().getString(5));
            modeloMecanico.setDataCriacao(this.getResultSet().getString(6));
            
            
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return  modeloMecanico;
}
 
  public ArrayList<ModeloMecanico> getListaMecanicoDao() {
    ArrayList<ModeloMecanico> listaModeloMecanicos = new ArrayList<>();
    
    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                 +" id,"
                 +" nome,"
                 +" endereco,"
                 +" telefone,"
                 +" especialidade,"
                 +" data "   
                 +" FROM "
                 + " mecanicos" 
        );
        
        while (this.getResultSet().next()) {
            ModeloMecanico modeloMecanico = new  ModeloMecanico(); 
            modeloMecanico.setId(this.getResultSet().getInt(1));
            modeloMecanico.setNome(this.getResultSet().getString(2));
            modeloMecanico.setEndereco(this.getResultSet().getString(3));
            modeloMecanico.setTelefone(this.getResultSet().getString(4));
            modeloMecanico.setEspecialidade(this.getResultSet().getString(5));
            modeloMecanico.setDataCriacao(this.getResultSet().getString(6));

            
            listaModeloMecanicos.add(modeloMecanico);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    
    return listaModeloMecanicos;
}
  
  public boolean apagarMecanicoDao(int id){
        
        try{
             this.conectar();
             return this.executarUpdateDeleteSQL(
                 "DELETE FROM mecanicos "
                
            + " WHERE "
               + " id = '" + id + "'"
            +";"
                     
             );
             
         }catch(Exception e){
             e.printStackTrace();
             return false;     
             
          }finally{
             this.fecharConexao();
             
         }
        
    }
  
  public boolean AtualizarMecanicoDao(ModeloMecanico modeloMecanico) {
     
          try {
        this.conectar();
        
        String sql = "UPDATE mecanicos SET " +
                     "nome = '" + modeloMecanico.getNome()+ "', " +
                     "endereco = '" + modeloMecanico.getEndereco()+ "', " +
                     "telefone = '" + modeloMecanico.getTelefone()+ "', " +
                     "especialidade = '" + modeloMecanico.getEspecialidade()+ "' " +
                     
                "WHERE id = '" + modeloMecanico.getId() + "'";
                     
        return this.executarUpdateDeleteSQL(sql);
    } catch(Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        this.fecharConexao();
    }
} 

  public int contarMecanicosDao() {
    String query = "SELECT COUNT(*) as total FROM mecanicos";
    try (Connection conn = conectar();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            return rs.getInt("total");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return 0;
}
    
}
