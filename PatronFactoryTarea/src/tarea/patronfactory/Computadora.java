/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.patronfactory;

/**
 *
 * @author Daniel Hz
 */
public class Computadora implements DispositivoElectronico{
    private String nombreDispositivo;
    private int memoriaRAM;
    private int almacenamiento;
    private boolean USBC;

    public Computadora() {
    }

    public Computadora(String nombreDispositivo, int memoriaRAM, int almacenamiento, boolean USBC) {
        this.nombreDispositivo = nombreDispositivo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.USBC = USBC;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isUSBC() {
        return USBC;
    }

    public void setUSBC(boolean USBC) {
        this.USBC = USBC;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Modelo=" + nombreDispositivo + ", RAM=" + memoriaRAM + "GB" + ", Almacenamiento=" + almacenamiento +"GB" +", USB C=" + USBC + '}';
    }

    
}
