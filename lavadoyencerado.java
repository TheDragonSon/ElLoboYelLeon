
package Grooming_consultas;


public class lavadoyencerado extends detalles {

    public String tipo; 

    public lavadoyencerado(String tipo, String tamaño, String especie, int edad, String telefono, String día, String hora, String nombre, int ID) {
        super(tamaño, especie, edad, telefono, día, hora, nombre, ID);
        this.tipo = tipo;
    }
    

}
