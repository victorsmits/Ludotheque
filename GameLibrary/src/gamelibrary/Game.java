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
public class Game {
    
    protected String name;
    protected long id;
    protected String manufacturer;
    protected boolean statut;
    
    public Game(String name, String manufacturer) {
      this.id = (long) ((Math.random()*((9999-1000)+1))+1000);
      this.name = name;
      this.statut = true;
      this.manufacturer = manufacturer;
    }
          
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean getStatut() {
        return statut;
    }

    public void setStatut(boolean newstatut) {
        this.statut = newstatut;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }    
    
}
