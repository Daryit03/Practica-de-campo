
package Ejercicio01;

import java.util.ArrayList;


public class MantenimientoMedico {
    
    private ArrayList<Medico> listamed;
    
    //constructor
    public MantenimientoMedico(){
        listamed = new ArrayList<>(); //objeto del arraylist
    }
    
    //Metodos para manipular el arreglo
    
    public void agregarMedico(Medico medico){
        listamed.add(medico);
    }
    
    //Metodo que obtenga la lista de medicos
    public ArrayList<Medico> obtenerMedicos(){
        return listamed;
    }
}
