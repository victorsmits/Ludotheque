/*
 * To change this license header,
 * choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.util.Scanner;

/**
 *
 * @author ablo1
 */
public class Authentification {

    private String username;
    private String password;
    
    /**
     *
     * @return
     */
    public Adherent adherentLogin() {
        showLogIn();

        int count = 0;
        Adherent adh = null;
        if (GameLibrary.getAdherentList().isEmpty()) {
            System.out.println("No found in database...");
            return null;
        }
        
        for (int i = 0; i < GameLibrary.getAdherentList().size(); i++) {
            Adherent adherent = GameLibrary.getAdherentList().get(i);
            if (adherent.getUsername()
                .equals(this.username)) {

                if (adherent.getPassword().equals(this.password)) {
                    count = 1;
                    adh = new Adherent(adherent.getName(),
                                       adherent.getFirstName(),
                                       adherent.getUsername(),
                                       adherent.getPassword());
                
                } else {
                    count = 2;
                }
                
            } else {
                count = 0;
            }
        }

        switch (count) {
            case 1:
                System.out.println("Connexion succeeded");
                return adh;
            case 2:
                System.out.println("wrong password");
                return adh;
            default:
                System.out.println("wrong username");
                return adh;
        }
    }
    
    /**
     *
     * @return
     */
    public Manager managerLogin(){
       showLogIn();
        
        int count = 0;
        Manager man = null;
        if (GameLibrary.getAdherentList() == null){
            System.out.println("No manager fot this game library!");
            return null;
        }
        
        if (GameLibrary.getManager().getUsername().equals(this.username)) {

            if (GameLibrary.getManager().getPassword().equals(this.password)) {

                count = 1;
                man = GameLibrary.getManager();

            } else {
                count = 2;
            }

        } else {
            count = 0;
        }
        
        switch (count) {
            case 1:
                System.out.println("Connexion succeeded");
                return man;
            case 2:
                System.out.println("wrong password");
                return man;
            default:
                System.out.println("wrong username");
                return man;
        }
    }
    
    /**
     *
     * @return
     */
    public Manager managerLogout(){
        System.out.println("Logout with success!");
        return null;
    }
    
    /**
     *
     * @return
     */
    public Adherent adherentLogout(){
        System.out.println("Logout with success!");
        return null;
    }

    private void showLogIn(){
        //put  username
        Scanner user = new Scanner(System.in);
        String username;
        System.out.println("Enter your username:");
        this.username = user.nextLine();

        // put password
        Scanner pass = new Scanner(System.in);
        String password;
        System.out.println("Enter your password:");
        this.password = pass.nextLine();

    }
}
