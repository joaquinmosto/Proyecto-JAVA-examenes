package examenes;

public class ExamenParcial extends Examen {
    private int unidad;
    private int intentos;

    public ExamenParcial(String temaExamen, String enunciado, double nota, Alumno alumno, int unidad, int intentos) {
        super(temaExamen, enunciado, nota, alumno);
        this.unidad = unidad;
        this.intentos = intentos;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public boolean estaAprobado() {
        return false;
    }

    public void sePuedeRecuperar(){
        if(this.getUnidad() <= 3 && this.getIntentos() < 3){
            System.out.println("se puede recuperar 3 veces, usted ya realizo el examen " + this.getIntentos() + " veces");
        }
        else if (this.getUnidad() > 3 && this.getIntentos() < 2) {
            System.out.println("se puede recuperar 2 veces, usted ya realizo el examen " + this.getIntentos() + " veces");

        } else{
            System.out.println("Debe recursar la materia");
        }
    }

}
