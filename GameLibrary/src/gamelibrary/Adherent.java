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

                    count = 1;
                }else{
                    count = 2;
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
    
    public String borrowBoardGame(long id){
        BoardGame boardgame;
        Borrow borrow;
        
        int count = 0;
        
        if(GameLibrary.getBoardGameList().isEmpty()){ // if database empty
            return "No board game in database";
        }
        
        for (int i = 0; i < GameLibrary.getBoardGameList().size(); i++) {
            if(GameLibrary.getBoardGameList().get(i).getId() == id ){ // if found
                
                if(GameLibrary.getBoardGameList().get(i).getStatut() == true){
                    boardgame = GameLibrary.getBoardGameList().get(i);
                    boardgame.setStatut(false);

                    borrow = new Borrow(this, boardgame);

                    GameLibrary.getAllBorrowList().add(borrow);
                    borrowList.add(borrow);

                    count = 1;
                }else{
                    count = 2;
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
    
    public String borrowToy(long id){
        Toy toy;
        Borrow borrow;
        
        int count = 0;
        
        if(GameLibrary.getToyList().isEmpty()){ // if database empty
            return "No toy in database";
        }
        
        for (int i = 0; i < GameLibrary.getToyList().size(); i++) {
            if(GameLibrary.getToyList().get(i).getId() == id ){ // if found
                
                if(GameLibrary.getToyList().get(i).getStatut() == true){
                    toy = GameLibrary.getToyList().get(i);
                    toy.setStatut(false);

                    borrow = new Borrow(this, toy);

                    GameLibrary.getAllBorrowList().add(borrow);
                    borrowList.add(borrow);

                    count = 1;
                }else{
                    count = 2;
                }
                
            }
        }
        
        switch (count) {
            case 1:
                return "Borrow with successfull";
            case 2:
                return "this toy is not available";
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
    
    public String getYourBorrowList(){
        String result = "";
        if(!borrowList.isEmpty()){ // if database empty
            
            for (int i = 0; i < borrowList.size(); i++) {

                Borrow borrow = borrowList.get(i);

                System.out.println("-----------------------------------------------------------------------------");
                borrow.getGame().displayInfos();
                System.out.println("-----------------------------------------------------------------------------");
                result = "Found with successfull";
            }
        }else{
            result = "You no loan a game";
        }
        return result;
    }
    
    
}
