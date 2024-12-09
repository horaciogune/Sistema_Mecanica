
package Controller;

import Dao.*;
import Modelo.*;
import java.util.ArrayList;


public class OrdemServicoController {
    
    private OrdemServicoDao ordemServicoDao = new OrdemServicoDao();
    
    public int SalvarOrdemServicocontroller(ModeloOrdemServico modeloOrdemServico){
        return this.ordemServicoDao.salvarOrdemServicoDao(modeloOrdemServico);
    }
    
  public String obterMatriculaPorIdOrdemController(int id) {
    return this.ordemServicoDao.obterMatriculaPorIdOrdem(id);
}

    
   public ModeloOrdemServico getOrdemServicocontroller(int id){
        return this.ordemServicoDao.getOrdemServicoDao(id);
    }
   
   public ArrayList<ModeloOrdemServico> getListaOrdemServicocontroller(){
        return this.ordemServicoDao.getListaOrdemServicoDao();
    }
   public boolean AtualizarOrdemServicocontroller(ModeloOrdemServico modeloOrdemServico){
        return this.ordemServicoDao.AtualizarOrdemservicoDao(modeloOrdemServico);
    }
   
   public boolean ApagarOrdemServicocontroller(int id){
        return this.ordemServicoDao.apagarOrdemServicoDao(id);
    }
   
   public int ContarOrdemServicocontroller(){
        return this.ordemServicoDao.contarOrdensServicos();
    }
    
}
