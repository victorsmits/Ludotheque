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
        String parameter = "";
        int nOfPlayers = 0;
        String type = "";
        boolean typeExist = false;
        while (! typeExist){
            System.out.println("\t VideoGame \n"
                    + "\t BoardGame \n"
                    + "\t Toy");
            Scanner gameTypeInput = new Scanner(System.in);

            System.out.println("Enter the type of game as written above :");
            type = gameTypeInput.nextLine();
            if (type == "VideoGame")
            {
                parameter = "platform";
                typeExist = true;
            }
            else if (type == "BoardGame")
            {
                parameter = "number of players";
                typeExist = true;
            }
            else if (type == "Toy")
            {
                parameter = "material";
                typeExist = true;
            }
            else {
                //TODO : catch wrong type of game => redo input ?
                System.out.println("Please type in a game type in the following list : " +
                        "\n\t * VideoGame" +
                        "\n\t * BoardGame" +
                        "\n\t * Toy");
            }
        }

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
        Scanner specificParamInput = new Scanner(System.in);
        String specificParam;

        System.out.println(String.format("Enter the %s", parameter));
        specificParam = specificParamInput.nextLine();
        if (type == "BoardGame"){
            try{
                nOfPlayers = Integer.parseInt(specificParam);
            }
            catch(NumberFormatException e){
                nOfPlayers = -1;
                //TODO : catch non integer fault in input => redo input ?
            }
        }
        Game newGame = GameFactory.createGame(type, specificParam, name, manufacturer, nOfPlayers);

        // Add game
        GameLibrary.addGame(newGame); //fixed by creating getGameList in GameLibrary
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
