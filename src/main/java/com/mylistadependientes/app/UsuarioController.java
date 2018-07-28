package com.mylistadependientes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mylistadependientes.app.UsuariosEntity;
import com.mylistadependientes.app.UsuarioRespositorio;

@Controller
@RequestMapping(path="/usuarios")
public class UsuarioController{

  @Autowired
  private UsuarioRespositorio usuarioRespositorio;

  public @ResponseBody Iterable<UsuariosEntity> getUsusarios(){
    return usuarioRespositorio.findAll();

  }

}
