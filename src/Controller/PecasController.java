
package Controller;

import Dao.PecasDao;
import Modelo.ModeloPecas;
import java.util.ArrayList;


public class PecasController {
    
  private PecasDao pecasDao = new PecasDao();
  
  public int SalvarPecasController(ModeloPecas modeloPecas){
      return this.pecasDao.salvarPecaDao(modeloPecas);
  }
  
  public boolean VerificarExistenciaController(ModeloPecas modeloPecas){
    return this.pecasDao.verificarExistenciaPecasDao(modeloPecas);
  }

  public ModeloPecas getPecasPeloNomeController(String nome){
    return this.pecasDao.getPecasPeloNomeDao(nome);
  }
   public ModeloPecas getPecasController(int id){
    return this.pecasDao.getPecasDao(id);
  }

  public ArrayList<ModeloPecas> getListaPecasController(){
    return this.pecasDao.getListaPecasDao();
  }
  
  public boolean AtualizarPecasController(ModeloPecas modeloPecas){
      return this.pecasDao.AtualizarPecasDao(modeloPecas);
  }
    public boolean AtualizarQuantidadeDePecasController(ArrayList<ModeloPecas> modeloPecases){
      return this.pecasDao.AtualizarQuantidadeDao(modeloPecases);
  }
  
  
  public boolean ApagarPecasController(int id){
      return this.pecasDao.apagarPecasDao(id);
  }
  
  public int ContarPecasController(){
      return this.pecasDao.contarPecasDao();
  }
  

    
}
