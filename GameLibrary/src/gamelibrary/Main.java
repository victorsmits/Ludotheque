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

            System.out.println("Enter your choose number"); // Enter username and press Enter
            getCh = ch.nextLine();

            Authentification auth= new Authentification();
            
            //Manager menu
            if(getCh.equals("1")){

                Manager man = auth.managerLogin();
                
                while(man != null){
                    System.out.println("------------------------------Manager menu-------------------------------------------\n" );
                    System.out.println("Welcome Mr " + man.toString() + "\n" );
                    System.out.println("\t1. Add new video game \n"
                            + "\t2. Add new board game \n"
                            + "\t3. Add new toy \n"
                            + "\t4. Get all borrow list \n"
                            + "\t5. Search a game \n"
                            + "\t6. back \n");
                    //get choose
                    Scanner ch1 = new Scanner(System.in);
                    String getManCh;

                    System.out.println("Enter your choose number"); // Enter username and press Enter
                    getManCh = ch1.nextLine();
                    if(getManCh.equals("1")){
                        GameLibrary.getManager().addVideoGame();
                    }
                    else if(getManCh.equals("2")){
                        GameLibrary.getManager().addBoardGame();
                    }
                    else if(getManCh.equals("3")){
                        GameLibrary.getManager().addToy();
                    }
                    else if(getManCh.equals("4")){
                        GameLibrary.getManager().getBorrowList();
                    }
                    else if(getManCh.equals("5")){
                        Boolean search = true;
                        while(search){
                            System.out.println("------------------------------Searching menu-------------------------------------------\n" );
                            System.out.println("\t1. Search a video game \n"
                                                + "\t2. Search a board game \n"
                                                + "\t3. Search a toy \n"
                                                + "\t4. back \n");
                            //get choose
                            Scanner searchCh = new Scanner(System.in);
                            String getsearchCh;

                            System.out.println("Enter your choose number"); // Enter username and press Enter
                            getsearchCh = searchCh.nextLine();
                            
                            if(getsearchCh.equals("1")){
                                //get choose
                                Scanner searchVName = new Scanner(System.in);
                                String getvname;

                                System.out.println("Enter the video game's name"); // Enter username and press Enter
                                getvname = searchVName.nextLine();
                                System.out.println(man.searchVideoGame(getvname));
                            }
                            else if(getsearchCh.equals("2")){
                                //get choose
                                Scanner searchBName = new Scanner(System.in);
                                String getbname;

                                System.out.println("Enter the board game's name"); // Enter username and press Enter
                                getbname = searchBName.nextLine();
                                System.out.println(man.searchBoardGame(getbname));
                            }
                            else if(getsearchCh.equals("3")){
                                //get choose
                                Scanner searchTName = new Scanner(System.in);
                                String gettname;

                                System.out.println("Enter the toy's name"); // Enter username and press Enter
                                gettname = searchTName.nextLine();
                                System.out.println(man.searchToy(gettname));
                            }
                            else if(getsearchCh.equals("4")){
                                search = false;
                            }
                            else{
                                System.out.println("choose a good number please");
                            }

                        }
                    }
                    else if(getManCh.equals("6")){
                        man = auth.managerLogout();
                    }
                    else{
                        System.out.println("choose a good number please");
                    }
                }
            }
            
            //Adherent menu
            else if(getCh.equals("2")){

                Adherent adh = auth.adherentLogin();
                
                while(adh != null){
                    System.out.println("------------------------------Adherent menu-------------------------------------------\n" );
                    System.out.println("Welcome Mr " + adh.getName() + "\n" );
                    System.out.println("\t1. Search a game \n"
                            + "\t2. Borrow game \n"
                            + "\t3. Get my borrow list \n"
                            + "\t4. back \n");
                    //get choose
                    Scanner ch1 = new Scanner(System.in);
                    String getAdhCh;

                    System.out.println("Enter your choose number"); // Enter username and press Enter
                    getAdhCh = ch1.nextLine();
                    
                    if(getAdhCh.equals("1")){
                        Boolean search = true;
                        while(search){
                            System.out.println("------------------------------Searching menu-------------------------------------------\n" );
                            System.out.println("\t1. Search a video game \n"
                                                + "\t2. Search a board game \n"
                                                + "\t3. Search a toy \n"
                                                + "\t4. back \n");
                            //get choose
                            Scanner searchCh = new Scanner(System.in);
                            String getsearchCh;

                            System.out.println("Enter your choose number"); // Enter username and press Enter
                            getsearchCh = searchCh.nextLine();
                            
                            if(getsearchCh.equals("1")){
                                //get choose
                                Scanner searchVName = new Scanner(System.in);
                                String getvname;

                                System.out.println("Enter the video game's name"); // Enter username and press Enter
                                getvname = searchVName.nextLine();
                                System.out.println(adh.searchVideoGame(getvname));
                            }
                            else if(getsearchCh.equals("2")){
                                //get choose
                                Scanner searchBName = new Scanner(System.in);
                                String getbname;

                                System.out.println("Enter the board game's name"); // Enter username and press Enter
                                getbname = searchBName.nextLine();
                                System.out.println(adh.searchBoardGame(getbname));
                            }
                            else if(getsearchCh.equals("3")){
                                //get choose
                                Scanner searchTName = new Scanner(System.in);
                                String gettname;

                                System.out.println("Enter the toy's name"); // Enter username and press Enter
                                gettname = searchTName.nextLine();
                                System.out.println(adh.searchToy(gettname));
                            }
                            else if(getsearchCh.equals("4")){
                                search = false;
                            }
                            else{
                                System.out.println("choose a good number please");
                            }

                        }
                    }
                    else if(getAdhCh.equals("2")){
                        Boolean borrow = true;
                        while(borrow){
                            System.out.println("------------------------------Borrowing menu-------------------------------------------\n" );
                            System.out.println("Before borrow a game, please search it to take his id" );
                            System.out.println("\t1. Borrow a video game \n"
                                                + "\t2. Borrow a board game \n"
                                                + "\t3. Borrow a toy \n"
                                                + "\t4. back \n");
                            //get choose
                            Scanner borrowCh = new Scanner(System.in);
                            String getborrowChCh;

                            System.out.println("Enter your choose number"); // Enter username and press Enter
                            getborrowChCh = borrowCh.nextLine();
                            
                            if(getborrowChCh.equals("1")){
                                 //get choose
                                Scanner borrowVId = new Scanner(System.in);
                                long getvid;

                                System.out.println("Enter the video game's id"); // Enter username and press Enter
                                getvid = Long.parseLong(borrowVId.nextLine());
                                System.out.println(adh.borrowVideoGame(getvid));
                            }
                            else if(getborrowChCh.equals("2")){
                                //get choose
                                Scanner borrowBId = new Scanner(System.in);
                                long getbid;

                                System.out.println("Enter the board game's id"); // Enter username and press Enter
                                getbid = Long.parseLong(borrowBId.nextLine());
                                System.out.println(adh.borrowBoardGame(getbid));
                            }
                            else if(getborrowChCh.equals("3")){
                                //get choose
                                Scanner borrowTId = new Scanner(System.in);
                                long gettid;

                                System.out.println("Enter the toy's id"); // Enter username and press Enter
                                gettid = Long.parseLong(borrowTId.nextLine());
                                System.out.println(adh.borrowToy(gettid));
                            }
                            else if(getborrowChCh.equals("4")){
                                borrow = false;
                            }
                            else{
                                System.out.println("Please, go search this game to check his id");
                            }

                        }
                    }
                    else if(getAdhCh.equals("3")){
                        adh.getYourBorrowList();
                    }
                    else if(getAdhCh.equals("4")){
                        adh = auth.adherentLogout();
                    }
                    else{
                        System.out.println("choose a good number please");
                    }
    
                }
            }
            
            //Manager tools
            else if(getCh.equals("3")){
                gamelibrary.createAdherentAccount();
            }

            else if(getCh.equals("4")){
                main = false;
            }
        }
    }
}
