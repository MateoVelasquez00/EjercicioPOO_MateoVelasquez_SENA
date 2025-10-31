package empresa;

public class Gerente extends Empleado{

    private int numeroDeEmpleados;

    public Gerente(String nombre, int edad, double salarioBase, int numeroDeEmpleados) {
        super(nombre, edad, salarioBase);
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public Gerente(String nombre) {
        super(nombre);
        this.numeroDeEmpleados = 0;
    }

    public void setNumeroDeEmpleados(int numeroDeEmpleados){
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public String describir(){
        return "Soy un gerente y lidero un equipo";
    }

    @Override
    public double calcularPago() {
        return getSalarioBase() * 1.2;
    }

    @Override
    public String trabajar(int horas){
        return getNombre() + " coordino al equipo durante " + horas + " horas";
    }

    //Sobrecarga adicional específica para gerente
    public double calcularPago(double bono, double bonoLiderazgo){
        return super.calcularPago(bono) + bonoLiderazgo;
    }

    @Override
    public String toString(){
        return super.toString() + ", numeroDeEmpleados = " + numeroDeEmpleados;
    }
}
