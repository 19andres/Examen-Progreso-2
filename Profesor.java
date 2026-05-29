import java.util.ArrayList;

public class Profesor extends Persona {

    private String departamento;
    private double salario;
    private String estado;

    private ArrayList<Curso> cursos;

    public Profesor(String nombre,
                    int edad,
                    String departamento,
                    double salario,
                    String estado) {

        super(nombre, edad);

        this.departamento = departamento;
        this.salario = salario;
        this.estado = estado;

        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {

        return "Profesor -> " +
                super.toString() +
                ", Departamento: " + departamento +
                ", Salario: " + salario +
                ", Estado: " + estado;
    }
}
