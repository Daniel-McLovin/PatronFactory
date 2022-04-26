/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.patronfactory;

/**
 *
 * @author Daniel Hz
 */
public class Smartphone implements DispositivoElectronico{
    private String nombreDispositivo;
    private String color;
    private int memoriaRAM;
    private int camaraFrontal;
    private boolean expandible;

    public Smartphone() {
    }

    public Smartphone(String nombreDispositivo, String color, int memoriaRAM, int camaraFrontal, boolean expandible) {
        this.nombreDispositivo = nombreDispositivo;
        this.color = color;
        this.memoriaRAM = memoriaRAM;
        this.camaraFrontal = camaraFrontal;
        this.expandible = expandible;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getCamaraFrontal() {
        return camaraFrontal;
    }

    public void setCamaraFrontal(int camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    public boolean isExpandible() {
        return expandible;
    }

    public void setExpandible(boolean expandible) {
        this.expandible = expandible;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Modelo=" + nombreDispositivo + ", Color=" + color + ", RAM=" + memoriaRAM +"GB" +", Cámara Frontal=" + camaraFrontal +"MP" +", Memoria Expandible=" + expandible + '}';
    }


}
