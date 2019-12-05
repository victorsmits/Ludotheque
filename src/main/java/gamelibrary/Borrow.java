/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.time.LocalDate;
/**
 *
 * @author ablo1
 */
public class Borrow {
    
    private Adherent adherent;
    private Game game;
    private long id;
    private LocalDate dateOfBorrow;
    private LocalDate dateOfReturn;

    /**
     *
     * @param adherent
     * @param game
     */
    public Borrow(Adherent adherent, Game game) {
        this.id = (long) ((Math.random() * ((9999 - 1000) + 1)) + 1000);
        dateOfBorrow = LocalDate.now();
        dateOfReturn = dateOfBorrow.plusMonths(1);;
        this.adherent = adherent;
        this.game = game;
    }

    /*---------------- GETTER ----------------*/

    /**
     *
     * @return
     */

    public Adherent getAdherent() {
        return adherent;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateOfBorrow() {
        return dateOfBorrow;
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
    public Game getGame() {
        return game;
    }

    /*---------------- SETTER ----------------*/

    /**
     *
     * @param adherent
     */

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    /**
     *
     * @param dateOfReturn
     */
    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
    
    void displayInfos(){
        System.out.println();
    }

    
}
