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
public class UserFacadeImpl implements UserFacade{
    private Authentification auth = null;
    private Manager man = null;
    private Adherent adh = null;
    
    void userFacadeImpl(){
        auth = new Authentification();
    }
    
    @Override
    public void managerMenu(){
        man = auth.managerLogin();
        
        while (man != null){
            System.out.println ("--------------------------Manager menu----" +
                    "-----------------------------------\n");
            System.out.println ("Welcome Mr " + man.toString() + "\n");
            System.out.println ("\t1. Add new video game \n"
                    + "\t2. Add new board game \n"
                    + "\t3. Add new toy \n"
                    + "\t4. Get all borrow list \n"
                    + "\t5. Search a game \n"
                    + "\t6. back \n");
            //get choose
            Scanner ch1 = new Scanner(System.in);
            String getManCh;

            System.out.println("Enter your choice's number");

            getManCh = ch1.nextLine();
            this.applyAction(getManCh);
        }
    }
    
    /**
     *
     */
    @Override
    public void adherentMenu(){
        adh = auth.adherentLogin();
        
        while (adh != null){
            System.out.println("------------------------------Adherent menu----"
                + "---------------------------------------\n");
            System.out.println("Welcome Mr " + adh.getName() + "\n");
            System.out.println("\t1. Search a game \n"
                    + "\t2. Borrow game \n"
                    + "\t3. Get my borrow list \n"
                    + "\t4. back \n");
            //get choose
            Scanner ch1 = new Scanner(System.in);
            String getAdhCh;

            System.out.println("Enter your choose number");
            getAdhCh = ch1.nextLine();

            switch (getAdhCh) {
                case "1":
                    boolean search = true;
                    while (search) {
                        System.out.println("--------------------------Searching"
                            + " menu--------------------------\n");
                        System.out.println("\t1. Search a video game \n"
                                + "\t2. Search a board game \n"
                                + "\t3. Search a toy \n"
                                + "\t4. back \n");

                        Scanner searchCh = new Scanner(System.in);
                        String getsearchCh;

                        System.out.println("Enter your choose number");
                        getsearchCh = searchCh.nextLine();
                        search = this.applyAction(getsearchCh);
                    }
                    break;
                case "2":
                    boolean borrow = true;
                    while (borrow) {
                        System.out.println("--------------------------Borrowing"
                            + " menu--------------------------\n");
                        System.out.println("Before borrow a game, "
                            + "please search it to take his id");
                        System.out.println("\t1. Borrow a video game \n"
                                + "\t2. Borrow a board game \n"
                                + "\t3. Borrow a toy \n"
                                + "\t4. back \n");
                        //get choose
                        Scanner borrowCh = new Scanner(System.in);
                        String getborrowChCh;

                        System.out.println("Enter your choose number");
                        getborrowChCh = borrowCh.nextLine();
                        search = this.applyAction(getborrowChCh);
                    }
                    break;
                case "3":
                    adh.getYourBorrowList();
                    break;
                case "4":
                    adh = auth.adherentLogout();
                    break;
                default:
                    System.out.println("choose a good number please");
                    break;
            }

        }
    }

    private boolean applyAction(String borrow){
        switch (borrow) {
            case "1":
                //get choose
                Scanner searchVName = new Scanner(System.in);
                String getvname;

                System.out.println("Enter the video game's name");

                getvname = searchVName.nextLine();
                System.out.println(adh.searchGame("Video Game", getvname));
                break;
            case "2":
                //get choose
                Scanner searchBName = new Scanner(System.in);
                String getBName;

                System.out.println("Enter the board game's name");

                getBName = searchBName.nextLine();
                System.out.println(adh.searchGame("Board Game", getBName));
                break;
            case "3":
                //get choose
                Scanner searchTName = new Scanner(System.in);
                String getName;

                System.out.println("Enter the toy's name");

                getName = searchTName.nextLine();
                System.out.println(adh.searchGame("Toy", getName));
                break;
            case "4":
                return false;
            default:
                System.out.println("choose a good number please");
                break;
        }
        return true;
    }
}
