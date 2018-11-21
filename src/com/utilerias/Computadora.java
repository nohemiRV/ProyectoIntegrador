
package com.utilerias;

/**
 *
 * @author rafaelm
 */
public class Computadora extends Tecnologia{
    private String procesador;
    private int ram;
   

    public Computadora() {
    }

    public Computadora(String noSerie, String anio, String modelo, String procesador, int ram) {
        super(noSerie, anio, modelo);
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    @Override
    public String toString(){
        return super.toString() + ",el procesador es " + this.procesador+ "la ram es "+ this.ram;
    }
}