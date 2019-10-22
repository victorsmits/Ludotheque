/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.util.ArrayList;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner; // import the Scanner class 

/**
 *
 * @author ablo1
 */
public class GameLibrary {
    
    private Person manager;
    public ArrayList<Game> gameList;
    private Person adherent;
    public HashMap<String, ArrayList<Game>> gameJson = new HashMap<String, ArrayList<Game>>();

    public GameLibrary() {
        this.gameList  = new ArrayList<Game>();
    }
        
    public Person getManager() {
        return manager;
    }

    public Person getAdherent() {
        return adherent;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public void setAdherent(Person adherent) {
        this.adherent = adherent;
    }
  
    public void addGame(Game game){
   
        // Add game
        gameList.add(game);
    }
    
    public void getAllGames(){
        for (int i = 0; i < gameList.size(); i++) {
            System.out.printf("Name : %s ; Manufacturer: %s ; Id: %s ; Statut : %s%n", gameList.get(i).getName(), 
                    gameList.get(i).getManufacturer(), 
                    gameList.get(i).getId(), 
                    gameList.get(i).getStatut());
        }
        
    }
    
   
    
   
}
