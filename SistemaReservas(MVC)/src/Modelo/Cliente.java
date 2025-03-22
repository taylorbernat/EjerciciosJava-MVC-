
package Modelo;
public class Cliente {
    
    String nombre;
    int id;
    String email;
    public Cliente(){
        this.nombre="";
        this.id = 0;
        this.email = "";

    }
    public void agregaNombre(String nombre){
        this.nombre=nombre;
    }
    public void agregaId(int id){
        this.id=id;
    }
    public void agregaEmail(String email){
        this.email=email;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
