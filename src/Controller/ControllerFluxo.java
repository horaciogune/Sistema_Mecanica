package Controller;

import Dao.FluxoDao;
import Modelo.ModeloFluxo;
import java.util.List;

public class ControllerFluxo {

    private FluxoDao fluxoDao = new FluxoDao();

    // Método para salvar um fluxo
    public boolean salvarFluxoController(ModeloFluxo fluxo) {
        return this.fluxoDao.inserirFluxo(fluxo);
    }

    // Método para buscar um fluxo pelo ID
    public ModeloFluxo buscarFluxoPorIdController(int id) {
        return this.fluxoDao.buscarPorId(id);
    }

    // Método para listar todos os fluxos
    public List<ModeloFluxo> listarTodosFluxosController() {
        return this.fluxoDao.listarTodos();
    }

    // Método para excluir um fluxo pelo ID
    public boolean excluirFluxoController() {
        return this.fluxoDao.excluirTodos();
    }
}
