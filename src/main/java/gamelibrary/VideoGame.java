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

    /**
     *
     * @param platform
     * @param name
     * @param manufacturer
     */
    public VideoGame(String platform, String name, String manufacturer) {
        super(name, manufacturer);
        this.platform = platform;
    }

    /**
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * @param videoGame
     */
    public void displayPlateform(VideoGame videoGame){
        System.out.println(videoGame.getPlatform());
    }
    
    @Override
    void displayInfos(){
        System.out.printf("Name : %s ; Manufacturer: %s ; Id : %s ; Statut : %s ; Platform : %s%n",getName(), 
                        getManufacturer(), 
                        getId(), 
                        getStatut(),
                        getPlatform());
    }
}
