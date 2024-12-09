package Dao;

import Conexao.Conexao_MySql;
import Modelo.ModeloUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDao extends Conexao_MySql {

    public boolean getValidarUsuarioDao(ModeloUsuario modeloUsuario) {

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " id,"
                    + " nome,"
                    + " username,"
                    + " email,"
                    + " estado,"
                    + " perfil,"
                    + " senha "
                    + " FROM"
                    + " usuarios"
                    + " WHERE"
                    + " username = '" + modeloUsuario.getUsername() + "'AND senha = '" + modeloUsuario.getSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean recuperarSenhaUsuarioDao(ModeloUsuario modeloUsuario) {

        try {

            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " id,"
                    + " nome,"
                    + " username,"
                    + " email,"
                    + " estado,"
                    + " perfil,"
                    + " senha "
                    + " FROM"
                    + " usuarios"
                    + " WHERE"
                    + " email = '" + modeloUsuario.getEmail() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                 modeloUsuario.setSenha(getResultSet().getString("senha"));
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean verificarExistenciaUsuarioDao(ModeloUsuario usuario) {
        boolean usuarioExiste = false;
        try {
            String query = "SELECT COUNT(*) FROM usuarios WHERE username = ? OR nome = ?";
            PreparedStatement stmt = conectar().prepareStatement(query);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getNome());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    usuarioExiste = true;
                }
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarioExiste;
    }

    public int salvarUsuarioDao(ModeloUsuario modeloUsuario) {

        try {

            this.conectar();
            return this.insertSQL(
                    "INSERT INTO usuarios ("
                    + " id,"
                    + " nome,"
                    + " username,"
                    + " email,"
                    + " estado,"
                    + " perfil,"
                    + " senha "
                    + ") VALUES ("
                    + "'" + modeloUsuario.getId() + "',"
                    + "'" + modeloUsuario.getNome() + "',"
                    + "'" + modeloUsuario.getUsername() + "',"
                    + "'" + modeloUsuario.getEmail() + "',"
                    + "'" + modeloUsuario.getEstado() + "',"
                    + "'" + modeloUsuario.getPerfil() + "',"
                    + "'" + modeloUsuario.getSenha() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();

            return 0;

        } finally {
            this.fecharConexao();
        }
    }

    public ModeloUsuario getUsuarioPeloNomeDao(String nome) {
        ModeloUsuario modeloUsuario = new ModeloUsuario();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " id,"
                    + " nome,"
                    + " username,"
                    + " email,"
                    + " estado,"
                    + " perfil,"
                    + " senha, "
                    + " data_criacao "
                    + "FROM "
                    + " usuarios"
                    + " WHERE"
                    + " username = '" + nome + "'"
                    + ";"
            );

            if (this.getResultSet().next()) {
                modeloUsuario.setId(this.getResultSet().getInt(1));
                modeloUsuario.setNome(this.getResultSet().getString(2));
                modeloUsuario.setUsername(this.getResultSet().getString(3));
                modeloUsuario.setEmail(this.getResultSet().getString(4));
                modeloUsuario.setEstado(this.getResultSet().getString(5));
                modeloUsuario.setPerfil(this.getResultSet().getString(6));
                modeloUsuario.setSenha(this.getResultSet().getString(7));
                modeloUsuario.setDataCriacao(this.getResultSet().getString(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modeloUsuario;
    }

    public ModeloUsuario getUsuarioIdDao(int id) {
        ModeloUsuario modeloUsuario = new ModeloUsuario();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id, "
                    + "nome, "
                    + "username, "
                    + "email, "
                    + "estado, "
                    + "perfil, "
                    + "senha, "
                    + "data_criacao "
                    + "FROM "
                    + "usuarios "
                    + "WHERE "
                    + " id = '" + id + "'" + ";"
            );

            if (this.getResultSet().next()) {
                modeloUsuario.setId(this.getResultSet().getInt(1));
                modeloUsuario.setNome(this.getResultSet().getString(2));
                modeloUsuario.setUsername(this.getResultSet().getString(3));
                modeloUsuario.setEmail(this.getResultSet().getString(4));
                modeloUsuario.setEstado(this.getResultSet().getString(5));
                modeloUsuario.setPerfil(this.getResultSet().getString(6));
                modeloUsuario.setSenha(this.getResultSet().getString(7));
                modeloUsuario.setDataCriacao(this.getResultSet().getString(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modeloUsuario;
    }

    public ArrayList<ModeloUsuario> getListaUsuarioDao() {
        ArrayList<ModeloUsuario> listaUsuarioModelousuario = new ArrayList<>();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id, "
                    + "nome, "
                    + "username, "
                    + "email, "
                    + "estado, "
                    + "perfil, "
                    + "senha, "
                    + "data_criacao "
                    + "FROM usuarios"
            );

            while (this.getResultSet().next()) {
                ModeloUsuario modeloUsuario = new ModeloUsuario();
                modeloUsuario.setId(this.getResultSet().getInt(1));
                modeloUsuario.setNome(this.getResultSet().getString(2));
                modeloUsuario.setUsername(this.getResultSet().getString(3));
                modeloUsuario.setEmail(this.getResultSet().getString(4));
                modeloUsuario.setEstado(this.getResultSet().getString(5));
                modeloUsuario.setPerfil(this.getResultSet().getString(6));
                modeloUsuario.setSenha(this.getResultSet().getString(7));
                modeloUsuario.setDataCriacao(this.getResultSet().getString(8));

                listaUsuarioModelousuario.add(modeloUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaUsuarioModelousuario;
    }

    public boolean apagarUsuarioDao(int codigo) {

        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM usuarios "
                    + " WHERE "
                    + " id = '" + codigo + "'"
                    + ";"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            this.fecharConexao();

        }

    }

    public boolean AtualizarUsuarioDao(ModeloUsuario modeloUsuario) {

        try {
            this.conectar();

            String sql = "UPDATE usuarios SET "
                    + "nome = '" + modeloUsuario.getNome() + "', "
                    + "userName = '" + modeloUsuario.getUsername() + "', "
                    + "email = '" + modeloUsuario.getEmail() + "', "
                    + "estado = '" + modeloUsuario.getEstado() + "', "
                    + "perfil = '" + modeloUsuario.getPerfil() + "', "
                    + "senha = '" + modeloUsuario.getSenha() + "' "
                    + "WHERE id = '" + modeloUsuario.getId() + "'";

            return this.executarUpdateDeleteSQL(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public int contarUsuarios() {
        String query = "SELECT COUNT(*) as total FROM usuarios";
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
