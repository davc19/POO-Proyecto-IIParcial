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
    public void setNombre(String _nombre)
    {
        this.Nombre = _nombre;
    }

    public void setIdentidad(String _identidad)
    {
        this.Identidad = _identidad;
    }

    public void setDireccion(String _direccion)
    {
        this.Direccion = _direccion;
    }

    public void setEdad(int _edad)
    {
        this.Edad = _edad;
    }

    public void setEmail(String _email)
    {
        this.Email = _email;
    }

    public void setSexo(char _sexo)
    {
        this.Sexo = _sexo;
    }
    
    
    //Getters
    public String getNombre()
    {
        return this.Nombre;
    }
    
    public String getIdentidad()
    {
        return this.Identidad;
    }

    public String getDireccion()
    {
        return this.Direccion;
    }
    
    public int getEdad()
    {
        return this.Edad;
    }
    
    public String getEmail()
    {
        return this.Email;
    }
    
    public char getSexo()
    {
        return this.Sexo;
    }

    
    //Metodo abstracto
    public abstract String Profesion();
}
