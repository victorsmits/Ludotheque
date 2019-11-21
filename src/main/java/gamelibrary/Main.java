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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean main = true;
        
        while(main){
            // Create the only one Game library
            GameLibrary gamelibrary = GameLibrary.getInstanceSingleObjectGameLibrary();

            System.out.println("Welcome to " + gamelibrary.getName() + "\n" );
            System.out.println("\t1. Manager \n"
                    + "\t2. Adherent \n"
                    + "\t3. Create an account \n"
                    + "\t4. EXIT \n");

            //get choose
            Scanner ch = new Scanner(System.in);
            String getCh;

            System.out.println("Choose an option (enter the number)"); // Enter username and press Enter
            getCh = ch.nextLine();
            
            //Manager menu
            if(getCh.equals("1")){
                userFacadeImpl manMenu= new userFacadeImpl();
                manMenu.userFacadeImpl();
                manMenu.managerMenu();
                
            }
            
            //Adherent menu
            else if(getCh.equals("2")){

                userFacadeImpl adhMenu= new userFacadeImpl();
                adhMenu.userFacadeImpl();
                adhMenu.adherentMenu();
                
            }
            
            //New account menu
            else if(getCh.equals("3")){
                gamelibrary.createAdherentAccount();
            }
            
            //exit
            else if(getCh.equals("4")){
                main = false;
            }
        }
    }
}
