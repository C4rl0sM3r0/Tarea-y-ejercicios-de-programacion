package TalentoHumano;

public abstract class Persona {


    protected String apellidos;
    protected String nombres;
    protected double sueldoBasico;


    public Persona(String apellidos, String nombres, double sueldoBasico) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sueldoBasico = sueldoBasico;
    }

    // Método abstracto: obliga a las subclases a implementarlo
    public abstract double getSueldo();

    // Método concreto: imprime los datos básicos de la persona
    public void imprime(){
        System.out.printf("\nApellidos: %s", apellidos);
        System.out.printf("\nNombres: %s", this.nombres);
        System.out.printf("\nSueldo básico: %.2f", this.sueldoBasico);
    }
}