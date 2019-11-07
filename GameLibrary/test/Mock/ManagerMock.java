/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import gamelibrary.Adherent;
import gamelibrary.BoardGame;
import gamelibrary.GameLibraryTest;
import gamelibrary.Person;
import gamelibrary.VideoGame;
import gamelibrary.GameLibrary;
import gamelibrary.Manager;
import gamelibrary.Toy;
/**
 *
 * @author ablo1
 */
public class ManagerMock extends Person{
    
    private static ManagerMock instance ; // Unique instance

    public ManagerMock(String name, String firstname) {
        super(name, firstname);
    }
    
    // Only one instanciated ==> Singleton
    public synchronized static ManagerMock getInstance ()
    {
        if ( instance == null )
        {
            instance = new ManagerMock("Bill", "Jean");
        }
        return instance ;
    }
    
    public synchronized static void setInstance (String newName, String newFirstname)
    {
        instance.setName(newName);
        instance.setFirstname(newFirstname);
    }
    
    public void addVideoGame(){
        GameLibrary.getVideoGameList().add(new VideoGame("PS4", "PES 19", "Sony"));
        GameLibrary.getVideoGameList().add(new VideoGame("XboxOne", "FIFA 20", "Microsoft"));
    }
    
    public void addBoardGame(){
        GameLibrary.getBoardGameList().add(new BoardGame(2, "échec", "Sony"));
        GameLibrary.getBoardGameList().add(new BoardGame(2, "Monopoly", "Microsoft"));
    }
    
    public void addToy(){
        GameLibrary.getToyList().add(new Toy("Bois", "Voiture", "Chine"));
        GameLibrary.getToyList().add(new Toy("Caoutchouc", "Lego", "USA"));
    }
    
    public void addAdherent(){
        GameLibrary.getAdherentList().add(new Adherent("Nadim", "Julien"));
        GameLibrary.getAdherentList().add(new Adherent("Gui", "Serges"));
    }
}
