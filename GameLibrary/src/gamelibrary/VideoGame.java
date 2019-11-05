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
public class VideoGame extends Game {
    private String platform;

    public VideoGame(String platform, String name, String manufacturer) {
        super(name, manufacturer);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public void displayPlateform(VideoGame videoGame){
        System.out.println(videoGame.getPlatform());
    }
}
