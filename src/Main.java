import Operaciones.Matematicas;
import Operaciones.Matematicas;
import TalentoHumano.Docente;
import TalentoHumano.Pasantes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Ejemplo de Abstracción"));

    Docente homero = new Docente("Velastegui", "Homero", 1500,
            "Ing. de Sistemas", 10);

    System.out.println("\nROL DEL DOCENTE");
    homero.imprime();
    System.out.printf("\nEl sueldo a recibir es %.2f", homero.getSueldo());

    Pasantes ana = new Pasantes("Andrade", "Ana", 500, "TI");
    System.out.println("\n\nROL DEL PASANTE");
    ana.imprime();
    System.out.printf("\nEl sueldo a recibir es %.2f", ana.getSueldo());

    System.out.println("\n");
    System.out.println("OPERACIONES FUNDAMENTALES");
    Matematicas operacion = new Matematicas(22, 12.22);
    operacion.Resultados();

    //Calcular las operaciones con los valores 34 y 14.12 conservando el mismo objeto
    operacion.setNum1(34);
    operacion.setNum2(14.12);
    System.out.println();
    operacion.Resultados();
}