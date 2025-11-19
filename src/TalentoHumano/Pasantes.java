package TalentoHumano;

public class Pasantes extends Persona{

    protected String carrera; // Se agrega 'protected' para buena práctica

    // Constructor que inicializa los atributos heredados y el propio
    public Pasantes(String apellidos, String nombres, double sueldoBasico, String carrera) {
        super(apellidos, nombres, sueldoBasico);
        this.carrera = carrera;
    }

    @Override
    public double getSueldo() {
        // Cálculo: Sueldo básico - (Deducción del 10%)
        return this.sueldoBasico - (this.sueldoBasico * 0.1);
    }
}