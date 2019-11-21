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
     * @param firstName
     * @param username
     * @param password
     */
    public Adherent(String name, String firstName, String username, String password){
        super(name, firstName, username, password);
        borrowList = new ArrayList();
        subscriptionBegin = LocalDate.now();
    }
    
    /**
     *
     * @return
     */
    public LocalDate getSubscriptionBegin() {
        return subscriptionBegin;
    }

    /**
     *
     * @param id
     * @return
     */
    public String borrowVideoGame(long id){
        VideoGame videoGame;
        Borrow borrow;
        
        int count = 0;

        //Check Video Game DB
        if(GameLibrary.getVideoGameList().isEmpty()){
            return "No video game in database";
        }
        
        for (int i = 0; i < GameLibrary.getVideoGameList().size(); i++) {
            //Check if video game exist
            if(GameLibrary.getVideoGameList().get(i).getId() == id ){
                //Check the video game status
                if(GameLibrary.getVideoGameList().get(i).getStatut()){
                    videoGame = GameLibrary.getVideoGameList().get(i);
                    videoGame.setStatut(false);

                    borrow = new Borrow(this, videoGame);

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
                System.out.println("Please, go pick your borrow");
                return "Borrow with success";
            case 2:
                return "this game is not available";
            default:
                return "No found";
        }
        
    }
    
    /**
     *
     * @param id
     * @return
     */
    public String borrowBoardGame(long id){
        BoardGame boardGame;
        Borrow borrow;
        
        int count = 0;

        //Check Board Game DB
        if(GameLibrary.getBoardGameList().isEmpty()){
            return "No board game in database";
        }
        
        for (int i = 0; i < GameLibrary.getBoardGameList().size(); i++) {
            //Check if board game exist
            if(GameLibrary.getBoardGameList().get(i).getId() == id ){
                //Check the board game status
                if(GameLibrary.getBoardGameList().get(i).getStatut()){
                    boardGame = GameLibrary.getBoardGameList().get(i);
                    boardGame.setStatut(false);

                    borrow = new Borrow(this, boardGame);

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
                System.out.println("Please, go pick your borrow");
                return "Borrow with successfull";
            case 2:
                return "this game is not available";
            default:
                // if no found
                return "No found";
        }
        
    }
    
    /**
     *
     * @param id
     * @return
     */
    public String borrowToy(long id){
        Toy toy;
        Borrow borrow;
        
        int count = 0;

        //Check Toy DB
        if(GameLibrary.getToyList().isEmpty()){
            return "No toy in database";
        }
        
        for (int i = 0; i < GameLibrary.getToyList().size(); i++) {
            //Check if toy exist
            if(GameLibrary.getToyList().get(i).getId() == id ){
                //Check the toy status
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
                System.out.println("Please, go pick your borrow");
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
        System.out.printf("Name : %s ; First Name: %s ; Id : %s ; date of Subscription : %s%n",getName(),
                        getfirstname(), 
                        getId(),
                        getSubscriptionBegin()
        );
    }
    
    /**
     *
     * @return
     */
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
