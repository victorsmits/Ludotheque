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
    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public VideoGame getVideoGame() {
        return videoGame;
    }

    public void setVideoGame(VideoGame videoGame) {
        this.videoGame = videoGame;
    }

    public LocalDate getDateOfborrow() {
        return dateOfborrow;
    }

    public void setDateOfborrow(LocalDate dateOfborrow) {
        this.dateOfborrow = dateOfborrow;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    private Adherent adherent;
    private VideoGame videoGame;
    private Toy toy;
    private BoardGame boardGame;
    private LocalDate dateOfborrow;
    private LocalDate dateOfReturn;

    public Borrow(LocalDate dateOfborrow, LocalDate dateOfReturn,Adherent adherent, VideoGame videoGame, Toy toy,BoardGame boardGame) {
        this.dateOfborrow = dateOfborrow;
        this.dateOfReturn = dateOfReturn;
        this.adherent = adherent;
        this.videoGame = videoGame;
        this.toy = toy;
        this.boardGame = boardGame;
    }

}
