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
public interface GameFactoryIF {

    /**
     *
     * @param type
     * @return
     */
    Game createGame(String type);
}
