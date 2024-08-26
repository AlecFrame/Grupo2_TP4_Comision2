package Modelos;
        
import java.util.HashSet;

public class Alumno {
    private int legajo;
    private String apellido, nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashSet();
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
        if(materias.add(m)){
            System.out.println(apellido+" "+nombre+" Se inscribio a: "+m.getNombre());
        }
        else
            System.out.println(apellido+" "+nombre+" Ya está inscrito en esta materia");
    }
    
    public int cantidadDeMaterias(){
        return materias.size();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }

    @Override
    public String toString() {
        return "Alumno " + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre;
    }
}
