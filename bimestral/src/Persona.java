public class Persona {
    String nombre;
    String apellido;
    int edad;
    int ci;
    int telf;
    //CREATE BUILDER
    public Persona(String nombre, String appelido, int edad, int ci, int telf){
        this.nombre = nombre;
        this.apellido = appelido;
        this.edad = edad;
        this.ci = ci;
        this.telf = telf;
    }
    //PERSON CLASS METHOD
    public String toString (){
        return("------El usuario: " + this.nombre +" "+ this.apellido + "------"+
                "\n> Edad: " + this.edad +
                "\n> CI: " + this.ci +
                "\n> Telefono: " + this.telf );
    }
}
