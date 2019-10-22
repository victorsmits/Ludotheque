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
    
   protected long id;
   protected String name;
   protected String firstname;
    
   public Person(long id, String name, String firstname) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
    }
   
   public long getId() {
        return id;
    }

    public void setId(long newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setPrenom(String newFirstname) {
        this.firstname = newFirstname;
    }
}
