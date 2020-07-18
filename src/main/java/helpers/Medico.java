package helpers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * Heiby Barahona
 * 202010060463
 */
public class Medico extends Persona{
    
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
    int anioActual  = localDate.getYear();
    String especialidad;
    String lugarAtencion;
    String horasAtencion;

    @Override
    public String Profesion() {
        return "Médico";
    }
    
    public Medico(){
        setNombre("Maria Pérez");
        setIdentidad("0801-1987-01287");
        setDireccion("Res. Plaza");
        setEdad(33);
        setEmail("mariap@gmail.com");
        setSexo('F');
        especialidad = "Cirugia General";
        lugarAtencion = "Hospital y Clínicas Viera ";
        horasAtencion = "10:00 a.m. - 4:00 p.m.";
    }
    public int AniosExperiencia (){
        int anioComienzoLaboral = 2014;
        return anioActual-anioComienzoLaboral;
    }
    
    public void ImprimirMedico (){
        System.out.println("Especialidad: " +especialidad);
        System.out.println("Lugar de atención: " +lugarAtencion);
        System.out.println("Hora de atención: " +horasAtencion);
        System.out.println("Años de experiencia: " + AniosExperiencia());
        System.out.println("------------------------------------------");
    }
    
    
    
}