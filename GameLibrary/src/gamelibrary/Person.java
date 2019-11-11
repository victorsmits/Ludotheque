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
    
   private long id;
   private String name;
   private String firstname;
   private Authentification auth;
    
   public Person(String name, String firstname, String username, String password) {
        this.id = this.id = (long) ((Math.random()*((9999-1000)+1))+1000);
        this.name = name;
        this.firstname = firstname;
        this.auth = new Authentification(username, password);
    }
   
   public long getId() {
        return id;
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
    
    /*--------------- Searching ---------------*/
    public String searchVideoGame(String name){
        int count = 0;
        
        if(GameLibrary.getVideoGameList().isEmpty()){ // if database empty
            return "No video game in database";
        }
        
        for (int i = 0; i < GameLibrary.getVideoGameList().size(); i++) {
            if(GameLibrary.getVideoGameList().get(i).getName().equals(name) ){ // if found
                
                GameLibrary.getVideoGameList().get(i).displayInfos();
                count++;
                
            }
        }
        
        if(count > 0){
            return Integer.toString(count) + " result(s) found";
        }else{ // if no found
            return "No found";
        }
    }
    
    public String searchBoardGame(String name){
        int count = 0;
        
        if(GameLibrary.getBoardGameList().isEmpty()){ // if database empty
            return "No video game in database";
        }
        
        for (int i = 0; i < GameLibrary.getBoardGameList().size(); i++) {
            if(GameLibrary.getBoardGameList().get(i).getName().equals(name) ){ // if found
                
                GameLibrary.getBoardGameList().get(i).displayInfos();
                count++;
                
            }
        }
        
        if(count > 0){
            return Integer.toString(count) + " result(s) found";
        }else{ // if no found
            return "No found";
        }
    }
    
    public String searchToy(String name){
        int count = 0;
        
        if(GameLibrary.getToyList().isEmpty()){ // if database empty
            return "No video game in database";
        }
        
        for (int i = 0; i < GameLibrary.getToyList().size(); i++) {
            if(GameLibrary.getToyList().get(i).getName().equals(name) ){ // if found

                GameLibrary.getToyList().get(i).displayInfos();
                count++;

            }
        }

        if(count > 0){
            return Integer.toString(count) + " result(s) found";
        }else{ // if no found
            return "No found";
        }
    }
    
    void displayInfos(){
        System.out.printf("Name : %s ; Firstname: %s ; Id : %s%n",getName(), 
                        getfirstname(), 
                        getId()
        );
    }

}
