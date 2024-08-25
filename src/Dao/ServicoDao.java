
package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloServico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ServicoDao extends Conexao_MySql{
    
    public boolean verificarExistenciaServicoDao(ModeloServico servico) {
    boolean servicoExiste = false;
    try {
        String query = "SELECT COUNT(*) FROM servico WHERE descricao = ?";
        PreparedStatement stmt = conectar().prepareStatement(query);
        stmt.setString(1, servico.getDescricao());
        
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                servicoExiste = true;
            }
        }
        stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return servicoExiste;
}
     
    public int salvarServicoDao(ModeloServico modeloServico){
        
        try{
            
       this.conectar();
       return this.insertSQL(
               
         "INSERT INTO servico ("
                
                 +" id,"
                 +" descricao,"
                 +" valor,"
                 +" tempoEstimado,"
                 +" pecas, "
                 +" data "
                 
                
                +") VALUES ("
                
                 +"'"+modeloServico.getId()+"',"
                 +"'"+modeloServico.getDescricao()+"',"
                 +"'"+modeloServico.getValor()+"',"
                 +"'"+modeloServico.getTempoEstimado()+"',"
                 +"'"+modeloServico.getPecas()+"',"
                  +"'"+modeloServico.getDataCriacao()+"'"
             
                 + ");"
        );
            
        }catch(Exception e){
         e.printStackTrace();
         
          return 0;
          
      }finally{
          this.fecharConexao();
      }    
     }
    
   public ModeloServico getServicoPelaDescricao(String descricao) {
   ModeloServico modeloServico = new ModeloServico();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                +" id,"
                 +" descricao,"
                 +" valor,"
                 +" tempoEstimado,"
                 +" pecas, "
                 +" data "
                 +" FROM "
                 +" servicos"
                 
                 +" WHERE" 
                 +" descricao = '" + descricao + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloServico.setId(this.getResultSet().getInt(1));
            modeloServico.setDescricao(this.getResultSet().getString(2));
            modeloServico.setValor(this.getResultSet().getDouble(3));
            modeloServico.setTempoEstimado(this.getResultSet().getString(4));
            modeloServico.setPecas(this.getResultSet().getString(5));
            modeloServico.setDataCriacao(this.getResultSet().getString(6));
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return  modeloServico;
}
   
   public ModeloServico getServicoPeloIdDao(int id) {
   ModeloServico modeloServico = new ModeloServico();

    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
                +" id,"
                 +" descricao,"
                 +" valor,"
                 +" tempoEstimado,"
                 +" pecas, "
                 +" data "
                 +" FROM "
                 +" servicos"
                 
                 +" WHERE" 
                 +" id = '" + id + "'"
             +";"
        );

        if (this.getResultSet().next()) {
            modeloServico.setId(this.getResultSet().getInt(1));
            modeloServico.setDescricao(this.getResultSet().getString(2));
            modeloServico.setValor(this.getResultSet().getDouble(3));
            modeloServico.setTempoEstimado(this.getResultSet().getString(4));
            modeloServico.setPecas(this.getResultSet().getString(5));
            modeloServico.setDataCriacao(this.getResultSet().getString(6));
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }

    return  modeloServico;
}
   
   public ArrayList<ModeloServico> getListaServicoDao() {
    ArrayList<ModeloServico> listaModeloServico = new ArrayList<>();
    
    try {
        this.conectar();
        this.executarSQL(
            "SELECT " 
               +" id,"
                 +" descricao,"
                 +" valor,"
                 +" tempoEstimado,"
                 +" pecas, "
                 +" data "
                 +" FROM "
                 +" servicos"
        );
        
        while (this.getResultSet().next()) {
          ModeloServico modeloServico = new  ModeloServico(); 
          modeloServico.setId(this.getResultSet().getInt(1));
          modeloServico.setDescricao(this.getResultSet().getString(2));
          modeloServico.setValor(this.getResultSet().getDouble(3));
          modeloServico.setTempoEstimado(this.getResultSet().getString(4));
          modeloServico.setPecas(this.getResultSet().getString(5));
          modeloServico.setDataCriacao(this.getResultSet().getString(6));;
            
         listaModeloServico.add(modeloServico);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    
    return listaModeloServico;
}
   
public boolean apagarServicoDao(int id){
        
        try{
             this.conectar();
             return this.executarUpdateDeleteSQL(
                 "DELETE FROM servico "
                
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

public boolean AtualizarServicoDao(ModeloServico modeloServico) {
     
          try {
        this.conectar();
        
        String sql = "UPDATE servico SET " +
                     "id = '" +modeloServico.getId() + "', " +
                     "descricao = '" +modeloServico.getDescricao()+ "', " +
                     "valor = '" +modeloServico.getValor()+ "', " +
                     "tempoEstimado = '" +modeloServico.getTempoEstimado()+ "', " +
                     "pecas = '" +modeloServico.getPecas()+ "' " +
                    
                     
                "WHERE id = '" + modeloServico.getId() + "'";
                     
        return this.executarUpdateDeleteSQL(sql);
    } catch(Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        this.fecharConexao();
    }
} 
    
}
