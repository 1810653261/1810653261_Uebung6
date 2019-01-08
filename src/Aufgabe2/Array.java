package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Array {
    public static void main (String [] args)
    {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Wie groß soll das Array sein"));
        int [] s=new int [x];

        for(int i = 0; i<x; i++){
            Random zahl = new Random();
            s[i] = zahl.nextInt(1000);
        }
        for(int i = s.length -1; i >=0; i--){
            System.out.println(s);
        }
    }
}
