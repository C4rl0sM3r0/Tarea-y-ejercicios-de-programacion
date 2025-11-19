package TalentoHumano;

public class Docente extends Persona{

    protected String titulo;
    protected int aniosServicio;

    public Docente(String apellidos, String nombres, double sueldoBasico, String titulo, int aniosServicio) {
        super(apellidos, nombres, sueldoBasico);
        this.titulo = titulo;
        this.aniosServicio = aniosServicio;
    }


    @Override
    public double getSueldo() {

        return this.sueldoBasico + (this.aniosServicio * 50);
    }
}