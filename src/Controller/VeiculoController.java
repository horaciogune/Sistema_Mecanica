
package Controller;

import Dao.VeiculoDao;
import Modelo.ModeloVeiculo;
import java.util.ArrayList;


public class VeiculoController {
    
    private VeiculoDao veiculoDao = new VeiculoDao();
    
    
    public int SalvarVeiculoController(ModeloVeiculo modeloVeiculo){
        return this.veiculoDao.salvarVeiculoDao(modeloVeiculo);
    }
    
    public boolean VerificarExistenciaVeiculoController(ModeloVeiculo modeloVeiculo){
        return this.veiculoDao.verificarExistenciaVeiculoDao(modeloVeiculo);
    }
    
    public ModeloVeiculo getVeiculoPelaMatriculaController(String matricula){
        return this.veiculoDao.getVeiculoPelaMatricula(matricula);
    }
     public ModeloVeiculo getVeiculoPeloIdController(int id){
        return this.veiculoDao.getVeiculoPeloId(id);
    }
    
    public ArrayList<ModeloVeiculo> getListaVeiculoController(){
        return this.veiculoDao.getListaVeiculosDao();
    }
    
    public boolean AtualizarVeiculoController(ModeloVeiculo modeloVeiculo){
        return this.veiculoDao.AtualizarVeiculoDao(modeloVeiculo);
    }
    
    public boolean ApagarVeiculoController(int matricula){
        return this.veiculoDao.apagarVeiculoDao(matricula);
    }
    
    public int ContarVeiculoController(){
        return this.veiculoDao.contarVeiculosDao();
    }
    
    
}
