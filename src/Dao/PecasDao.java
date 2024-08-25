
package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloPecas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PecasDao extends Conexao_MySql {
    
    public boolean verificarExistenciaPecasDao(ModeloPecas modeloPecas) {
    boolean pecaExiste = false;
    try {
        String query = "SELECT COUNT(*) FROM peca WHERE descricao = ?";
        PreparedStatement stmt = conectar().prepareStatement(query);
        stmt.setString(1, modeloPecas.getDescriacao());
        
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                pecaExiste  = true;
            }
        }
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return pecaExiste ;
}
     
      public int salvarPecaDao(ModeloPecas modeloPecas){
        
        try{
            
        this.conectar();
       return this.insertSQL(
               
         "INSERT INTO peca ("
                
                 +" id,"
                 +" descricao,"
                 +" precoCompra,"
                 +" precoVenda,"
                 +" quantidade "
           
                 
                
                +") VALUES ("
                
                 +"'"+modeloPecas.getId()+"',"
                 +"'"+modeloPecas.getDescriacao()+"',"
                 +"'"+modeloPecas.getPrecocompra()+"',"
                 +"'"+modeloPecas.getPrecovenda()+"',"
                 +"'"+modeloPecas.getQuantidade()+"' "
               
             
                 + ");"
        );
            
        }catch(Exception e){
         e.printStackTrace();
         
          return 0;
          
      }finally{
          this.fecharConexao();
      }    
     }
      
    public ModeloPecas getPecasPeloNomeDao(String descricao) {
    ModeloPecas modeloPecas = new ModeloPecas();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT "+ 
                 "id, "+
                 "descricao, "+
                 "precoCompra, "+
                 "precoVenda, "+
                 "quantidade, "+
                 "data "+   
                 "FROM "+
                 "peca "+ 
                 "WHERE "+ 
                 "descricao = '" + descricao + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloPecas.setId(this.getResultSet().getInt(1));
            modeloPecas.setDescriacao(this.getResultSet().getString(2));
            modeloPecas.setPrecocompra(this.getResultSet().getDouble(3));
            modeloPecas.setPrecovenda(this.getResultSet().getDouble(4));
            modeloPecas.setQuantidade(this.getResultSet().getInt(5));
            modeloPecas.setDatacriacao(this.getResultSet().getString(6));
            
            
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return  modeloPecas;
}
     public ArrayList<ModeloPecas> getListaPecasDao() {
    ArrayList<ModeloPecas> listaModeloPecas = new ArrayList<>();
    
    try {
        this.conectar();
        this.executarSQL(
            "SELECT "+ 
                 "id, "+
                 "descricao, "+
                 "precoCompra, "+
                 "precoVenda, "+
                 "quantidade, "+
                 "data "+  
                 "FROM "+
                 "peca"
        );
        
        while (this.getResultSet().next()) {
            ModeloPecas modeloPecas = new  ModeloPecas(); 
            modeloPecas.setId(this.getResultSet().getInt(1));
            modeloPecas.setDescriacao(this.getResultSet().getString(2));
            modeloPecas.setPrecocompra(this.getResultSet().getDouble(3));
            modeloPecas.setPrecovenda(this.getResultSet().getDouble(4));
            modeloPecas.setQuantidade(this.getResultSet().getInt(5));
            modeloPecas.setDatacriacao(this.getResultSet().getString(6));
            
            listaModeloPecas.add(modeloPecas);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    
    return listaModeloPecas;
}
     
 public boolean apagarPecasDao(int id){
        
        try{
             this.conectar();
             return this.executarUpdateDeleteSQL(
                 "DELETE FROM peca "
                
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
 
  public boolean AtualizarPecasDao(ModeloPecas modeloPecas) {
     
          try {
        this.conectar();
        
        String sql = "UPDATE peca SET " +
                     "descricao = '" + modeloPecas.getDatacriacao() + "', " +
                     "precoCompra = '" + modeloPecas.getPrecocompra()+ "', " +
                     "precoVenda = '" + modeloPecas.getPrecovenda() + "', " +
                     "quantidade = '" + modeloPecas.getQuantidade() + "' " +
                     
                "WHERE id = '" + modeloPecas.getId() + "'";
                     
        return this.executarUpdateDeleteSQL(sql);
    } catch(Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        this.fecharConexao();
    }
} 

  public int contarPecasDao() {
    String query = "SELECT COUNT(*) as total FROM peca";
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
