public class Main {

    public static void main(String[] args) {

        Estudiante e1 =
                new Estudiante("Ana",20,1001,9.5,"Activo");

        Estudiante e2 =
                new Estudiante("Luis",21,1002,8.8,"Activo");

        Estudiante e3 =
                new Estudiante("Maria",22,1003,9.2,"Activo");

        Profesor p1 =
                new Profesor("Carlos",45,"Programacion",2500,"Activo");

        Profesor p2 =
                new Profesor("Pedro",50,"Matematicas",2600,"Activo");

        Profesor p3 =
                new Profesor("Sofia",40,"Fisica",2400,"Activo");

        Curso c1 =
                new Curso(101,"Programacion II",4,p1);

        Curso c2 =
                new Curso(102,"Calculo",5,p2);

        Curso c3 =
                new Curso(103,"Fisica",4,p3);

        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);

        c2.agregarEstudiante(e2);
        c2.agregarEstudiante(e3);

        c3.agregarEstudiante(e1);
        c3.agregarEstudiante(e3);

        p1.agregarCurso(c1);
        p2.agregarCurso(c2);
        p3.agregarCurso(c3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== PROFESORES ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n=== ESTUDIANTES ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
