public class Usuario_cajero extends Persona{
    //Declaracion atributos privados de la clase Usuario_banco
    private double valorDepositar;
    private double valorRetirar;
    public Usuario_cajero(String nombre, String appelido, int edad, int ci, int telf, double valorDepositar, double valorRetirar) {
        //Convocar al constructor de la superclase
        super(nombre, appelido, edad, ci, telf);

        this.valorDepositar = valorDepositar;
        this.valorRetirar = valorRetirar;
    }
    //Generamos Setter y Getter cuando tenemos atributos privados
    public double getValorDepositar() {
        return valorDepositar;
    }

    public void setValorDepositar(double valorDepositar) {
        this.valorDepositar = valorDepositar;
    }

    public double getValorRetirar() {
        return valorRetirar;
    }

    public void setValorRetirar(double valorRetirar) {
        this.valorRetirar = valorRetirar;
    }

    @Override
    public String toString() {
        return ("\n------El usuario: " + this.nombre + this.apellido + "------"+
                "\n> Edad: " + this.edad +
                "\n> CI: " + this.ci +
                "\n> Telefono: " + this.telf +
                "\nSus trasancciones son: " +
                "\n > Deposito de: " + this.valorDepositar +
                "\n > Retiro de: " + this.valorRetirar);
    }
}
