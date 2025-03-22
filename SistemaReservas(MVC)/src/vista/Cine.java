
package vista;

import java.util.Scanner;   


public class Cine {
    private Scanner respuesta = new Scanner(System.in);
    public Cine(){
    
    
    }
    
    //-------------------------Cliente-------------------------------
    public String interfazNombre(){
        System.out.println("Bienveido a nuestro cine :) ");
        System.out.println("Escriba su hombre");
        String nombre = respuesta.nextLine();
        return nombre;
    }
    public int interfazId(){      
        int id = 0;
        boolean valido = false;

        while (!valido) {
        System.out.println("Escriba su Id");
        try {
            id = respuesta.nextInt(); 
            valido = true;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: tiene que ser un número.");
            respuesta.nextLine();
        }
        }

        return id;
    }
    
    public String interfazCorreo(){
        
        System.out.println("Escriba su Correo");
        respuesta.nextLine();
        String correo = respuesta.nextLine();
        return correo;
    }
    public String interfazContraseña(){
    
        System.out.println("Escriba su Contraseña");
        String contraseña = respuesta.nextLine();
        return contraseña;
    
    }
    
    public String CambioNombre(){       
        System.out.println("Cual desea que sea su nuevo nombre: ");
        String nombre = respuesta.nextLine();
        return nombre;
    }
    public void mostrarClientes(String nombre,int id, String email){
        System.out.println("\nLista de clientes:");
        System.out.println("Nombre: " + nombre + "\nID: " + id + "\nEmail: " + email);
    }
    
    
    
    
    //------------------------Sala------------------------
    
    
    public String peliculas(){
        int control =0;
        
        do{
            System.out.println("Estas son las pelicualas que se encuentran en las salas:");
            System.out.println("1.Mar adentro");
            System.out.println("2.Todo sobre mi madre");
            System.out.println("3.La flor de mi secreto");
            System.out.println("4.El secreto de tus ojos");
            System.out.println("5.Hable con ella");
            int eleccion = respuesta.nextInt();
            if(eleccion>5 || eleccion<1){
                System.out.println("ERROR: Respuesta fuera de rango");
                return "";
            }else{
                switch (eleccion) {
                    case 1:
                        return"Mar adentro";
                        
                    case 2:
                        return "Todo sobre mi madre";
                        
                    case 3:
                        return "La flor de mi secreto";

                    
                    case 4:
                        return"El secreto de tus ojos";

                    case 5:
                        return"Hable con ella";

                    default:
                        throw new AssertionError();
                }
               
            
            }
        }while(control>5 || control<1);

    
    }
    public int asiento(){
        System.out.println("Que asiento desea elegir");
        int elecicon = respuesta.nextInt();
        return elecicon;
        
    }
    
    
    
    //--------------------Sillas-----------------------------------------------
    public boolean decicion(){
        System.out.println("Desea reservar otro asiento -----SI(0)------------NO(1) ");
        int eleccion = respuesta.nextInt();
        if(eleccion==1){
            return false;
        }else{
            return true;
            }
    
    }
    public boolean verAsientosDiponibles(){
        System.out.println("Desea ver la lista de asientos -----SI(0)------------NO(1) ");
        int eleccion = respuesta.nextInt();
        if(eleccion==1){
            return false;
        }else{
            return true;
            }
    }
    
    public void Confirmacion(int numero){
        System.out.println("Se reservo el asiento "+numero);
    }
    public void imprimirSillas(int numero, boolean decs){
        System.out.println("El asiento numero: " + numero + " se encuentra " + (decs ? "Disponible" : "Ocupado"));

    }
    public void imprimirMisSillas(int numero){
        System.out.println("Los asinetos reservados son: " + numero );
    }
    public void imprimidor(String dato){
    
        System.out.println(dato);
    }
}
