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
public class BoardGame extends Game{
    private int playerNumber;

    public BoardGame(int playerNumber, long id, String name, boolean statut, String manufacturer) {
        super(id, name, statut, manufacturer);
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    
    
    
}
