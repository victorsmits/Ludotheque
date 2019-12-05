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
        boolean main = true;
        
        while (main){
            // Create the only one Game library
            GameLibrary gamelibrary =
                GameLibrary.getInstanceSingleObjectGameLibrary();

            System.out.println("Welcome to " + gamelibrary.getName() + "\n");
            System.out.println("\t1. Manager \n"
                    + "\t2. Adherent \n"
                    + "\t3. Create an account \n"
                    + "\t4. EXIT \n");

            //get choose
            Scanner ch = new Scanner(System.in);
            String getCh;

            System.out.println("Choose an option (enter the number)");
            getCh = ch.nextLine();

            switch (getCh) {
                //Manager menu
                case "1":
                    UserFacadeImpl manMenu = new UserFacadeImpl();
                    manMenu.userFacadeImpl();
                    manMenu.managerMenu();

                    break;

                //Adherent menu
                case "2":

                    UserFacadeImpl adhMenu = new UserFacadeImpl();
                    adhMenu.userFacadeImpl();
                    adhMenu.adherentMenu();

                    break;

                //New account menu
                case "3":
                    gamelibrary.createAdherentAccount();
                    break;

                //exit
                case "4":
                    main = false;
                    break;
            }
        }
    }
}
