/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ablo1
 */
public class Manager extends Person {
    
    //private String login;
    //private String password;
    public Manager(String name, String firstname) {
        super(name, firstname);

    }

    public void addVideoGame(){
        
        //Object to JSON in file
        //mapper.writeValue(this.videoGameList, newVideoGame);
        
        
        //set name
        Scanner name = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter game's name"); // Enter username and press Enter
        gameName = name.nextLine();
        //newVideoGame.setName(userName);

        
        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String gameManufacturer;

        System.out.println("Enter the manufacturer");  // Enter username and press Enter
        gameManufacturer = manufacturer.nextLine();
        //newVideoGame.setManufacturer(userManufacturer);
        
        // set Platform
        Scanner platform = new Scanner(System.in);
        String gamePlatform;

        System.out.println("Enter the platform");  // Enter username and press Enter
        gamePlatform = platform.nextLine();
        //newVideoGame.setManufacturer(userPlatform);
        
        // create game
        //game = new Game(userName, userManufacturer);
        
        VideoGame newVideoGame = new VideoGame(gamePlatform, gameName, gameManufacturer);
        
        // Add game
        //System.out.print(newVideoGame.getName());
        GameLibrary.getVideoGameList().add(newVideoGame);
        System.out.print(GameLibrary.getVideoGameList().size());
    }
    public void addBoardGame(BoardGame newboardGame){
   
        // Add game
        GameLibrary.getBoardGameList().add(newboardGame);
    }
    public void addToy(Toy newToy){
   
        // Add game
        GameLibrary.getToyList().add(newToy);
    }
    
    public void searchVideoGame(String name){
        for (int i = 0; i < GameLibrary.getVideoGameList().size(); i++) {
            if(GameLibrary.getVideoGameList().get(i).getName().equals(name) ){
                System.out.printf("Name : %s ; Manufacturer: %s ; Id: %s ; Statut : %s ; Platform : %s%n", GameLibrary.getVideoGameList().get(i).getName(), 
                    GameLibrary.getVideoGameList().get(i).getManufacturer(), 
                    GameLibrary.getVideoGameList().get(i).getId(), 
                    GameLibrary.getVideoGameList().get(i).getStatut(),
                    GameLibrary.getVideoGameList().get(i).getPlatform());
            }
        }
    }
}
