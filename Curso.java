import java.util.ArrayList;

public class Curso {

    private int codigo;
    private String nombre;
    private int creditos;

    private Profesor profesor;

    private ArrayList<Estudiante> estudiantes;

    public Curso(int codigo,
                 String nombre,
                 int creditos,
                 Profesor profesor) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;

        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() {

        String lista = "";

        for (Estudiante e : estudiantes) {
            lista += e.getNombre() + " ";
        }

        return "\nCurso: " + nombre +
                "\nCódigo: " + codigo +
                "\nCréditos: " + creditos +
                "\nProfesor: " + profesor.getNombre() +
                "\nEstudiantes: " + lista;
    }
}
