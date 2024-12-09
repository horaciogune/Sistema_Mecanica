
package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ClienteDao extends Conexao_MySql{
    
    public boolean verificarExistenciaClienteDao(ModeloCliente cliente) {
    boolean ClienteExiste = false;
    try {
        String query = "SELECT COUNT(*) FROM clientes WHERE nome = ?";
        PreparedStatement stmt = conectar().prepareStatement(query);
        stmt.setString(1, cliente.getNome());
        
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                ClienteExiste = true;
            }
        }
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ClienteExiste;
}
     
      public int salvarClienteDao(ModeloCliente modeloCliente){
        
        try{
            
        this.conectar();
       return this.insertSQL(
               
         "INSERT INTO clientes ("
                
                 +" id,"
                 +" nome,"
                 +" documento,"
                 +" numero,"
                 +" endereco,"
                 +" telefone "
              
                +") VALUES ("
                
                 +"'"+modeloCliente.getId()+"',"
                 +"'"+modeloCliente.getNome()+"',"
                 +"'"+modeloCliente.getDocumento()+"',"
                 +"'"+modeloCliente.getNumero()+"',"
                 +"'"+modeloCliente.getEndereco()+"',"
                 +"'"+modeloCliente.getTelefone()+"'"
             
                 + ");"
        );
            
        }catch(Exception e){
         e.printStackTrace();
         
          return 0;
          
      }finally{
          this.fecharConexao();
      }    
     }
    
    public ModeloCliente getClientePeloNomeDao(String nome) {
    ModeloCliente modeloCliente = new ModeloCliente();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                +" id,"
                 +" nome,"
                 +" documento,"
                 +" numero,"
                 +" endereco,"
                 +" telefone,"
                 +" data "   
                 + "FROM "
                 + " clientes" 
                 + " WHERE" 
                 + " nome = '" + nome + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloCliente.setId(this.getResultSet().getInt(1));
            modeloCliente.setNome(this.getResultSet().getString(2));
            modeloCliente.setDocumento(this.getResultSet().getString(3));
            modeloCliente.setNumero(this.getResultSet().getString(4));
            modeloCliente.setEndereco(this.getResultSet().getString(5));
            modeloCliente.setTelefone(this.getResultSet().getString(6));
            modeloCliente.setDataCriacao(this.getResultSet().getString(7));
            
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return modeloCliente;
}
    public ModeloCliente getClientePeloIdDao(int id) {
    ModeloCliente modeloCliente = new ModeloCliente();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                 +" id,"
                 +" nome,"
                 +" documento,"
                 +" numero,"
                 +" endereco,"
                 +" telefone,"
                 +" data "   
                 + "FROM "
                 + " clientes" 
                 + " WHERE" 
                 + " id = '" + id + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloCliente.setId(this.getResultSet().getInt(1));
            modeloCliente.setNome(this.getResultSet().getString(2));
            modeloCliente.setDocumento(this.getResultSet().getString(3));
            modeloCliente.setNumero(this.getResultSet().getString(4));
            modeloCliente.setEndereco(this.getResultSet().getString(5));
            modeloCliente.setTelefone(this.getResultSet().getString(6));
            modeloCliente.setDataCriacao(this.getResultSet().getString(7));
            
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return modeloCliente;
}

    public ArrayList<ModeloCliente> getListaClienteDao() {
    ArrayList<ModeloCliente> listaModeloCliente = new ArrayList<>();
    
    try {
        this.conectar();
        this.executarSQL(
            "SELECT " +
                 "id, "+
                 "nome, "+
                 "documento, "+
                 "numero, "+
                 "endereco, "+
                 "telefone, "+
                 "data "+   
            "FROM clientes"
        );
        
        while (this.getResultSet().next()) {
            ModeloCliente modeloCliente = new  ModeloCliente(); 
            modeloCliente.setId(this.getResultSet().getInt(1));
            modeloCliente.setNome(this.getResultSet().getString(2));
            modeloCliente.setDocumento(this.getResultSet().getString(3));
            modeloCliente.setNumero(this.getResultSet().getString(4));
            modeloCliente.setEndereco(this.getResultSet().getString(5));
            modeloCliente.setTelefone(this.getResultSet().getString(6));
            modeloCliente.setDataCriacao(this.getResultSet().getString(7));
            
            listaModeloCliente.add(modeloCliente);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    
    return listaModeloCliente;
}
     
     public boolean apagarClienteDao(int codigo){
        
        try{
             this.conectar();
             return this.executarUpdateDeleteSQL(
                 "DELETE FROM clientes "
                
            + " WHERE "
               + " id = '" + codigo + "'"
            +";"
                     
             );
             
         }catch(Exception e){
             e.printStackTrace();
             return false;     
             
          }finally{
             this.fecharConexao();
             
         }
        
    }
  
    public boolean AtualizarClienteDao(ModeloCliente modeloCliente) {
     
          try {
        this.conectar();
        
        String sql = "UPDATE clientes SET " +
                     "nome = '" + modeloCliente.getNome() + "', " +
                     "documento = '" + modeloCliente.getDocumento()+ "', " +
                     "numero = '" + modeloCliente.getNumero() + "', " +
                     "endereco = '" + modeloCliente.getEndereco() + "', " +
                     "telefone = '" + modeloCliente.getTelefone() + "' " +
                     
                "WHERE id = '" + modeloCliente.getId() + "'";
                     
        return this.executarUpdateDeleteSQL(sql);
    } catch(Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        this.fecharConexao();
    }
} 
    
public int contarClintesDao() {
    String query = "SELECT COUNT(*) as total FROM clientes";
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
