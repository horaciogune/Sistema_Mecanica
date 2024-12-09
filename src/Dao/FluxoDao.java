
package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloFluxo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FluxoDao extends Conexao_MySql {

    // Método para inserir um registro no fluxo
    public boolean inserirFluxo(ModeloFluxo fluxo) {
        String sql = "INSERT INTO fluxo (matricula, estado, data) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = conectar().prepareStatement(sql);
            stmt.setString(1, fluxo.getMatricula());
            stmt.setString(2, fluxo.getEstado());
            stmt.setTimestamp(3, new Timestamp(fluxo.getData().getTime()));
            stmt.executeUpdate();
            return true; // Sucesso
        } catch (SQLException e) {
            System.err.println("Erro ao inserir fluxo: " + e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }

    // Método para buscar um registro pelo ID
    public ModeloFluxo buscarPorId(int id) {
        String sql = "SELECT * FROM fluxo WHERE id = ?";
        ModeloFluxo fluxo = null;
        try {
            PreparedStatement stmt = conectar().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                fluxo = new ModeloFluxo();
                fluxo.setId(rs.getInt("id"));
                fluxo.setMatricula(rs.getString("matricula"));
                fluxo.setEstado(rs.getString("estado"));
                fluxo.setData(rs.getTimestamp("data"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar fluxo: " + e.getMessage());
        } finally {
            fecharConexao();
        }
        return fluxo;
    }

    // Método para listar todos os registros
    public List<ModeloFluxo> listarTodos() {
        String sql = "SELECT * FROM fluxo";
        List<ModeloFluxo> lista = new ArrayList<>();
        try {
            PreparedStatement stmt = conectar().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ModeloFluxo fluxo = new ModeloFluxo();
                fluxo.setId(rs.getInt("id"));
                fluxo.setMatricula(rs.getString("matricula"));
                fluxo.setEstado(rs.getString("estado"));
                fluxo.setData(rs.getTimestamp("data"));
                lista.add(fluxo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar fluxos: " + e.getMessage());
        } finally {
            fecharConexao();
        }
        return lista;
    }

    // Método para excluir um registro pelo ID
    public boolean excluirPorId(int id) {
        String sql = "DELETE FROM fluxo WHERE id = ?";
        try {
            PreparedStatement stmt = conectar().prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true; // Sucesso
        } catch (SQLException e) {
            System.err.println("Erro ao excluir fluxo: " + e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }
}

