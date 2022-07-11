import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Object> usuarios = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        double deposito = 0;
        double retiro = 0;
        //Controlar que solo sea 3 usuarios
        for (int i =1; i<=3; i++){
            String nom = JOptionPane.showInputDialog(null,"Nombre:","Usuario" + (i),JOptionPane.QUESTION_MESSAGE);
            String ape = JOptionPane.showInputDialog(null,"Apellido:","Usuario" + (i),JOptionPane.QUESTION_MESSAGE);
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad: ","Usuario" + (i),JOptionPane.QUESTION_MESSAGE));
            int ci = Integer.parseInt(JOptionPane.showInputDialog(null,"CI: ","Usuario" + (i),JOptionPane.QUESTION_MESSAGE));
            int telf = Integer.parseInt(JOptionPane.showInputDialog(null,"Telf: ","Usuario" + (i),JOptionPane.QUESTION_MESSAGE));
            int op = 4;
            while (op>3 || op<1){
                op = Integer.parseInt(JOptionPane.showInputDialog(null," 1: Deposto" + "\n 2: Retiro" +"\n 3: Retiro y deposito"+ "\n Ingrese su opcion:","Menu",JOptionPane.QUESTION_MESSAGE));
            }
            if (op == 1){
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Deposito(Digite con punto): ","Valores",JOptionPane.QUESTION_MESSAGE));
            }
            if (op==2){
                retiro = Double.parseDouble(JOptionPane.showInputDialog(null,"Retiro(Digite con punto): ","Valores",JOptionPane.QUESTION_MESSAGE));
            }
            if (op==3){
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Deposito(Digite con punto): ","Valores",JOptionPane.QUESTION_MESSAGE));
                retiro = Double.parseDouble(JOptionPane.showInputDialog(null,"Retiro(Digite con punto): ","Valores",JOptionPane.QUESTION_MESSAGE));
            }

            usuarios.add(new Usuario_cajero(nom,ape,edad,ci,telf,deposito,retiro));
            Archivo file = new Archivo();
            file.llenar(usuarios);
            deposito = 0;
            retiro = 0;
        }

    }
}
