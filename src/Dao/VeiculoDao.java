
package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloVeiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class VeiculoDao extends Conexao_MySql{
    
    public boolean verificarExistenciaVeiculoDao(ModeloVeiculo veiculo) {
    boolean veiculoexiste = false;
    try {
        String query = "SELECT COUNT(*) FROM veiculo WHERE matricula = ?";
        PreparedStatement stmt = conectar().prepareStatement(query);
        stmt.setString(1, veiculo.getMatricula());
        
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                veiculoexiste = true;
            }
        }
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return veiculoexiste;
}
     
      public int salvarVeiculoDao(ModeloVeiculo modeloVeiculo){
        
        try{
            
        this.conectar();
       return this.insertSQL(
               
         "INSERT INTO veiculo ("
                
                 +" id,"
                 +" matricula,"
                 +" modelo,"
                 +" marca,"
                 +" cliente "
                 
                +") VALUES ("
                
                 +"'"+modeloVeiculo.getId()+"',"
                 +"'"+modeloVeiculo.getMatricula()+"',"
                 +"'"+modeloVeiculo.getModelo()+"',"
                 +"'"+modeloVeiculo.getMarca()+"',"
                 +"'"+modeloVeiculo.getCliente()+"'"
             
                 + ");"
        );
            
        }catch(Exception e){
         e.printStackTrace();
         
          return 0;
          
      }finally{
          this.fecharConexao();
      }    
     }
    
 public ModeloVeiculo getVeiculoPelaMatricula(String matricula) {
   ModeloVeiculo modeloVeiculo = new ModeloVeiculo();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                
                 +" id,"
                 +" matricula,"
                 +" modelo,"
                 +" marca,"
                 +" cliente,"
                 +" data "
                 +" FROM "
                 +" veiculo" 
                 +" WHERE" 
                 +" matricula = '" + matricula + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloVeiculo.setId(this.getResultSet().getInt(1));
            modeloVeiculo.setMatricula(this.getResultSet().getString(2));
            modeloVeiculo.setModelo(this.getResultSet().getString(3));
            modeloVeiculo.setMarca(this.getResultSet().getString(4));
            modeloVeiculo.setCliente(this.getResultSet().getString(5));
            modeloVeiculo.setDataCriacao(this.getResultSet().getString(6));
         
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return modeloVeiculo;
}
 public ModeloVeiculo getVeiculoPeloId(int id) {
   ModeloVeiculo modeloVeiculo = new ModeloVeiculo();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT "+
                
                 "id, "+
                 "matricula, "+
                 "modelo, "+
                 "marca, "+
                 "cliente, "+
                 "data "+
                 "FROM "+
                 "veiculo "+ 
                 "WHERE "+ 
                 " id = '" + id + "'"  +";"
            
        );

        if (this.getResultSet().next()) {
            modeloVeiculo.setId(this.getResultSet().getInt(1));
            modeloVeiculo.setMatricula(this.getResultSet().getString(2));
            modeloVeiculo.setModelo(this.getResultSet().getString(3));
            modeloVeiculo.setMarca(this.getResultSet().getString(4));
            modeloVeiculo.setCliente(this.getResultSet().getString(5));
            modeloVeiculo.setDataCriacao(this.getResultSet().getString(6));
         
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return modeloVeiculo;
}
 
  public ArrayList<ModeloVeiculo> getListaVeiculosDao() {
    ArrayList<ModeloVeiculo> listaModeloVeiculo = new ArrayList<>();
    
    try {
        this.conectar();
        this.executarSQL(
            "SELECT "
                 +" id,"
                 +" matricula,"
                 +" modelo,"
                 +" marca,"
                 +" cliente,"
                 +" data "
                 +" FROM "
                 +" veiculo" 
        );
        
        while (this.getResultSet().next()) {
          ModeloVeiculo modeloVeiculo = new  ModeloVeiculo();
          modeloVeiculo.setId(this.getResultSet().getInt(1));
          modeloVeiculo.setMatricula(this.getResultSet().getString(2));
          modeloVeiculo.setModelo(this.getResultSet().getString(3));
          modeloVeiculo.setMarca(this.getResultSet().getString(4));
          modeloVeiculo.setCliente(this.getResultSet().getString(5));
          modeloVeiculo.setDataCriacao(this.getResultSet().getString(6));
            
         listaModeloVeiculo.add(modeloVeiculo);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    
    return listaModeloVeiculo;
}
   
 public boolean apagarVeiculoDao(int id){
        
        try{
             this.conectar();
             return this.executarUpdateDeleteSQL(
                 "DELETE FROM veiculo "
                
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
 
 public boolean AtualizarVeiculoDao(ModeloVeiculo modeloVeiculo) {
     
        try {
        this.conectar();
        
        String sql = "UPDATE veiculo SET " +
                     "matricula = '" + modeloVeiculo.getMatricula() + "', " +
                     "modelo = '" + modeloVeiculo.getModelo()+ "', " +
                     "marca = '" + modeloVeiculo.getMarca() + "', " +
                     "cliente = '" + modeloVeiculo.getCliente() + "' " +
                    
                     
                "WHERE id = '" + modeloVeiculo.getId() + "'";
                     
        return this.executarUpdateDeleteSQL(sql);
    } catch(Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        this.fecharConexao();
    }
} 
    
public int contarVeiculosDao() {
    String query = "SELECT COUNT(*) as total FROM veiculo";
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
