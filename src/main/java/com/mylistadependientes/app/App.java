package com.mylistadependientes.app;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      try{
  			//1.CREAR CONEXION
  			Connection miConexion=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","TEC");
  			                                                //driver:protocolodriver:THIN:@localhost:port:SID
  			//2.CREAR OBJETO STATMENT
  			Statement miStatement= miConexion.createStatement();

  			//3.EJECUTAR LA INSTRUCCION SQL

  			//Aqui almacenamos lo que nos devuelve la consulta como una especie de tabla visrtual
  			ResultSet miResulset =miStatement.executeQuery("select * from USUARIOS");

  			//4.RECORRER O LEER LA TABLA VIRTUAL O EL RESULSET

  			//aqui tenemos almacenados los registros
  			//mientras haiga un siguiente registro
  			while(miResulset.next()){

  				System.out.print(miResulset.getString("NOMBRE")+" "+ miResulset.getString("PASS")+"\n ");

  			}

  		}catch(Exception e){

  			System.out.print("no conecta");
  			e.printStackTrace();//con esto imprimimo el error o la pila del errror

  		}


}
