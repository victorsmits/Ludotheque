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
public class Manager extends Person {
    
    private String login;
    private String password;
    
    public Manager(String login, String password, long id, String name, String firstname) {
        super(id, name, firstname);
        this.login = login;
        this.password = password;
    }
    
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
