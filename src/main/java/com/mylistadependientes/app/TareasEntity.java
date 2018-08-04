package com.mylistadependientes.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Table(name="TAREAS")
public class TareasEntity{

  @Id
  private Integer ID_TAREA;
  private String FECHA;
  private String TITULO;
  private String CONTENIDO;
  private String COMPLETADO;


  public String getIdTarea(){
      return  ID_TAREA;
  }


  public void setId_Tarea(Integer ID_TAREA){

    this.ID_TAREA=ID_TAREA;

  }

  public String getFecha(){
      return  FECHA;
  }


  public void setFecha(String FECHA){

    this.FECHA=FECHA;

  }

  public String getTitulo(){
      return TITULO;
  }


  public void setTitulo(String TITULO){

    this.TITULO=TITULO;

  }

public String  getContenido(){
  return CONTENIDO;
}

public void setContenido(String CONTENIDO){

  this.CONTENIDO=CONTENIDO;
}


  public String getCompletado(){
      return COMPLETADO;
  }


  public void setCompletado(String COMPLETADO){

    this.COMPLETADO=COMPLETADO;

  }




}
