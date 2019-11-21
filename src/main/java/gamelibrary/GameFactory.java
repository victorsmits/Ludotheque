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
public class GameFactory implements GameFactoryIF {
    
    public Game createGame(String type, String specificParam,
                           String name, String manufacturer, int nOfPlayers){

        if(type.equals("VideoGame")) {
          return new VideoGame(specificParam, name, manufacturer);
        } 
        else if(type.equals("BoardGame")) {
          if (nOfPlayers<=0){
            return null;
          }
          return new BoardGame(nOfPlayers, name, manufacturer);
        }
        else if(type.equals("BoardGame")) {
          return new Toy(specificParam, name, manufacturer);
        }
        else{
          return null;
        }
    }
}
