
package Controlador;


import vista.Cine;
public class Persona {
    private String nombre;
    private int id;
    private String correo;
    public Cine objCine = new Cine();
    public Persona(){
        this.nombre="";
        this.id=0;
        this.correo="";
    }
    
    
   
    
    //------------Nombre-----------

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String pedirNombre(){
        
             this.nombre = objCine.interfazNombre();
            return this.nombre;
    }
    
    
    
    
    //-------------Id--------------
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }
    
    public int pedirId() {
    this.id = objCine.interfazId();
    return this.id; 
        }
    
    
    
    
    
    
    //----------Correo-----------
    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public String pedirCorreo() {
    this.correo = objCine.interfazCorreo();
    return this.correo; 
    }
       
}
