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
    
    public Game(long id, String name, boolean statut, String manufacturer) {
      this.id = id;
      this.name = name;
      this.statut = statut;
      this.manufacturer = manufacturer;
    }
          
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setNom(String newName) {
        this.name = name;
    }

    public boolean getStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = manufacturer;
    }    
    
}
