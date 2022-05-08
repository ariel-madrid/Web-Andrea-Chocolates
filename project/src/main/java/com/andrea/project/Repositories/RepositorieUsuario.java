package com.andrea.project.Repositories;
import java.util.*;
import com.andrea.project.Models.Usuario;
//Interfaz que define los metodos del CRUD
public interface RepositorieUsuario {
    public List<Usuario> getAll(); //Read
    public void update(Usuario usuarioUpdate);
    public void delete(int id);
    public Usuario createUsuario(Usuario usuarioNew);
    public Usuario getById(int id);
}
