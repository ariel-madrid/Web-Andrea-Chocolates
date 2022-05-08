package com.andrea.project.Services;
import com.andrea.project.Models.*;
import java.util.*;
import com.andrea.project.Repositories.RepositorieUsuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class ServiceUsuario {
    private final RepositorieUsuario repositorieUsuario;

    ServiceUsuario(RepositorieUsuario repositorieUsuario){
        this.repositorieUsuario = repositorieUsuario;
    }

    //CRUD

    //Crear un nuevo Usuario (Metodo POST)
    @RequestMapping(value = "/nuevoUsuario", method=RequestMethod.POST)
    public Usuario createUsuario(@RequestBody Usuario usuarioNew) 
    {
        return repositorieUsuario.createUsuario(usuarioNew);
    }

    //Obtener lista de Usuarios (Metodo GET)
    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public List<Usuario> getAllUsuario(){
        return repositorieUsuario.getAll();
    }

    //Actualizar datos de una habilidad (Metodo UPDATE)
    @RequestMapping(value="/usuario/actualizar",method=RequestMethod.PUT)
    public void actualizarUsuario(@RequestBody Usuario usuario)
    {
        repositorieUsuario.update(usuario);
    }

    //Metodo eliminar usuario (Metodo DELETE)
    @DeleteMapping(value="/usuario/eliminar/{id}")
    public void eliminar(@PathVariable(value = "id") int id)
    {
        repositorieUsuario.delete(id);
    }
}
