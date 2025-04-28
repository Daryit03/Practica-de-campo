package Ejercicio02;

import java.util.ArrayList;

public class MantenimientoAlumno {
    
    private ArrayList<Alumno> ListaA;
    
    //constructor
    public MantenimientoAlumno(){
        ListaA = new ArrayList<>(); //objeto de la array list 
    }
    
    //Metodos para manipular el arreglo
    public void AgregarAlumno (Alumno alumno){
        ListaA.add(alumno);
    }
    
    //Metodo que obtenga la lista de Alumnos
    public ArrayList<Alumno> ObtenerAlumno() {
        return ListaA;
    }
}
