
package com.servicios.iservicios;

import com.utilerias.Computadora;
import java.util.LinkedList;

public interface ICRUD {
    boolean agregar(Computadora compu);
    LinkedList leer();

}
