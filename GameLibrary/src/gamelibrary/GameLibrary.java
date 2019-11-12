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

    //create an object of SingleObject
    //public ObjectMapper mapper = new ObjectMapper();
    private String name;
    private static Manager manager = Manager.getInstance();;
    private static ArrayList<Borrow> allBorrowList = new ArrayList();
    private static ArrayList<VideoGame> videoGameList;
    private static ArrayList<Toy> toyList;
    private static ArrayList<BoardGame> boardGameList;
    private static ArrayList<Adherent> adherentList;
    //private ArrayList<Map<String, ArrayList<Game>>> gamesJson;
    private static GameLibrary instanceSingleObjectGameLibrary;

    //make the constructor private so that this class cannot be instantiated twice
    private GameLibrary(String name) {
        this.name = name;
        videoGameList = new ArrayList();
        toyList = new ArrayList();
        boardGameList = new ArrayList();
        adherentList = new ArrayList();
    }


    //Get the only object available

    /**
     *
     * @return
     */
    public synchronized static GameLibrary getInstanceSingleObjectGameLibrary(){
       if(instanceSingleObjectGameLibrary== null) {

          instanceSingleObjectGameLibrary = new GameLibrary("ECAM Game Library");
       }
        return instanceSingleObjectGameLibrary;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     *
     * @return
     */
    public static ArrayList<Borrow> getAllBorrowList() {
        return allBorrowList;
    }

    /**
     *
     * @return
     */
    public static ArrayList<VideoGame> getVideoGameList() {
        return videoGameList;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Toy> getToyList() {
        return toyList;
    }

    /**
     *
     * @return
     */
    public static ArrayList<BoardGame> getBoardGameList() {
        return boardGameList;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Adherent> getAdherentList() {
        return adherentList;
    }
        
    /**
     *
     * @return
     */
    public static Manager getManager() {
        return manager;
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
        
        System.out.println("Enter your name"); // Enter username and press Enter
        getName = yourname.nextLine();

        // set firstname
        Scanner firstname = new Scanner(System.in);
        String getFirstname;

        System.out.println("Enter your firstname");  // Enter username and press Enter
        getFirstname = firstname.nextLine();
        
        //set username
        Scanner username = new Scanner(System.in);
        String getUsername;
        
        System.out.println("Choose your username"); // Enter username and press Enter
        getUsername = username.nextLine();

        // set password
        Scanner password = new Scanner(System.in);
        String getPassword;

        System.out.println("Choose your password");  // Enter username and press Enter
        getPassword = password.nextLine();

        
        Adherent adherent = new Adherent(getName, getFirstname, getUsername, getPassword);
        
        // Add adherent
        getAdherentList().add(adherent);
        
        System.out.println("Account create with successful");
    }       
}
