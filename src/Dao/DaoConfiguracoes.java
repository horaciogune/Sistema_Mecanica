package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloConfiguracoes;
import java.util.ArrayList;

/**
 *
 * @author Horacio
 */
public class DaoConfiguracoes extends Conexao_MySql {

    public int salvarConfiguracoesDao(ModeloConfiguracoes modeloConfiguracoes) {

        try {

            this.conectar();
            return this.insertSQL(
                    "INSERT INTO configuracoes ("
                    + " id,"
                    + " nome,"
                    + " nuit,"
                    + " endereco,"
                    + " contacto"
                    + ") VALUES ("
                    + "'" + modeloConfiguracoes.getId() + "',"
                    + "'" + modeloConfiguracoes.getNome() + "',"
                    + "'" + modeloConfiguracoes.getNuit() + "',"
                    + "'" + modeloConfiguracoes.getEndereco() + "',"
                    + "'" + modeloConfiguracoes.getContacto() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();

            return 0;

        } finally {
            this.fecharConexao();
        }
    }

    public ModeloConfiguracoes getConfiguracoesDao() {
        ModeloConfiguracoes modeloConfiguracoes = new ModeloConfiguracoes();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " id,"
                    + " nome,"
                    + " nuit,"
                    + " endereco,"
                    + " contacto"
                    + " FROM configuracoes "
                    
            );

            if (this.getResultSet().next()) {
                modeloConfiguracoes.setId(this.getResultSet().getInt(1));
                modeloConfiguracoes.setNome(this.getResultSet().getString(2));
                modeloConfiguracoes.setNuit(this.getResultSet().getString(3));
                modeloConfiguracoes.setEndereco(this.getResultSet().getString(4));
                modeloConfiguracoes.setContacto(this.getResultSet().getString(5));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modeloConfiguracoes;
    }

    public ArrayList<ModeloConfiguracoes> getListarconfiguracoesDao() {
        ArrayList<ModeloConfiguracoes> listaConfiguracoes = new ArrayList<>();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " id,"
                    + " nome,"
                    + " nuit,"
                    + " endereco,"
                    + " contacto"
                    + "FROM configuracoes"
            );

            while (this.getResultSet().next()) {
                ModeloConfiguracoes modeloConfiguracoes = new ModeloConfiguracoes();
                modeloConfiguracoes.setId(this.getResultSet().getInt(1));
                modeloConfiguracoes.setNome(this.getResultSet().getString(2));
                modeloConfiguracoes.setNuit(this.getResultSet().getString(3));
                modeloConfiguracoes.setEndereco(this.getResultSet().getString(4));
                modeloConfiguracoes.setContacto(this.getResultSet().getString(5));

                listaConfiguracoes.add(modeloConfiguracoes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaConfiguracoes;
    }

    
     public boolean AtualizarConfiguracoesDao(ModeloConfiguracoes modeloConfiguracoes) {

        try {
            this.conectar();

            String sql = "UPDATE configuracoes SET "
                    + "nome = '" + modeloConfiguracoes.getNome() + "', "
                    + "nuit = '" + modeloConfiguracoes.getNuit() + "', "
                    + "endereco = '" + modeloConfiguracoes.getEndereco() + "', "
                    + "contacto = '" + modeloConfiguracoes.getContacto() + "' "
                  
                    + "WHERE id = '" + modeloConfiguracoes.getId() + "'";

            return this.executarUpdateDeleteSQL(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
