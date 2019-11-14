/*
 * To change this license header, choose License Headers in Project Properties.
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
    
    /**
     *
     * @return
     */
    public Adherent adherentLogin(){
        //put  username
        Scanner user = new Scanner(System.in);
        String username;
        System.out.println("Enter your username"); // Enter username and press Enter
        username = user.nextLine();

        // put password
        Scanner pass = new Scanner(System.in);
        String password;
        System.out.println("Enter your password");  // Enter username and press Enter
        password = pass.nextLine();
        
        int count = 0;
        Adherent adh = null;
        if(GameLibrary.getAdherentList().isEmpty()){ // if database empty
            System.out.println("No found in database");
            return null;
        }
        
        for (int i = 0; i < GameLibrary.getAdherentList().size(); i++) {
            if(GameLibrary.getAdherentList().get(i).getUsername().equals(username) ){ // if found
                
                if(GameLibrary.getAdherentList().get(i).getPassword().equals(password) ){ // if found
                
                    count = 1;
                    adh = new Adherent(GameLibrary.getAdherentList().get(i).getName(),
                                        GameLibrary.getAdherentList().get(i).getfirstname(),
                                        GameLibrary.getAdherentList().get(i).getUsername(),
                                        GameLibrary.getAdherentList().get(i).getPassword());
                
                }else{
                    count = 2;
                }
                
            }else{
                count = 0;
            }
        }
        
        switch (count) {
            case 1:
                System.out.println("Successfull connexion");
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
        //put  username
        Scanner user = new Scanner(System.in);
        String username;
        System.out.println("Enter your username"); // Enter username and press Enter
        username = user.nextLine();

        // put password
        Scanner pass = new Scanner(System.in);
        String password;
        System.out.println("Enter your password");  // Enter username and press Enter
        password = pass.nextLine();
        
        int count = 0;
        Manager man = null;
        if(GameLibrary.getAdherentList() == null){ // if database empty
            System.out.println("No manager fot this game library");
            return null;
        }
        
        if(GameLibrary.getManager().getUsername().equals(username) ){ // if username is correct

            if(GameLibrary.getManager().getPassword().equals(password) ){ // if password is correct

                count = 1;
                man = GameLibrary.getManager();

            }else{
                count = 2;
            }

        }else{
            count = 0;
        }
        
        switch (count) {
            case 1:
                System.out.println("Successfull connexion");
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
        System.out.println("Logout with successfull");
        return null;
    }
    
    /**
     *
     * @return
     */
    public Adherent adherentLogout(){
        System.out.println("Logout with successfull");
        return null;
    }
    
}
