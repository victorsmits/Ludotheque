/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import gamelibrary.Adherent;
import gamelibrary.BoardGame;
import gamelibrary.GameLibrary;
import gamelibrary.Manager;
import gamelibrary.Toy;
import gamelibrary.VideoGame;
import java.util.ArrayList;

/**
 *
 * @author ablo1
 */
public class GameLibraryMock {
    private String name;
    private static ManagerMock manager;
    private static ArrayList<VideoGame> videoGameList = new ArrayList<VideoGame>();
    private static ArrayList<Toy> toyList = new ArrayList<Toy>();
    private static ArrayList<BoardGame> boardGameList = new ArrayList<BoardGame>();
    private static ArrayList<Adherent> adherentList = new ArrayList<Adherent>();
    //private ArrayList<Map<String, ArrayList<Game>>> gamesJson;
    private static GameLibraryMock instanceSingleObjectGameLibrary;

    //make the constructor private so that this class cannot be instantiated twice
    private GameLibraryMock(String name) {
        this.name = name;
        manager = ManagerMock.getInstance();
    }


    //Get the only object available
    public synchronized static GameLibraryMock getInstanceSingleObjectGameLibrary(){
       if(instanceSingleObjectGameLibrary== null) {

          instanceSingleObjectGameLibrary = new GameLibraryMock("ECAM Game Library");
       }
        return instanceSingleObjectGameLibrary;
    }
    
    public String getName() {
        return name;
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
        
    public static ManagerMock getManager() {
        return manager;
    }

    public  void setManager(String r, String f) {
        Manager.setInstance(r, f);
    }
    
    
}
