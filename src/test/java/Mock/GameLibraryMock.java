/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import gamelibrary.Adherent;
import gamelibrary.BoardGame;
import gamelibrary.Borrow;
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
    private static ManagerMock manager = ManagerMock.getInstance();
    private static ArrayList<VideoGame> videoGameList = new ArrayList<VideoGame>();
    private static ArrayList<Toy> toyList = new ArrayList<Toy>();
    private static ArrayList<BoardGame> boardGameList = new ArrayList<BoardGame>();
    private static ArrayList<Adherent> adherentList = new ArrayList<Adherent>();
    //private ArrayList<Map<String, ArrayList<Game>>> gamesJson;
    private static GameLibraryMock instanceSingleObjectGameLibrary;

    //make the constructor private so that this class cannot be instantiated twice
    private GameLibraryMock(String name) {
        this.name = name;
        
    }


    //Get the only object available
    public synchronized static GameLibraryMock getInstanceSingleObjectGameLibrary(){
       if(instanceSingleObjectGameLibrary== null) {

          instanceSingleObjectGameLibrary = new GameLibraryMock("ECAM Game Library Test");
       }
        return instanceSingleObjectGameLibrary;
    }
    
    public String getName() {
        return name;
    }

    public static ArrayList<VideoGame> getVideoGameList() {
        videoGameList.add(new VideoGame("Wii", "PES 18", "Nitendo"));
        videoGameList.add(new VideoGame("Xbox360", "FIFA 10", "EA"));
        return videoGameList;
    }

    public static ArrayList<Toy> getToyList() {
        toyList.add(new Toy("Caoutchouc", "Barbie", "Chine"));
        toyList.add(new Toy("Bois", "Camion", "USA"));
        return toyList;
    }

    public static ArrayList<BoardGame> getBoardGameList() {
        boardGameList.add(new BoardGame(2, "Dames", "Sony"));
        boardGameList.add(new BoardGame(2, "Uno", "Microsoft"));
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
    
    public static ArrayList<Borrow> getAllBorrowList() {
        ArrayList<Borrow> allBorrowList = new ArrayList();
        allBorrowList.add(new Borrow(new Adherent("Gui", "Serges", "charo", "65987"), new VideoGame("XboxOne", "FIFA 20", "Microsoft")));
        return allBorrowList;
    }
    
    
}
