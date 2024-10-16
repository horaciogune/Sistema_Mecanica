package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloFatura;

public class FaturaDao extends Conexao_MySql {

public int GerarFaturaDao(ModeloFatura modeloFatura) {
    try {
       
        this.conectar();
        
        
        int resultadoInsercao = this.insertSQL(
            "INSERT INTO fatura (" +
            " id," +
            " idOrdem," +
            " metodoPagamento," +
            " valorApagar," +
            " valorRecebido," +
            " trocos" +
            ") VALUES (" +
            "'" + modeloFatura.getId() + "'," +
            "'" + modeloFatura.getIdOrdem() + "'," +
            "'" + modeloFatura.getMetodoPagamento() + "'," +
            "'" + modeloFatura.getValorApagar() + "'," +
            "'" + modeloFatura.getValorRecebido() + "'," +
            "'" + modeloFatura.getTrocos() + "'" +
            ");"
        );
        
        if (resultadoInsercao > 0) {
            
            String sqlUpdate = "UPDATE ordem_servico SET status = 'Finalizado', dataFechamento = NOW() WHERE id = '" + modeloFatura.getIdOrdem() + "'";
            this.executarUpdateDeleteSQL(sqlUpdate);
        }
        
        return resultadoInsercao;  

    } catch (Exception e) {
        e.printStackTrace();
        return 0; 

    } finally {
        
        this.fecharConexao();
    }
}

}