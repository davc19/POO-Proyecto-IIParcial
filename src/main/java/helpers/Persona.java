/*
 * Super Clase Persona
 */
package helpers;

/**
 * 201710080097
 * Milton D. Canales
 */

public abstract class Persona 
{
    //Propiedades
    private String Nombre;
    private String Identidad;
    private String Direccion;
    private int Edad;
    private String Email;
    private char Sexo;
    
    //Constructor
    public Persona()
    {
        //Sin Parametos
    }
    
    //Setters
    public void Nombre(String _nombre)
    {
        this.Nombre = _nombre;
    }

    public void Identidad(String _identidad)
    {
        this.Identidad = _identidad;
    }

    public void Direccion(String _direccion)
    {
        this.Direccion = _direccion;
    }

    public void Edad(int _edad)
    {
        this.Edad = _edad;
    }

    public void Email(String _email)
    {
        this.Email = _email;
    }

    public void Sexo(char _sexo)
    {
        this.Sexo = _sexo;
    }
    
    //Metodo abstracto
    public abstract String Categoria();
}
