package Clases_Objetos.AttributeStatic;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Maria"); // Pertenecen a las instancias.
        Classroom student2 = new Classroom("Juan"); // Pertenecen a las instancias.

        student1.showInfo(); // Pertenecen a las instancias.
        student2.showInfo(); // Pertenecen a las instancias.

        Classroom.setSchoolName("Escuela 2"); // Pertenece a la clase y cambia para todas las instancias.

        student1.showInfo();
        student2.showInfo();
    }
}
