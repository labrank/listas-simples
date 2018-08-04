package com.mylistadependientes.app;

import com.mylistadependientes.app.TareasEntity;
import org.springframework.data.repository.CrudRepository;


public interface TareasRepositorio implements CrudRepository<TareasEntity,String> {



}
