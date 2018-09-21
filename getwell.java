/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grooming_consultas;


public class getwell extends detalles {
    public String paquete; 

    public getwell(String paquete, String tamaño, String especie, int edad, String telefono, String día, String hora, String nombre, int ID) {
        super(tamaño, especie, edad, telefono, día, hora, nombre, ID);
        this.paquete = paquete;
    }
    
}
