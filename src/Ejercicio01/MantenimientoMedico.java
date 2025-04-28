
package Ejercicio01;

import java.util.ArrayList;


public class MantenimientoMedico {
    
    private ArrayList<Medico> listaMedicos;
    
    //constructor
    public MantenimientoMedico(){
        listaMedicos = new ArrayList<>(); //objeto del arraylist
    }
    
    //Metodos para manipular el arreglo
    
    public void agregarMedico(Medico medico){
        listaMedicos.add(medico);
    }
    
    //Metodo que obtenga la lista de medicos
    public ArrayList<Medico> obtenerMedicos(){
        return listaMedicos;
    }
}
