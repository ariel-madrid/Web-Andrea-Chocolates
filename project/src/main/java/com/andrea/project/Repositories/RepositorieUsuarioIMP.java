package com.andrea.project.Repositories;

import java.util.*;
import com.andrea.project.Models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;


@Repository
public class RepositorieUsuarioIMP implements RepositorieUsuario{
    @Autowired
    private Sql2o sql2o;

    // Obtener todos los usuarios (Metodo GET)
    @Override
    public List<Usuario> getAll() {
        String sql = "SELECT * FROM usuario";
        try (Connection conn = sql2o.open()) {
            return (List<Usuario>) conn.createQuery(sql).executeAndFetch(Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + " Error en la conexion \n");
        }
        return null;
    }

    // Actualizar un usuario
    @Override
    public void update(Usuario usuarioUpdate) {
        String sql = "UPDATE usuario SET nombre=" + "'" +
                usuarioUpdate.getNombre() + "'" +
                ", apellido=" + "'" +
                usuarioUpdate.getApellido() + "'" +
                ", usuername=" + "'" +
                usuarioUpdate.getUsername() + "'" +
                ", password=" + "'" +
                usuarioUpdate.getPassword() + "'" +
                ", correoElectronico=" + "'" +
                usuarioUpdate.getCorreoElectronico() + "'" +
                ", direccion=" + "'" +
                usuarioUpdate.getDireccion() + "'" +
                " WHERE id = " +
                usuarioUpdate.getId();
        System.out.println(sql);
        try (Connection conn = sql2o.open()) {

            conn.createQuery(sql).executeUpdate();
        } catch (Exception e) {
            System.out
                    .println(e.getMessage() + e.getLocalizedMessage() + " Error al actualizar datos del usuario\n");
        }

    }

    // Eliminar un usuario
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM usuario WHERE id=" + id;
        try (Connection conn = sql2o.open()) {
            conn.createQuery(sql).executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + " Error al elminar el usuario\n");
        }

    }

    // La verificacion si existe un usuaario para ser creado se realiza en el front
    @Override
    public Usuario createUsuario(Usuario usuarioNew) {
        String sql = "INSERT INTO usuario (nombre, apellido, username, password, correoElectronico, direccion) VALUES(:nombre, :apellido, :username, :password, :correoElectronico, :direccion)";

        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .addParameter("nombre", usuarioNew.getNombre())
                    .addParameter("apellido", usuarioNew.getApellido())
                    .addParameter("username", usuarioNew.getUsername())
                    .addParameter("password", usuarioNew.getPassword())
                    .addParameter("correoElectronico", usuarioNew.getCorreoElectronico())
                    .addParameter("direccion", usuarioNew.getDireccion())
                    .executeUpdate().getKey();

            usuarioNew.setId(id);
            return usuarioNew;

        } catch (Exception e) {
            System.out.println(e.getCause() + e.getLocalizedMessage() + "\n");
        }
        return null;
    }

    // Obtener un usuario por ID
    @Override
    public Usuario getById(int id) {
        String sql = "SELECT * FROM usuario WHERE id=" + Integer.toString(id);

        try (Connection conn = sql2o.open()) {
            List<Usuario> l = conn.createQuery(sql).executeAndFetch(Usuario.class);
            return l.get(0);

        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage()
                    + "   Error al realizar la peticion de obtener un usuario por ID\n");
        }
        return null;
    }
}
