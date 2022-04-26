/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.patronfactory;

import java.util.Scanner;

/**
 *
 * @author Daniel Hz
 */
public class TestDispositivosFactory {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        //Menu
        System.out.println("¿Qué dispositivo le interesa?");
        System.out.println(DispositivoElectronico.COMPU_LENOVO + ")Computadora Lenovo");
        System.out.println(DispositivoElectronico.COMPU_HP + ")Computadora HP");
        System.out.println(DispositivoElectronico.COMPU_MAC + ")Computadora Mac");
        System.out.println(DispositivoElectronico.SMARTPHONE_HUAWUEI + ")Celular Huawuei");
        System.out.println(DispositivoElectronico.SMARTPHONE_XIAOMI + ")Celular Xiaomi");
        System.out.println(DispositivoElectronico.SMARTPHONE_ALCATEL + ")Celular Alcatel");
        System.out.println(DispositivoElectronico.SMARTPHONE_SAMSUNG + ")Celular Samsung");
        System.out.println(DispositivoElectronico.TABLET_IPAD + ")Tablet iPad");
        System.out.println(DispositivoElectronico.TABLET_SAMSUNG + ")Tablet Samsung");
        System.out.println(DispositivoElectronico.TABLET_XIAOMI + ")Tablet Xiaomi");

        //Capturar elección de usuario, y que no meta letras en la selección
        try {
            System.out.print("Elige el número:");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número");
        }

        DispositivoElectronico dispositivo = DispositivoFactory.createDispositivoElectronico(eleccion);
        System.out.println(dispositivo.toString());
    }
}
