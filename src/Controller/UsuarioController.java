package Controller;

import Dao.UsuarioDao;
import Modelo.ModeloUsuario;
import java.util.ArrayList;

public class UsuarioController {

    private UsuarioDao usuarioDao = new UsuarioDao();

    public boolean getValidarUsuarioController(ModeloUsuario modeloUsuario) {
        return this.usuarioDao.getValidarUsuarioDao(modeloUsuario);
    }

    public boolean recuperarUsuarioController(ModeloUsuario modeloUsuario) {
        return this.usuarioDao.recuperarSenhaUsuarioDao(modeloUsuario);
    }

    public int salvarUsuariocontroller(ModeloUsuario modeloUsuario) {
        return this.usuarioDao.salvarUsuarioDao(modeloUsuario);
    }
    
    public ArrayList<ModeloUsuario> pesquisaModeloUsuariosController(String nome){
        return this.usuarioDao.PesquisarUsuarioDao(nome);
    }

    public boolean VerificarEexistenciaUsuarioController(ModeloUsuario modeloUsuario) {
        return this.usuarioDao.verificarExistenciaUsuarioDao(modeloUsuario);
    }

    public ModeloUsuario getUsuarioControllerPeloNomeController(String nome) {
        return this.usuarioDao.getUsuarioPeloNomeDao(nome);
    }

    public ModeloUsuario getUsuarioControllerPeloIdController(int id) {
        return this.usuarioDao.getUsuarioIdDao(id);
    }

    public ArrayList<ModeloUsuario> getListaUsuarioController() {
        return this.usuarioDao.getListaUsuarioDao();
    }

    public boolean AtualizarUsuariocontroller(ModeloUsuario modeloUsuario) {
        return this.usuarioDao.AtualizarUsuarioDao(modeloUsuario);
    }

    public boolean ApagarUsuarioController(int id) {
        return this.usuarioDao.apagarUsuarioDao(id);
    }

    public int contarUsuariosController() {
        return this.contarUsuariosController();
    }

}
