/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.patronfactory;

/**
 *
 * @author Daniel Hz
 */
public class Tablet implements DispositivoElectronico{
    private String nombreDispositivo;
    private String color;
    private String sistemaOperativo;
    private int memoriaRAM;

    public Tablet() {
    }

    public Tablet(String nombreDispositivo, String color, String sistemaOperativo, int memoriaRAM) {
        this.nombreDispositivo = nombreDispositivo;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRAM = memoriaRAM;
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Tablet{" + "Modelo=" + nombreDispositivo + ", Color=" + color + ", Sistema Operativo=" + sistemaOperativo + ", RAM=" + memoriaRAM +"GB" +'}';
    }


}
