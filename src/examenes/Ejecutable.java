package examenes;

public class Ejecutable {
    public static void main(String[] args) {
        Alumno rocio = new Alumno("Rocio","Carrara",21);
        ExamenFinal testing = new ExamenFinal("debugging", "Testing", 6.50, rocio, 8.0, "Caso de pruba negativo");
        ExamenFinal poo = new ExamenFinal("clase abstracta", "programacion orientada a objetos", 8.0, new Alumno("Bernardita", "Bauque", 35), 2.0, "metodo");
        ExamenParcial dt = new ExamenParcial("Clustering", "empatia", 3.00, new Alumno("Enrique", "Delgado", 15), 1,2);
        ExamenParcial dt1 = new ExamenParcial("Clustering", "empatia", 3.00, new Alumno("Luca", "Carena", 12), 4,2);

        System.out.println(testing.estaAprobado()); // retorna true (nota oral 8 - nota 6.5 - ambas notas son mayor a 4)
        System.out.println(poo.estaAprobado()); // retorna false (nota oral 2.0 - nota 8.0 - la nota oral es < a 4, no esta aprobada)
        System.out.println(testing.calcularPromedio()); // retorna 7.25
        System.out.println(poo.calcularPromedio()); // retorna 5.00
        System.out.println(testing.compareTo(poo)); // retorna 1 (promedio de testing es 7.25, y el de poo es 5.0, el primer objeto es mayor)
        dt.sePuedeRecuperar(); //imprime x consola se puede recuperar 3 veces, usted ya realizo el examen 2 veces
        dt1.sePuedeRecuperar(); // imprime x consola Debe recursar la materia


    }
}
