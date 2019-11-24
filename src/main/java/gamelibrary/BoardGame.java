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

    /**
     *
     * @param playerNumber
     * @param name
     * @param manufacturer
     */
    public BoardGame(int playerNumber, String name, String manufacturer) {
        super(name, manufacturer);
        this.playerNumber = playerNumber;
    }

    /**
     *
     * @return
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     *
     * @param playerNumber
     */
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     *
     * @param boardGame
     */
    public void displayPlayerNumber(BoardGame boardGame){

        System.out.println( boardGame.getPlayerNumber());

    }
    
    @Override
    void displayInfos(){
        System.out.printf("Name : %s ; Manufacturer: %s ; Id : %s ; Statut : %s ; Player Number : %s%n", getName(), 
                        getManufacturer(), 
                        getId(), 
                        getStatut(),
                        getPlayerNumber());
    }

    public String getSpecificInfo(){ return Integer.toString(this.playerNumber);}
}
