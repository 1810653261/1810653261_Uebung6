package Aufgabe4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Freundesliste {
    public static void main(String [] args){
        List<String> Freundesliste =new ArrayList<>();

        for(int i=1; i<=5;i++){
            Freundesliste.add(JOptionPane.showInputDialog("Gib den namen deiner Freunde ein"));
        }
        System.out.println(Freundesliste);
    }
}
