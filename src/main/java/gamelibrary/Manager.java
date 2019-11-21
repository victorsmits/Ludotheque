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
public final class Manager extends Person {
  
    private static Manager instance ; // Unique instance
    
    // private constructor for Singleton
    private Manager(String name, String firstname, String username, String password) {
        super(name, firstname, username, password);

    }
    
    // Only one instanciated ==> Singleton

    /**
     *
     * @return
     */
    public synchronized static Manager getInstance ()
    {
        if ( instance == null )
        {
            instance = new Manager("Bill", "Jean", "moi", "1234");
        }
        return instance ;
    }
    
    /**
     *
     * @param newName
     * @param newFirstname
     */
    public synchronized static void setInstance (String newName, String newFirstname)
    {
        instance.setName(newName);
        instance.setFirstname(newFirstname);
    }

    /**
     *
     */
    public void addVideoGame(){
        
        //Object to JSON in file
        //mapper.writeValue(this.videoGameList, newVideoGame);

        //set name
        Scanner nameGame = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter the video game's name");
        gameName = nameGame.nextLine();

        
        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String gameManufacturer;

        System.out.println("Enter the manufacturer");
        gameManufacturer = manufacturer.nextLine();
        
        // set Platform
        Scanner platform = new Scanner(System.in);
        String gamePlatform;

        System.out.println("Enter the platform");
        gamePlatform = platform.nextLine();
        
        VideoGame newVideoGame = new VideoGame(gamePlatform, gameName, gameManufacturer);
        
        // Add game
        GameLibrary.getVideoGameList().add(newVideoGame);
        System.out.println("Add with success");
    }
    public void addBoardGame(){
        
        //set name
        Scanner nameGame = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter the board game's name");
        gameName = nameGame.nextLine();

        
        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String gameManufacturer;

        System.out.println("Enter the manufacturer");
        gameManufacturer = manufacturer.nextLine();
        
        // set player number
        Scanner platform = new Scanner(System.in);
        int playerNumber;

        System.out.println("Enter the player number");
        playerNumber = Integer.parseInt(platform.nextLine());
        
        BoardGame newBoardGame = new BoardGame(playerNumber, gameName, gameManufacturer);
   
        // Add game
        GameLibrary.getBoardGameList().add(newBoardGame);
        System.out.println("Add with success");
    }

    /**
     *
     */
    public void addToy(){
        
        //set name
        Scanner nameGame = new Scanner(System.in);
        String gameName;
        
        System.out.println("Enter the toy's name");
        gameName = nameGame.nextLine();

        // set manufacturer
        Scanner manufacturer = new Scanner(System.in);
        String gameManufacturer;

        System.out.println("Enter the manufacturer");
        gameManufacturer = manufacturer.nextLine();
        
        // set material
        Scanner platform = new Scanner(System.in);
        String material;

        System.out.println("Enter the material");
        material = platform.nextLine();
        
        Toy newToy = new Toy(material, gameName, gameManufacturer);
        
        // Add game
        GameLibrary.getToyList().add(newToy);
        System.out.println("Add with success");
    }
    
    /**
     *
     * @return
     */
    public String getBorrowList(){
        String result = "";
        if(!GameLibrary.getAllBorrowList().isEmpty()){ // if database not empty
            
            for (int i = 0; i < GameLibrary.getAllBorrowList().size(); i++) {

                Borrow borrow = GameLibrary.getAllBorrowList().get(i);

                System.out.println("-----------------------------------------------------------------------------");
                borrow.getGame().displayInfos();
                borrow.getAdherent().displayInfos();
                System.out.println("-----------------------------------------------------------------------------");
            }
            result = "Found with success";
        }else{
            result = "No loan in the database";
        }
        return result;
    }
    
}
