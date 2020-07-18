/**
 * Este código es para la tarea grupal módulo #6
 * @author Kevin Archaga  - 201810060339
 * @version 0.1
 */
package helpers;

/**
 * Subclase de la Superclase Persona en la que describimos a un deportista
 * @author Kevin Archaga - 201810060339
 */
public class Deportista extends Persona {
    
    //Definimos atributos
    private String deporte = "Ciclista";
    private int experiencia;
    private int horas = 11;
    private String logros = "Campeón de la localidad";
    
    
    
    /**
     * Declaración del constructor de la clase
     */
    
    public Deportista(){
      setNombre("Kevin Archaga");
      setIdentidad("0801-1990-17397");
      setDireccion("Colonia xyz - Tegucigalpa, Honduras");
      setEdad(29);
      setEmail("archaga.kevin@gmail.com");
      setSexo('M');
      
      
    }
    
    /**
      * Método Set, el cual recibe el atributo deporte de tipo String
      * @param deporte
      */
    public void setDeporte(){
        this.deporte = deporte;
        
    }
    
    /**
      * Método Set, el cual recibe el atributo año de inicio de tipo int
      * @param ainicio
      */
    public void setExperiencia(){
        this.experiencia = experiencia;
        
    }

    /**
      * Método Set, el cual recibe el atributo horas de tipo int
      * @param horas
      */
    public void setHoras(){
        this.horas = horas;
        
    }
    
    /**
      * Método Set, el cual recibe el atributo horas de tipo String
      * @param logros
      */
    public void setLogros(){
        this.logros = logros;
        
    }
    
    /**
      * Método Get, con el cual obtendremos el valor de deporte de tipo String
      * @return deporte
      */
     public String getDeporte(){
         return this.deporte;
     }
     
     /**
      * Método Get, con el cual obtendremos el valor de año de inicio tipo int
      * @return ainicio
      */
     public int getExperiencia(){
         return this.experiencia;
     }
     
     /**
      * Método Get, con el cual obtendremos el valor de horas de tipo int
      * @return horas
      */
     public int getHoras(){
         return this.horas;
     }
     
     /**
      * Método Get, con el cual obtendremos el valor de logros de tipo String
      * @return logros
      */
     public String getLogros(){
         return this.logros;
     }
     
     
    
    /**
    * Método heredado por la superclase Persona
    * Implementación de polimorfismo en el comportamiento del método
    * @return Cadena de texto con la profesion con la que se esta trabajando
    */ 
    @Override
    public String Profesion() {
        return "Profesión: Deportista";
    }
    
    /**
    * Método para calcular los años de experiencia del deportista
    * @return Cadena de texto con la profesion con la que se esta trabajando
    */ 
    
    public int calcularExperiencia (int ainicio){
        this.experiencia = 2020 - ainicio;
        return this.experiencia;
    }
    
}
