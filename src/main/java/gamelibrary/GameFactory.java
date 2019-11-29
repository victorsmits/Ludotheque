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
public class GameFactory  { //implements GameFactoryIF removed because useless
    
    public static Game createGame(String type, String specificParam,
                           String name, String manufacturer, int nOfPlayers){

      switch (type) {
        case "VideoGame":
          return new VideoGame(specificParam, name, manufacturer);
        case "BoardGame":
          if (nOfPlayers <= 0) {
            return null;
          }
          return new BoardGame(nOfPlayers, name, manufacturer);
        case "Toy":
          return new Toy(specificParam, name, manufacturer);
        default:
          return null;
      }
    }
}
