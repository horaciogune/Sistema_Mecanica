
package Controller;

import Dao.Mecanicodao;
import Modelo.ModeloMecanico;
import java.util.ArrayList;


public class MecanicoController {
    
    
    private Mecanicodao mecanicodao = new Mecanicodao();
    
    public int SalvarMecanicocontroller(ModeloMecanico modeloMecanico){
        return this.mecanicodao.salvarMecanicoDao(modeloMecanico);
    }
    
    public boolean VerificarExistenciaMecanicoController(ModeloMecanico modeloMecanico){
        return mecanicodao.verificarExistenciaPecasDao(modeloMecanico);
    }
    
    public ModeloMecanico getMecanicoPeoNomeController(String nome){
        return mecanicodao.getMecanicoPeloNomeDao(nome);
    }
    public ModeloMecanico getMecanicoPeloIdController(int id){
        return mecanicodao.getMecanicoPeloIdDao(id);
    }
    
    public ArrayList<ModeloMecanico> getListaMecanicoController(){
        return mecanicodao.getListaMecanicoDao();
        
    }
    
    public boolean AtualizarMecanicocontroller(ModeloMecanico modeloMecanico){
        return mecanicodao.AtualizarMecanicoDao(modeloMecanico);
    }
    
    public boolean ApagarMecanicoController(int id){
        return mecanicodao.apagarMecanicoDao(id);
    }
    
    public int ContarMecanicosController(){
        return mecanicodao.contarMecanicosDao();
    }
    
}
