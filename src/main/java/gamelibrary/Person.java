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
public class Person {
    
   private long id;
   private String name;
   private String firstname;
   private String username;
   private String password;
   private int count;

  /**
   *
   * @param name
   * @param firstname
   * @param username
   * @param password
   */
  public Person(String name, String firstname, String username, String password) {
      this.id = this.id = (long) ((Math.random()*((9999-1000)+1))+1000);
      this.name = name;
      this.firstname = firstname;
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
  public String getfirstname() {
      return firstname;
  }

  /**
   *
   * @param newFirstname
   */
  public void setFirstname(String newFirstname) {
      this.firstname = newFirstname;
  }

 @Override
  public String toString(){
      return getName() + " " + getfirstname();
  }


  /*--------------- Searching ---------------*/

  /**
   * @param name
   * @return String
   */

  public String searchVideoGame(String name){
    this.count = 0;

    if(GameLibrary.getVideoGameList().isEmpty()){ // if database empty
        return "No video game in database";
    }

    for (int i = 0; i < GameLibrary.getVideoGameList().size(); i++) {
      VideoGame videoGame = GameLibrary.getVideoGameList().get(i);
      this.displayGameInfo(videoGame, name);
    }

    return displayGamesFound();
  }

  /**
   *
   * @param name
   * @return
   */
  public String searchBoardGame(String name){
    this.count = 0;

    if(GameLibrary.getBoardGameList().isEmpty()){ // if database empty
        return "No video game in database";
    }

    for (int i = 0; i < GameLibrary.getBoardGameList().size(); i++) {
      BoardGame boardGame = GameLibrary.getBoardGameList().get(i);
      this.displayGameInfo(boardGame, name);
    }

    return displayGamesFound();
  }

  /**
   *
   * @param name
   * @return
   */
  public String searchToy(String name){
    this.count = 0;

    if(GameLibrary.getToyList().isEmpty()){ // if database empty
        return "No video game in database";
    }

    for (int i = 0; i < GameLibrary.getToyList().size(); i++) {
      Toy toyGame = GameLibrary.getToyList().get(i);
      this.displayGameInfo(toyGame,name);
    }

    return displayGamesFound();
  }

  void displayInfos(){
      System.out.printf("Name : %s ; Firstname: %s ; Id : %s%n",getName(),
                      getfirstname(),
                      getId()
      );
  }

  private void displayGameInfo(Game game, String gameName){
    if(game.getName().equals(gameName) ){
      game.displayInfos();
      this.count++;
    }
  }

  private String displayGamesFound(){
    if(count > 0){
      return Integer.toString(count) + " result(s) found";
    }else{
      return "No found";
    }
  }
}
