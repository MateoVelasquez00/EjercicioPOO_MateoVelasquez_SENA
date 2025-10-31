package empresa;

public class Practicante extends Empleado{
    private int horasDePracticante;

    public Practicante(String nombre, int edad, int horasDePracticante) {
        super(nombre, edad,horasDePracticante);
        this.horasDePracticante = horasDePracticante;
    }
    public Practicante (String nombre) {
        super(nombre);
        this.horasDePracticante = 0;
    }

    public void setHorasDePracticante(int horasDePracticante) {
        this.horasDePracticante = horasDePracticante;
    }
    public String describir() {
        return "Soy un practicante en formación.";
    }
    public double calcularPago() {
        return horasDePracticante * 15000;
    }

    @Override
    public String toString (){
        return super.toString() + "\nSalario Base: " + calcularPago();
    }
}
