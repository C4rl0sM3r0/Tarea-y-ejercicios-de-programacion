package Operaciones;

public class Matematicas implements Calculadorable{
    double num1;
    double num2;

    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }



    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public double Suma() {
        return num1 + num2;
    }

    @Override
    public double Resta() {
        return num1 - num2;
    }

    @Override
    public double Producto() {
        return num1 * num2;
    }

    @Override
    public double Division() {
        return num1 / num2;
    }

    public void Resultados(){
        System.out.println("Resultado de las operaciones");
        System.out.printf("\n%.2f + %.2f es %.2f", num1, num2, Suma());
        System.out.printf("\n%.2f - %.2f es %.2f", num1, num2, Resta());
        System.out.printf("\n%.2f * %.2f es %.2f", num1, num2, Producto());
        System.out.printf("\n%.2f / %.2f es %.2f", num1, num2, Division());
    }
}