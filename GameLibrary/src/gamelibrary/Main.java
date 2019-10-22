/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

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
        GameLibrary gameLibrary = new GameLibrary();
        
        
        
        //set name
        Scanner name = new Scanner(System.in);
        String userName;
        
        System.out.println("Enter username"); // Enter username and press Enter
        userName = name.nextLine();

        
        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String userManufacturer;

        System.out.println("Enter the manufacturer");  // Enter username and press Enter
        userManufacturer = manufacturer.nextLine();
        
        // create game
        Game game = new Game(userName, userManufacturer);

        
        gameLibrary.addGame(game);
        gameLibrary.getAllGames();
    }
}
