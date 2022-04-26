/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.patronfactory;

/**
 *
 * @author Daniel Hz
 */
public class DispositivoFactory {
    
        //Va a regresar un tipo "Snack" ya que se acolparán las clases
    public static DispositivoElectronico createDispositivoElectronico (int tipo){
        switch (tipo) {
            case DispositivoElectronico.COMPU_LENOVO:
                    return new Computadora("Legion", 8, 1024, true);
            
            case DispositivoElectronico.COMPU_HP:
                    return new Computadora("HP Stream", 4, 64, false);
            //ETC
            case DispositivoElectronico.COMPU_MAC:
                    return new Computadora("Macbook Air", 4, 256, false);
            
            case DispositivoElectronico.SMARTPHONE_HUAWUEI:
                    return new Smartphone("P30 Lite", "Blanco Perlado", 4, 32, true);
            
            case DispositivoElectronico.SMARTPHONE_XIAOMI:
                    return new Smartphone("Redmi Note 10S", "Ocean Blue", 6, 13, true);
            
            case DispositivoElectronico.SMARTPHONE_ALCATEL:
                    return new Smartphone("AlcatelSE", "Negro", 4, 5, true);
            
            case DispositivoElectronico.SMARTPHONE_SAMSUNG:
                    return new Smartphone("Galaxy S21", "Blanco Fantamsa", 8, 10, true);
            
            case DispositivoElectronico.TABLET_IPAD:
                    return new Tablet("Ipad Mini", "Gris Espacial", "IOS", 4);
            
            case DispositivoElectronico.TABLET_SAMSUNG:
                    return new Tablet("Galaxy Tab S7 FE", "Rosa Místico", "Android", 6);
            
            case DispositivoElectronico.TABLET_XIAOMI:
                    return new Tablet("Tablet Pad 5", "Cosmic Gray", "MIUI", 6);
            
 
              //ya no es necesario  break;
            default:
                throw new AssertionError();
        }
    
    }
}
