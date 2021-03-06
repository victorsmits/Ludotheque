/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.util.ArrayList;

/**
 *
 * @author ablo1
 */
public class Person {
    
   private long id;
   private String name;
   private String firstName;
   private String username;
   private String password;

  /**
   *
   * @param name
   * @param firstName
   * @param username
   * @param password
   */
  public Person(String name, String firstName,
                String username, String password) {
      //ID is a random number between 1001 and 9000 (always 4 digit number)
      //WHY RANDOM ?? ID SHOULD GARANTEE ATOMICITY !!
      this.id =  (long) ((Math.random() * (9999 - 1000) + 1) + 1000);
      this.name = name;
      this.firstName = firstName;
      this.username = username;
      this.password = password;
  }

  /**
   *
   * @return
   */
  public String getUsername() {
      return username;
  }

  /**
   *
   * @param username
   */
  public void setUsername(String username) {
      this.username = username;
  }

  /**
   *
   * @return
   */
  public String getPassword() {
      return password;
  }

  /**
   *
   * @param password
   */
  public void setPassword(String password) {
      this.password = password;
  }

  /**
   *
   * @return
   */
  public long getId() {
      return id;
  }

  /**
   *
   * @return
   */
  public String getName() {
      return name;
  }

  /**
   *
   * @param newName
   */
  public void setName(String newName) {
      this.name = newName;
  }

  /**
   *
   * @return
   */
  public String getFirstName() {
      return firstName;
  }

  /**
   *
   * @param newFirstName
   */
  public void setFirstName(String newFirstName) {
      this.firstName = newFirstName;
  }

 @Override
  public String toString(){
      return getName() + " " + getFirstName();
  }


  /*--------------- Searching ---------------*/

  /**
   * @param name
   * @return String
   */


  public String searchGame(String type, String name) {
    int count = 0;
    ArrayList<Game> game;

    switch (type){
      case "Video Game":
        game = GameLibrary.getVideoGameList();
        break;

      case "Toy":
        game = GameLibrary.getToyList();
        break;

      case "Board Game":
        game = GameLibrary.getBoardGameList();
        break;

      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }

    if (game.isEmpty()) { // if database empty
      return "No video game in database";
    }

    for (Game selGame : game) {
      if (selGame.getName().equals(name)) {
        selGame.displayInfos();
        count++;
      }
    }

    if (count > 0) {
      return Integer.toString(count) + " result(s) found";
    } else {
      return "Nothing found";
    }
  }

  void displayInfos() {
      System.out.printf("Name : %s ; First name: %s ; Id : %s%n", getName(),
          getFirstName(), getId()
      );
  }

}
