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
public final class Manager extends Person {
    
    //private String login;
    //private String password;
    private static Manager instance ; // Unique instance
    
    // private constructor for Singleton
    Manager(String name, String firstname) {
        super(name, firstname);

    }
    
    // Only one instanciated ==> Singleton
    public synchronized static Manager getInstance ()
    {
        if ( instance == null )
        {
            instance = new Manager("Bill", "Jean");
        }
        return instance ;
    }
    
    public synchronized static void setInstance (String newName, String newFirstname)
    {
        instance.setName(newName);
        instance.setFirstname(newFirstname);
    }

    public void addVideoGame(){
        
        //Object to JSON in file
        //mapper.writeValue(this.videoGameList, newVideoGame);
        
        
        //set name
        Scanner nameGame = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter game's name"); // Enter username and press Enter
        gameName = nameGame.nextLine();
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
        //System.out.print(GameLibrary.getVideoGameList().size());
    }
    public void addBoardGame(){
        
        //set name
        Scanner nameGame = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter game's name"); // Enter username and press Enter
        gameName = nameGame.nextLine();
        //newVideoGame.setName(userName);

        
        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String gameManufacturer;

        System.out.println("Enter the manufacturer");  // Enter username and press Enter
        gameManufacturer = manufacturer.nextLine();
        //newVideoGame.setManufacturer(userManufacturer);
        
        // set player number
        Scanner platform = new Scanner(System.in);
        int playerNumber;

        System.out.println("Enter the player number");  // Enter username and press Enter
        playerNumber = Integer.parseInt(platform.nextLine());
        
        BoardGame newBoardGame = new BoardGame(playerNumber, gameName, gameManufacturer);
   
        // Add game
        GameLibrary.getBoardGameList().add(newBoardGame);
    }
    public void addToy(){
        
        //set name
        Scanner nameGame = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter game's name"); // Enter username and press Enter
        gameName = nameGame.nextLine();

        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String gameManufacturer;

        System.out.println("Enter the manufacturer");  // Enter username and press Enter
        gameManufacturer = manufacturer.nextLine();
        
        // set matrial
        Scanner platform = new Scanner(System.in);
        String material;

        System.out.println("Enter the player number");  // Enter username and press Enter
        material = platform.nextLine();
        
        Toy newToy = new Toy(material, gameName, gameManufacturer);
        
        // Add game
        GameLibrary.getToyList().add(newToy);
    }
    
}
