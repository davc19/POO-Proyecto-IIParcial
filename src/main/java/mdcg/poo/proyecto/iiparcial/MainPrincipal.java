/**
 *Este código es para la tarea grupal módulo #6
 *@author Grupo #9
 *@version 0.1
 */
package mdcg.poo.proyecto.iiparcial;

import helpers.Deportista;
import helpers.Medico;

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
        System.out.println("Nombre: " + deportista.getLogros());
        System.out.println("-------------------------------------------");
        
        //impresion de la clase médico
        Medico medico = new Medico();
        
        System.out.println("Profesión: " + medico.Profesion());
        System.out.println("Nombre: " + medico.getNombre());
        System.out.println("Identidad: " + medico.getIdentidad());
        System.out.println("Edad: " + medico.getEdad());
        System.out.println("Sexo: " + medico.getSexo());
        System.out.println("Direccion: " + medico.getDireccion());
        System.out.println("Email: " + medico.getEmail());
        medico.ImprimirMedico();
    }
    
}
