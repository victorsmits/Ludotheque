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
abstract class Game {
    
    private String name;
    private long id;
    private String manufacturer;
    private boolean statut;

    public Game(String name, String manufacturer) {
      this.id = (long) ((Math.random() * ((9999 - 1000) + 1)) + 1000);
      this.name = name;
      this.statut = true;
      this.manufacturer = manufacturer;
    }

    public Game() {

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

    public abstract String getSpecificInfo ();

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }

    void displayName(){
        System.out.println(getName());
    }

    void displayStatus(){
        System.out.println(getStatut());
    }

    abstract void displayInfos();

}
