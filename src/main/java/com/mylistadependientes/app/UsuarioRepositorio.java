package com.mylistadependientes.app;

import com.mylistadependientes.app.UsuariosEntity;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepositorio implements CrudRepository<UsuariosEntity,String> {



}
