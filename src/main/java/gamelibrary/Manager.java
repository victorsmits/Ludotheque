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
    private Manager(String name, String firstName, String username, String password) {
        super(name, firstName, username, password);

    }
    
    // Only one instantiated ==> Singleton

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
     * @param newFirstName
     */
    public synchronized static void setInstance (String newName, String newFirstName)
    {
        instance.setName(newName);
        instance.setFirstname(newFirstName);
    }

    /**
     *
     */
    public void addGame(){
        System.out.println("\t VideoGame \n"
                            + "\t BoardGame \n"
                            + "\t Toy");
        Scanner gameTypeInput = new Scanner(System.in);
        String type;

        System.out.println("Enter the type of game as written above :");
        type = gameTypeInput.nextLine();
        //set name

        Scanner gameNameInput = new Scanner(System.in);
        String name;

        System.out.println("Enter the game's name");
        name = gameNameInput.nextLine();

        // set manufacturer
        Scanner gameManufacturerInput = new Scanner(System.in);
        String manufacturer;

        System.out.println("Enter the manufacturer");
        manufacturer = gameManufacturerInput.nextLine();

        // set specific parameter (according to the type of game)
        String parameter = "";
        int nOfPlayers = -1;
        if (type == "VideoGame")
        {
            parameter = "platform";
        }
        else if (type == "BoardGame")
        {
            parameter = "number of players";
        }
        else if (type == "Toy")
        {
            parameter = "material";
        }
        else {
            //TODO : catch wrong type of game => redo input ?
        }
        Scanner specificParamInput = new Scanner(System.in);
        String specificParam;

        System.out.println(String.format("Enter the %s", parameter));
        specificParam = specificParamInput.nextLine();
        if (type == "BoardGame"){
            try{
                nOfPlayers = Integer.parseInt(specificParam);
            }
            catch(NumberFormatException){
                nOfPlayers = -1;
                //TODO : catch non integer fault in input => redo input ?
            }
        }
        Game newGame = GameFactory.createGame(type, specificParam, name, manufacturer, nOfPlayers);

        // Add game
        GameLibrary.getVideoGameList().add(newGame); //fixed by creating getGameList in GameLibrary
        System.out.println("Add with success");
    }
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
