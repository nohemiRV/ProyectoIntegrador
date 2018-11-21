
package com.servicios.implementacion;

import com.servicios.iservicios.ICRUD;
import com.utilerias.Computadora;
import java.util.*;

/**
 *
 * @author rafaelm
 */
public class ServiciosCompu implements ICRUD{
    
    LinkedList<Computadora> listaDeCompus = new LinkedList();

    @Override
    public boolean agregar(Computadora compu) {
        return listaDeCompus.add(compu);
    }
   
    @Override
    public LinkedList leer() {
        return listaDeCompus;
    }
    
    
}