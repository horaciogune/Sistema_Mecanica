package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloOrdemServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrdemServicoDao extends Conexao_MySql {

    public int salvarOrdemServicoDao(ModeloOrdemServico modeloOrdemServico) {

        try {

            this.conectar();
            return this.insertSQL(
                    "INSERT INTO ordem_servico ("
                    + " id,"
                    + " dataFechamento,"
                    + " idCliente,"
                    + " nomeCliente,"
                    + " matriculaVeiculo,"
                    + " marcaVeiculo,"
                    + " problema,"
                    + " servico,"
                    + " observacoes,"
                    + " pecas,"
                    + " precoTotal,"
                    + " nomeMecanico,"
                    + " status "
                    + ") VALUES ("
                    + "'" + modeloOrdemServico.getId() + "',"
                    + "'" + modeloOrdemServico.getDataFechamento() + "',"
                    + "'" + modeloOrdemServico.getIdCliente() + "',"
                    + "'" + modeloOrdemServico.getNomeCliente() + "',"
                    + "'" + modeloOrdemServico.getMatriculaVeiculo() + "',"
                    + "'" + modeloOrdemServico.getMarcaVeiculo() + "',"
                    + "'" + modeloOrdemServico.getProblema() + "',"
                    + "'" + modeloOrdemServico.getServico() + "',"
                    + "'" + modeloOrdemServico.getObservacoes() + "',"
                    + "'" + modeloOrdemServico.getPecas() + "',"
                    + "'" + modeloOrdemServico.getPrecoTotal() + "',"
                    + "'" + modeloOrdemServico.getNomeMecanico() + "',"
                    + "'" + modeloOrdemServico.getStatus() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();

            return 0;

        } finally {
            this.fecharConexao();
        }

    }

    public ModeloOrdemServico getOrdemServicoDao(int id) {
        ModeloOrdemServico modeloOrdemServico = new ModeloOrdemServico();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " id,"
                    + " dataFechamento,"
                    + " idCliente,"
                    + " nomeCliente,"
                    + " matriculaVeiculo,"
                    + " marcaVeiculo,"
                    + " problema,"
                    + " servico,"
                    + " observacoes,"
                    + " pecas,"
                    + " precoTotal,"
                    + " nomeMecanico,"
                    + " status, "
                    + " dataAbertura "
                    + " FROM "
                    + " ordem_servico"
                    + " WHERE"
                    + " id = '" + id + "'"
                    + ";"
            );

            if (this.getResultSet().next()) {
                modeloOrdemServico.setId(this.getResultSet().getInt(1));
                modeloOrdemServico.setDataFechamento(this.getResultSet().getString(2));
                modeloOrdemServico.setIdCliente(this.getResultSet().getInt(3));
                modeloOrdemServico.setNomeCliente(this.getResultSet().getString(4));
                modeloOrdemServico.setMatriculaVeiculo(this.getResultSet().getString(5));
                modeloOrdemServico.setMarcaVeiculo(this.getResultSet().getString(6));
                modeloOrdemServico.setProblema(this.getResultSet().getString(7));
                modeloOrdemServico.setServico(this.getResultSet().getString(8));
                modeloOrdemServico.setObservacoes(this.getResultSet().getString(9));
                modeloOrdemServico.setPecas(this.getResultSet().getString(10));
                modeloOrdemServico.setPrecoTotal(this.getResultSet().getDouble(11));
                modeloOrdemServico.setNomeMecanico(this.getResultSet().getString(12));
                modeloOrdemServico.setStatus(this.getResultSet().getString(13));
                modeloOrdemServico.setDataAbertura(this.getResultSet().getString(14));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modeloOrdemServico;
    }

    public ArrayList<ModeloOrdemServico> getListaOrdemServicoDao() {
        ArrayList<ModeloOrdemServico> listaModeloOrdemServico = new ArrayList<>();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id, "
                    + "dataAbertura, "
                    + "dataFechamento, "
                    + "idCliente, "
                    + "nomeCliente, "
                    + "matriculaVeiculo, "
                    + "marcaVeiculo, "
                    + "problema, "
                    + "servico, "
                    + "observacoes, "
                    + "pecas, "
                    + "precoTotal, "
                    + "nomeMecanico, "
                    + "status "
                    + "FROM "
                    + "Ordem_servico"
            );

            while (this.getResultSet().next()) {
                ModeloOrdemServico modeloOrdemServico = new ModeloOrdemServico();
                modeloOrdemServico.setId(this.getResultSet().getInt("id"));
                modeloOrdemServico.setDataAbertura(this.getResultSet().getString("dataAbertura"));
                modeloOrdemServico.setDataFechamento(this.getResultSet().getString("dataFechamento"));
                modeloOrdemServico.setIdCliente(this.getResultSet().getInt("idCliente"));
                modeloOrdemServico.setNomeCliente(this.getResultSet().getString("nomeCliente"));
                modeloOrdemServico.setMatriculaVeiculo(this.getResultSet().getString("matriculaVeiculo"));
                modeloOrdemServico.setMarcaVeiculo(this.getResultSet().getString("marcaVeiculo"));
                modeloOrdemServico.setProblema(this.getResultSet().getString("problema"));
                modeloOrdemServico.setServico(this.getResultSet().getString("servico"));
                modeloOrdemServico.setObservacoes(this.getResultSet().getString("observacoes"));
                modeloOrdemServico.setPecas(this.getResultSet().getString("pecas"));
                modeloOrdemServico.setPrecoTotal(this.getResultSet().getDouble("precoTotal"));
                modeloOrdemServico.setNomeMecanico(this.getResultSet().getString("nomeMecanico"));
                modeloOrdemServico.setStatus(this.getResultSet().getString("status"));

                listaModeloOrdemServico.add(modeloOrdemServico);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModeloOrdemServico;
    }

    public boolean apagarOrdemServicoDao(int id) {

        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM Ordem_servico "
                    + " WHERE "
                    + " id = '" + id + "'"
                    + ";"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            this.fecharConexao();

        }

    }

    public boolean AtualizarOrdemservicoDao(ModeloOrdemServico modeloOrdemServico) {

        try {
            this.conectar();

            String sql = "UPDATE Ordem_servico SET "
                    + "dataFechamento = '" + modeloOrdemServico.getDataFechamento() + "', "
                    + "idCliente = '" + modeloOrdemServico.getIdCliente() + "', "
                    + "nomeCliente = '" + modeloOrdemServico.getNomeCliente() + "', "
                    + "matriculaVeiculo = '" + modeloOrdemServico.getMarcaVeiculo() + "', "
                    + "marcaVeiculo = '" + modeloOrdemServico.getMarcaVeiculo() + "', "
                    + "problema = '" + modeloOrdemServico.getProblema() + "', "
                    + "servico = '" + modeloOrdemServico.getServico() + "', "
                    + "observacoes = '" + modeloOrdemServico.getObservacoes() + "', "
                    + "pecas = '" + modeloOrdemServico.getPecas() + "', "
                    + "precoTotal = '" + modeloOrdemServico.getPrecoTotal() + "', "
                    + "nomeMecanico = '" + modeloOrdemServico.getNomeMecanico() + "', "
                    + "status = '" + modeloOrdemServico.getStatus() + "' "
                    + "WHERE id = '" + modeloOrdemServico.getId() + "'";

            return this.executarUpdateDeleteSQL(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public String obterMatriculaPorIdOrdem(int idOrdem) {
        String matricula = null;
        String sql = "SELECT matriculaVeiculo FROM ordem_servico WHERE id = ?";
        try (PreparedStatement stmt = this.conectar().prepareStatement(sql)) {
            stmt.setInt(1, idOrdem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                matricula = rs.getString("matriculaVeiculo");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matricula;
    }

    public int contarOrdensServicos() {
        String query = "SELECT COUNT(*) as total FROM ordem_servico";
        try (Connection conn = conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
