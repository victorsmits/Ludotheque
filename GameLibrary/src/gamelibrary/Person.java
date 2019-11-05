/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

/**
 *
 * @author ablo1
 */
public class Person {
    
   protected long id;
   protected String name;
   protected String firstname;
    
   public Person(String name, String firstname) {
        this.id = this.id = (long) ((Math.random()*((9999-1000)+1))+1000);
        this.name = name;
        this.firstname = firstname;
    }
   
   public long getId() {
        return id;
    }

    public void setId(long newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setFirstname(String newFirstname) {
        this.firstname = newFirstname;
    }
    
    public void searchVideoGame(String name){
        for (int i = 0; i < GameLibrary.getVideoGameList().size(); i++) {
            if(GameLibrary.getVideoGameList().get(i).getName().equals(name) ){
                System.out.printf("Name : %s ; Manufacturer: %s ; Id: %s ; Statut : %s ; Platform : %s%n", GameLibrary.getVideoGameList().get(i).getName(), 
                    GameLibrary.getVideoGameList().get(i).getManufacturer(), 
                    GameLibrary.getVideoGameList().get(i).getId(), 
                    GameLibrary.getVideoGameList().get(i).getStatut(),
                    GameLibrary.getVideoGameList().get(i).getPlatform());
            }
        }
    }

    public void searchBoardGame(String name){
        for (int i = 0; i < GameLibrary.getBoardGameList().size(); i++) {
            if(GameLibrary.getBoardGameList().get(i).getName().equals(name) ){
                System.out.printf("Name : %s ; Manufacturer: %s ; Id: %s ; Statut : %s ; PlayerNumber: %s%n", GameLibrary.getBoardGameList().get(i).getName(),
                        GameLibrary.getBoardGameList().get(i).getManufacturer(),
                        GameLibrary.getBoardGameList().get(i).getId(),
                        GameLibrary.getBoardGameList().get(i).getStatut(),
                        GameLibrary.getBoardGameList().get(i).getPlayerNumber());
            }
        }
    }


    public void searchToy(String name){
        for (int i = 0; i < GameLibrary.getToyList().size(); i++) {
            if(GameLibrary.getToyList().get(i).getName().equals(name) ){
                System.out.printf("Name : %s ; Manufacturer: %s ; Id: %s ; Statut : %s ; Material: %s%n", GameLibrary.getToyList().get(i).getName(),
                        GameLibrary.getToyList().get(i).getManufacturer(),
                        GameLibrary.getToyList().get(i).getId(),
                        GameLibrary.getToyList().get(i).getStatut(),
                        GameLibrary.getToyList().get(i).getMaterial());
            }
        }
    }



}
