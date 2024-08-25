
package Controller;

import Dao.ClienteDao;
import Modelo.ModeloCliente;
import java.util.ArrayList;

public class ClienteController {
    
    private ClienteDao clienteDao = new ClienteDao();
    
    public int SalvarClienteController(ModeloCliente modeloCliente){
        return this.clienteDao.salvarClienteDao(modeloCliente);
    }
    
    public boolean VerificarExistenciaClienteController(ModeloCliente modeloCliente){
        return this.clienteDao.verificarExistenciaClienteDao(modeloCliente);
    }
    
    public ModeloCliente getClienteControllerPeloNome(String nome){
        return this.clienteDao.getClientePeloNomeDao(nome);
    }
    
    public ModeloCliente getClientePeloIdController(int id){
        return this.clienteDao.getClientePeloIdDao(id);
    }
    
    public ArrayList<ModeloCliente> getListaModeloClienteController(){
        return this.clienteDao.getListaClienteDao();
    }
    
    public boolean AtualizarClienteController(ModeloCliente modeloCliente){
        return this.clienteDao.AtualizarClienteDao(modeloCliente);
    }
    
    public boolean ApagarClienteController(int id){
        return this.clienteDao.apagarClienteDao(id);
    }
    
    public int ContarClienteController(){
        return this.clienteDao.contarClintesDao();
    }
    
    
    
}
