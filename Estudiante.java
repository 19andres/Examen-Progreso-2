public class Estudiante extends Persona {

    private int matricula;
    private double promedio;
    private String estado;

    public Estudiante(String nombre, int edad,
                      int matricula,
                      double promedio,
                      String estado) {

        super(nombre, edad);

        this.matricula = matricula;
        this.promedio = promedio;
        this.estado = estado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante -> " +
                super.toString() +
                ", Matricula: " + matricula +
                ", Promedio: " + promedio +
                ", Estado: " + estado;
    }
}
