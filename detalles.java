
package Grooming_consultas;

import javax.swing.JOptionPane;


public abstract class detalles implements funciones {
    
    protected String tamaño; 
    protected String especie; 
    protected int edad; 
    protected String telefono; 
    protected String día; 
    protected String hora; 
    protected String nombre; 
    protected int ID; 

    public detalles(String tamaño, String especie, int edad, String telefono, String día, String hora, String nombre, int ID) {
        this.tamaño = tamaño;
        this.especie = especie;
        this.edad = edad;
        this.telefono = telefono;
        this.día = día;
        this.hora = hora;
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDía() {
        return día;
    }

    public void setDía(String día) {
        this.día = día;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    

    @Override 
    public void recordar(){
         JOptionPane.showMessageDialog(null, "Recuerda que tu cita es pronto!!", "Recordatorio", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void agendar(){
        
    }
    
    @Override
    public void pagar(int ID){
        
    }
    
    
    
}
