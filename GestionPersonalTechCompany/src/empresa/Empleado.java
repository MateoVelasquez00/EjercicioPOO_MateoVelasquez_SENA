package empresa;

public class Empleado extends Persona implements Reportable{

    private double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre){
        super(nombre, 0);
        this.salarioBase = 0.0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String describir(){
        return "Soy un empleado";
    }

    @Override
    public double calcularPago(){
        return salarioBase;
    }
    public double calcularPago(double bono){
        return salarioBase + bono;
    }

    public String trabajar(){
        return getNombre() + " esta trabajando";
    }
    public String trabajar (int horas){
        return getNombre() + " trabajo " + horas + " horas.";
    }

    @Override
    public String generarReporte(){
        return "\n*** REPORTE EMPLEADO ***:" +
                "\nNombre = " + getNombre()
                + ", edad = " + getEdad()
                + ", salarioBase=" + salarioBase;
    }

    public String toString (){
        return super.toString() + "\nSalario Base: " + salarioBase;
    }


}