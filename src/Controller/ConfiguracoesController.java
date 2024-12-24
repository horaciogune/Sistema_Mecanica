package Controller;

import Dao.DaoConfiguracoes;
import Modelo.ModeloConfiguracoes;
import java.util.ArrayList;

public class ConfiguracoesController {

    private DaoConfiguracoes daoConfiguracoes = new DaoConfiguracoes();

    public int SalvarConfiguracoesController(ModeloConfiguracoes modeloConfiguracoes) {
        return this.daoConfiguracoes.salvarConfiguracoesDao(modeloConfiguracoes);
    }

    public ArrayList<ModeloConfiguracoes> getlistaConfiguracoes() {
        return this.daoConfiguracoes.getListarconfiguracoesDao();
    }
    
    public  ModeloConfiguracoes getConfiguracoesController(){
       return this.daoConfiguracoes.getConfiguracoesDao();
    }
    
    public boolean AtualizarconfiguracoesController(ModeloConfiguracoes modeloConfiguracoes){
        return this.daoConfiguracoes.AtualizarConfiguracoesDao(modeloConfiguracoes);
    }

}
