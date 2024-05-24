
package herencia;


public class Herencia {

    public static void main(String[] args) {
        /* Alumno */
        Alumno objAlumno = new Alumno("JeO", "Orellana", "Argentina", 46);
        objAlumno.setMatricula("26344676");
        objAlumno.mostrarDatos();
        
        /* Profesor*/
        Profesor objProfesor = new Profesor ("Nombre", "Profesor1", "Mexico", 60);
        objProfesor.setCedula("222222");
        objProfesor.mostrarDatos();
    }
    
    
}
