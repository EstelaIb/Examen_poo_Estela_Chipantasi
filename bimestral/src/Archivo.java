import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Archivo {
    //Escribir en un archivo
    public void llenar (ArrayList<Object>usuario){

        //programador: Se encargara de escribir en el archivo
        try(BufferedWriter user  = new BufferedWriter(new FileWriter("C:\\Users\\PROGRAMACION\\IdeaProjects\\bimestral\\src\\Transacciones_Usuario.txt"))){
            //Debo crear un objeto del tipo del arreglo que recorrerá y así accedera a la funcio toString
            for (Object u: usuario){
                user.write(u.toString());
            }
        } catch (Exception e) {
            System.out.println("ERROR" );
        }
    }
}
