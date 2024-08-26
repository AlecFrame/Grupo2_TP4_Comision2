package Modelos;
        
import java.util.ArrayList;


public class Alumno {
    private int legajo;
    private String apellido, nombre;
    private ArrayList<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias= new ArrayList();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        if(materias.isEmpty()){
            materias.add(m);
            System.out.println("Agrego materia: "+m.getNombre());
        }
        else {
            boolean materiaExistente = false;
            for (Materia materia : materias) {
                if (materia.equals(m)) {
                    System.out.println("Ya está inscrito en esta materia");
                    materiaExistente = true;
                    break;
                }
            }
            if (!materiaExistente) {
                materias.add(m);
                System.out.println("Agrego materia: " + m.getNombre());
            }
        }
    
    }
    
    public int cantidadDeMaterias(){
        return materias.size();
    }
}
