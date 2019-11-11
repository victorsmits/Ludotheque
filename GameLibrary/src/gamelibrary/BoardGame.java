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
public class BoardGame extends Game implements FactoryGame{
    private int playerNumber;

    public BoardGame(int playerNumber, String name, String manufacturer) {
        super(name, manufacturer);
        this.playerNumber = playerNumber;
    }

    public BoardGame() {
        super();
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

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

    public void CreateGame() {
        System.out.println("Inside BoardGame::CreateGame method.");
    }

    
}
