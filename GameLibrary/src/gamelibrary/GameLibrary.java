/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.util.ArrayList;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner; // import the Scanner class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

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
    public synchronized static GameLibrary getInstanceSingleObjectGameLibrary(){
       if(instanceSingleObjectGameLibrary== null) {

          instanceSingleObjectGameLibrary = new GameLibrary("ECAM Game Library");
       }
        return instanceSingleObjectGameLibrary;
    }
    
    public String getName() {
        return name;
    }
    
    public static ArrayList<Borrow> getAllBorrowList() {
        return allBorrowList;
    }

    public static ArrayList<VideoGame> getVideoGameList() {
        return videoGameList;
    }

    public static ArrayList<Toy> getToyList() {
        return toyList;
    }

    public static ArrayList<BoardGame> getBoardGameList() {
        return boardGameList;
    }

    public static ArrayList<Adherent> getAdherentList() {
        return adherentList;
    }
        
    public static Manager getManager() {
        return manager;
    }

    public  void setManager(String r, String f) {
        Manager.setInstance(r, f);
    }
        
    public void createAdherentAccount(){
        
        //set name
        Scanner name = new Scanner(System.in);
        String getName;
        
        System.out.println("Enter your name"); // Enter username and press Enter
        getName = name.nextLine();

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
    
    /*public void init() throws JsonProcessingException{
        try (FileReader reader = new FileReader("D:\\Ablo_Doss\\Ecole\\4eme_5eme\\Q1\\Architecture_logicielle\\Test driven développement\\Ludotheque\\GameLibrary\\src\\gamelibrary\\Games.json"))
        {
            //Read JSON file
            gamesJson = mapper.readValue(reader, ArrayList.class);
            //System.out.println(gamesJson.get(0).get("videoGame"));
            this.videoGameList = gamesJson.get(0).get("videoGame");
            this.boardGameList = gamesJson.get(1).get("videoGame");
            this.toyList = gamesJson.get(2).get("videoGame");
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }*/
   
    
   
}
