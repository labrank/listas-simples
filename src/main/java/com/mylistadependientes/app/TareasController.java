package com.mylistadependientes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mylistadependientes.app.TareasEntity;
import com.mylistadependientes.app.TareasRespositorio;

@Controller
@RequestMapping(path="/tareas")
public class TareasController{

  @Autowired
  private TareasRespositorio tareasRespositorio;

  public @ResponseBody Iterable<TareasEntity> getTareas(){
    return tareasRespositorio.findAll();

  }

}
