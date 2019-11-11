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
        // Create the only one Game library
        GameLibrary.getInstanceSingleObjectGameLibrary();
        
        //manager fonction
        Manager man = GameLibrary.getManager();
        System.out.println(man.getName());
        man.setName("Oscar");
        System.out.println(man.getName());
        //man.addVideoGame();
        //man.addVideoGame();
        System.out.println(man.searchVideoGame("fifa 20"));





        //observer

        //create subject
        Adherent subjectAdherent=new Adherent();

        /* Manager observer */
        Manager obj1 = GameLibrary.getManager();

        //register observers to the subject
        subjectAdherent.register(obj1);

        //attach observer to subject
        obj1.setSubject(subjectAdherent);

        //check if any update is available
        obj1.update();

        //now send message to subject
        subjectAdherent.postMessage("I am new Adherent");



        // Factory
    CreateGameFactory cf = new CreateGameFactory();

    FactoryGame fg1 = cf.getCreateGame("TOY");

    fg1.CreateGame();

    FactoryGame fg2 = cf.getCreateGame("BoardGame");

    fg2.CreateGame();

    FactoryGame fg3 = cf.getCreateGame("VideoGame");

    fg3.CreateGame();


    }

}
