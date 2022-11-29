package examenes;

public class ExamenFinal extends Examen implements Comparable {
    private double notaOral;
    private String temaOral;

    public ExamenFinal(String temaExamen, String enunciado, double nota, Alumno alumno, double notaOral, String temaOral) {
        super(temaExamen, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getTemaOral() {
        return temaOral;
    }

    public void setTemaOral(String temaOral) {
        this.temaOral = temaOral;
    }


    @Override
    public boolean estaAprobado() {
        if (this.getNota() >= 4 && this.getNotaOral() >= 4){
            return true;
        }
        return false;
    }

    public double calcularPromedio(){
        double resultado = (this.getNotaOral() + this.getNota())/2;
        return resultado;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal examenAComparar = (ExamenFinal)o;
        double promedio1 = this.calcularPromedio();
        double promedio2 = examenAComparar.calcularPromedio();
        int resultado = 0;
        if(promedio1 > promedio2){
            resultado = 1;
        }
        if(promedio1 < promedio2){
            resultado = -1;
        }
        return resultado;
    }


}

