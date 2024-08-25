
package Controller;

import Dao.ServicoDao;
import Modelo.ModeloServico;
import java.util.ArrayList;


public class ServicoController {
    
    private ServicoDao servicoDao = new ServicoDao();
    
    
    public int SalvarServicoController(ModeloServico modeloServico){
        return this.servicoDao.salvarServicoDao(modeloServico);
    }
    
    public boolean VeriicarExistenciaServicoController(ModeloServico modeloServico){
        return this.servicoDao.verificarExistenciaServicoDao(modeloServico);
    }
    
    public ModeloServico getServicovicoPeloNomeController(String descricao){
        return this.servicoDao.getServicoPelaDescricao(descricao);
    }
    
     public ModeloServico getServicovicoPeloIdController(int id){
        return this.servicoDao.getServicoPeloIdDao(id);
    }
     
     public ArrayList<ModeloServico> getListaServicoController(){
        return this.servicoDao.getListaServicoDao();
    }
     
     public boolean AtualizarServicoController(ModeloServico modeloServico){
        return this.servicoDao.AtualizarServicoDao(modeloServico);
    }
    
     public boolean ApagarServicoController(int id){
        return this.servicoDao.apagarServicoDao(id);
    }
     

    
}
