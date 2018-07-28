package com.mylistadependientes.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Table(name="USUARIOS")
public class UsuariosEntity{

  @Id
  private String  nombre;
  private String  pass ;

  public string getNombre(){
      return nombre;
  }


  public void setNombre(String nombre){

    this.nombre=nombre;

  }

  public string getPass(){
      return pass;
  }


  public void setPass(String pass){

    this.pass=pass;

  }

}
