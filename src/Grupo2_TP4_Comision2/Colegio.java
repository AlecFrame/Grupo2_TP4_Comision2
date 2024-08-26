
package Grupo2_TP4_Comision2;

import Vistas.Principal;
import Modelos.Alumno;
import Modelos.Materia;

public class Colegio {

    public static void main(String[] args) {
        
        Materia m1 = new Materia(1, 1,"Ingles 1");
        Materia m2 = new Materia(2,1,"Matematicas");
        Materia m3 = new Materia(3,1, "Laboratorio");
        
        Alumno a1= new Alumno(1001,"Lopez", "Martin");
        Alumno a2= new Alumno(1002, "Martinez", "Brenda");
        
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m3);
        a1.agregarMateria(m2);
        
        a2.agregarMateria(m3);
        a2.agregarMateria(m2);
        a2.agregarMateria(m1);
        a2.agregarMateria(m3);
        
        Principal principal= new Principal();
        principal.setVisible(true);
        
        System.out.println(a1.getApellido()+" "+a1.getNombre()+" Se ha inscrito en "+a1.cantidadDeMaterias()+" materias");
        System.out.println(a2.getApellido()+" "+a2.getNombre()+" Se ha inscrito en "+a2.cantidadDeMaterias()+" materias");
        
        
       
        
    }
    
   
}
