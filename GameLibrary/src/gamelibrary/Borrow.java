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
    private LocalDate dateOfborrow;
    private LocalDate dateOfReturn;

    public Borrow(Adherent adherent, Game game) {
        this.id = (long) ((Math.random()*((9999-1000)+1))+1000);
        dateOfborrow = LocalDate.now();
        dateOfReturn = dateOfborrow.plusMonths(1);;
        this.adherent = adherent;
        this.game = game;
    }

    /*---------------- GETTER ----------------*/
    public Adherent getAdherent() {
        return adherent;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public LocalDate getDateOfborrow() {
        return dateOfborrow;
    }
    
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
    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
    
    void displayInfos(){
        System.out.println();
    }

    
}
