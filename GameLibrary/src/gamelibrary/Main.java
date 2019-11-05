/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ablo1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameLibrary gameLibrary = new GameLibrary("Ludothèque Alma");
        Manager man = new Manager("Jean", "Gui");
        man.addVideoGame();
        man.searchVideoGame("fifa 20");
             
    }
}
