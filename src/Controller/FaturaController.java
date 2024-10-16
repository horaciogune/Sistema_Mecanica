
package Controller;

import Dao.FaturaDao;
import Modelo.ModeloFatura;


public class FaturaController {
    
    private FaturaDao faturaDao = new FaturaDao();
    
    public int GerarFaturaController(ModeloFatura modeloFatura){
        return this.faturaDao.GerarFaturaDao(modeloFatura);
    }
    
}
