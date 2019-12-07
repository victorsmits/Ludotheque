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
    public Adherent(String name, String firstName,
                    String username, String password) {
        super(name, firstName, username, password);
        borrowList = new ArrayList<>();
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
     * @return
     */
    private String borrowGame(String gameType,
                              ArrayList<Game> database,
                              long id) {
        Game game;
        Borrow borrow;
        int count = 0;

        if (GameLibrary.getVideoGameList().isEmpty()) {
            return "No video game in database";
        }

        for (Game value : database) {
            //Check if game exist
            if (value.getId() == id) {
                //Check the game status
                if (value.getStatus()) {
                    game = value;
                    game.setStatus(false);

                    borrow = new Borrow(this, game);

                    GameLibrary.getAllBorrowList().add(borrow);
                    borrowList.add(borrow);

                    count = 1;
                    break;
                } else {
                    count = 2;
                }

            }
        }
        switch (count) {
            case 1:
                return "You can pick up your " + gameType + ".";
            case 2:
                return "This " + gameType + " is not available.";
            default:
                return "This " + gameType + " was not found.";
        }
    }

    
    @Override
    void displayInfos() {
        System.out.printf("Name : %s ; First Name: %s ; " +
                        "Id : %s ; date of Subscription : %s%n",
                        getName(),
                        getFirstName(),
                        getId(),
                        getSubscriptionBegin()
        );
    }
    
    /**
     *
     */
    public void getYourBorrowList() {
        if (!borrowList.isEmpty()) { // if database not empty
            
            for (int i = 0; i < borrowList.size(); i++) {

                Borrow borrow = borrowList.get(i);

                System.out.println("-------------------------------------" +
                        "----------------------------------------");
                borrow.getGame().displayInfos();
                System.out.println("-------------------------------------" +
                        "----------------------------------------");
            }
        } else {
            System.out.println("You have no game in loan");
        }
    }
    
    
}
