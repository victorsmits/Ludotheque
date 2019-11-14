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
   private String username;
   private String password;
    
    /**
     *
     * @param name
     * @param firstname
     * @param username
     * @param password
     */
    public Person(String name, String firstname, String username, String password) {
        this.id = this.id = (long) ((Math.random()*((9999-1000)+1))+1000);
        this.name = name;
        this.firstname = firstname;
        this.username = username;
        this.password = password;
    }
   
    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
   
    /**
     *
     * @return
     */
    public long getId() {
        return id;
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
     * @param newName
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     *
     * @return
     */
    public String getfirstname() {
        return firstname;
    }

    /**
     *
     * @param newFirstname
     */
    public void setFirstname(String newFirstname) {
        this.firstname = newFirstname;
    }
    
   @Override
    public String toString(){
        return getName() + " " + getfirstname();
    }
    
    /*--------------- Searching ---------------*/

    /**
     *
     * @param name
     * @return
     */

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
    
    /**
     *
     * @param name
     * @return
     */
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
    
    /**
     *
     * @param name
     * @return
     */
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