/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario De león
 */
public class alumnos {
    String nombre;
    String cadenas[];
    String paterno;
    String materno;
    String matricula;
    
    public alumnos (String xno, String xpa, String xma,String xmat){
        nombre = xno;
        paterno = xpa;
        materno = xma;
        matricula = xmat;
        cadenas = new String[4];
        
    }
     public String[] datos()
     {
     cadenas[0] = nombre;
     cadenas[1] = paterno;
     cadenas[2] = materno;
     cadenas[3] = matricula;
     return cadenas;
     
     }
    
}
