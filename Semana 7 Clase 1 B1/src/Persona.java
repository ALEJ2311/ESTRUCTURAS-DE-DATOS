
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Personal
 */
public class Persona {

    private int id;
    private String nombre;
    private String direccion;
    private int edad;
    private int telefono;
    private char sexo;
    

    public Persona() {

    }

    public Persona(int id, String nombre,String direccion, int edad, int telefono, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.sexo = sexo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        System.out.println("---INGRESO DE DATOS---");
        System.out.println("PERSONA 1");
        ingresoDatos(persona1, tcl);
        System.out.println("PERSONA 2");
        ingresoDatos(persona2, tcl);
        System.out.println("PERSONA 3");
        ingresoDatos(persona3, tcl);
        System.out.println("-----------------------------------------");
        
        System.out.println("PRESENTACION DE DATOS:");
        System.out.println("-----------------------------------------");
        System.out.println("PERSONA 1:");
        presentarDatos(persona1);
        System.out.println("PERSONA 2:");
        presentarDatos(persona2);
        System.out.println("PERSONA 3:");
        presentarDatos(persona3);
    }

    public static void ingresoDatos(Persona persona, Scanner tcl) {
        System.out.println("INGRESE SU ID:");
        persona.setId(tcl.nextInt());
        tcl.nextLine();
        System.out.println("INGRESE SU NOMBRE:");
        persona.setNombre(tcl.nextLine());
        System.out.println("INGRESE SU DIRECCION");
        persona.setDireccion(tcl.nextLine());
        System.out.println("INGRESE SU EDAD: ");
        persona.setEdad(tcl.nextInt());
        System.out.println("INGRESE SU TELEFONO:");
        persona.setTelefono(tcl.nextInt());
        tcl.nextLine();
        System.out.println("INGRESE SU SEXO:");
        persona.setSexo(tcl.nextLine().toUpperCase().charAt(0));
    }
    
    public static void presentarDatos(Persona persona){
        System.out.println("ID: " + persona.getId());
        System.out.println("NOMBRE: " + persona.getNombre());
        System.out.println("DIRECCION: " + persona.getDireccion());
        System.out.println("EDAD: " + persona.getEdad());
        System.out.println("TELEFONO: " + persona.getTelefono());
        System.out.println("SEXO: " + persona.getSexo());
        System.out.println("-----------------------------------------");
    }

}
