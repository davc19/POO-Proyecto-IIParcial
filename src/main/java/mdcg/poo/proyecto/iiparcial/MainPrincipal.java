/**
 *Este código es para la tarea grupal módulo #6
 *@author Grupo #9
 *@version 0.1
 */
package mdcg.poo.proyecto.iiparcial;

import helpers.Deportista;

/**
 * Clase que contiene el main para poder visualizar nuestro código
 * @author: Grupo #9
 * @version 0.1
 */
public class MainPrincipal {

    /** Método principal o Main de la clase
     * @param args 
     */
    public static void main(String[] args) 
    {
        /**
         * Instanciar cada una de las clases en objetos para ser utilizados
         */
        
        Deportista deportista = new Deportista();
        
        /**
         * Impresión en pantalla de todas las clases creadas 
         */
        System.out.println("Tarea Grupal 6: Trabajo en equipo GitHub");
        System.out.println("-------------------------------------------");
        System.out.println(deportista.Profesion()); //Impresion clase deportista
        System.out.println("Identidad: " + deportista.getIdentidad());
        System.out.println("Nombre: " + deportista.getNombre());
        System.out.println("Direccion: " + deportista.getDireccion());
        System.out.println("Correo electrónico: " + deportista.getEmail());
        System.out.println("Deporte: " + deportista.getDeporte());
        System.out.println("Años de Experiencia: " + deportista.calcularExperiencia(2005)+ " años");
        System.out.println("Práctica semanal: " + deportista.getHoras() + " horas");
        System.out.println("Logros: " + deportista.getLogros());
        System.out.println("-------------------------------------------");
        
        // Aquí impresion de la clase médico
    }
    
}
