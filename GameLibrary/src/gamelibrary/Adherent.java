/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author ablo1
 */
public class Adherent extends Person {
    
    private ArrayList<Borrow> borrowList;
    private LocalDate subscriptionBegin;
    
    /**
     *
     * @param name
     * @param firstname
     * @param username
     * @param password
     */
    public Adherent(String name, String firstname, String username, String password){
        super(name, firstname, username, password);
        borrowList = new ArrayList();
        subscriptionBegin = LocalDate.now();
    }
    
    public LocalDate getSubscriptionBegin() {
        return subscriptionBegin;
    }

    public String borrowVideoGame(long id){
        VideoGame videogame;
        Borrow borrow;
        
        int count = 0;
        
        if(GameLibrary.getVideoGameList().isEmpty()){ // if database empty
            return "No video game in database";
        }
        
        for (int i = 0; i < GameLibrary.getVideoGameList().size(); i++) {
            if(GameLibrary.getVideoGameList().get(i).getId() == id ){ // if found
                
                if(GameLibrary.getVideoGameList().get(i).getStatut() == true){
                    videogame = GameLibrary.getVideoGameList().get(i);
                    videogame.setStatut(false);

                    borrow = new Borrow(this, videogame);

                    GameLibrary.getAllBorrowList().add(borrow);
                    borrowList.add(borrow);

                    count++;
                }else{
                    count = count + 2;
                }
                
            }
        }
        
        switch (count) {
            case 1:
                return "Borrow with successfull";
            case 2:
                return "this game is not available";
            default:
                // if no found
                return "No found";
        }
        
    }
    
    @Override
    void displayInfos(){
        System.out.printf("Name : %s ; Firstname: %s ; Id : %s ; date of Subscription : %s%n",getName(), 
                        getfirstname(), 
                        getId(),
                        getSubscriptionBegin()
        );
    }
    
    
}
