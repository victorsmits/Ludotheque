/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.util.ArrayList;
import java.util.Scanner; // import the Scanner class

/**
 *
 * @author ablo1
 */
public final class GameLibrary {

    private String name;
    private static Manager manager = Manager.getInstance();;
    private static ArrayList<Borrow> allBorrowList = new ArrayList<>();
    private static ArrayList<Game> gameList;
    private static ArrayList<Game> videoGameList;
    private static ArrayList<Game> toyList;
    private static ArrayList<Game> boardGameList;
    private static ArrayList<Adherent> adherentList;
    private static GameLibrary instanceSingleObjectGameLibrary;

    //make the constructor private so that this class
    // cannot be instantiated twice
    private GameLibrary(String name) {
        this.name = name;
        videoGameList = new ArrayList<>();
        toyList = new ArrayList<>();
        boardGameList = new ArrayList<>();
        adherentList = new ArrayList<>();
    }

    /**
     * @return
     */
    public static GameLibrary getInstanceSingleObjectGameLibrary(){
       if (instanceSingleObjectGameLibrary == null) {

          instanceSingleObjectGameLibrary = new GameLibrary("ECAM Game"
              + " Library");
       }
        return instanceSingleObjectGameLibrary;
    }
    
    /**
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return
     */
    public static ArrayList<Borrow> getAllBorrowList() {
        return allBorrowList;
    }

    /**
     * @return
     */
    public static ArrayList<Game> getGameList() {
        return gameList;
    }
    /**
     * @return
     */
    public static ArrayList<Game> getVideoGameList() {
        return videoGameList;
    }

    /**
     * @return
     */
    public static ArrayList<Game> getToyList() {
        return toyList;
    }

    /**
     * @return
     */
    public static ArrayList<Game> getBoardGameList() {
        return boardGameList;
    }

    /**
     * @return
     */
    public static ArrayList<Adherent> getAdherentList() {
        return adherentList;
    }
        
    /**
     * @return
     */
    public static Manager getManager() {
        return manager;
    }

    /**
     * Setter for gameList
     * @param game
     */
    public static void addGame (Game game){
        gameList.add(game);
    }
    /**
     *
     * @param r
     * @param f
     */
    public  void setManager(String r, String f) {
        Manager.setInstance(r, f);
    }
        
    /**
     *
     */
    public void createAdherentAccount(){
        
        //set name
        Scanner yourname = new Scanner(System.in);
        String getName;
        
        System.out.println("Enter your name");
        getName = yourname.nextLine();

        // set firstname
        Scanner firstname = new Scanner(System.in);
        String getFirstname;

        System.out.println("Enter your firstname");
        getFirstname = firstname.nextLine();
        
        //set username
        Scanner username = new Scanner(System.in);
        String getUsername;
        
        System.out.println("Choose your username");
        getUsername = username.nextLine();

        // set password
        Scanner password = new Scanner(System.in);
        String getPassword;

        System.out.println("Choose your password");
        getPassword = password.nextLine();

        
        Adherent adherent = new Adherent(getName, getFirstname, getUsername,
            getPassword);
        
        // Add adherent
        getAdherentList().add(adherent);
        
        System.out.println("Account create with success");
    }       
}
