/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.time.LocalDate;


/**
 *
 * @author ablo1
 */
public class Adherent extends Person {
    
    private String subscriptionType;
    private LocalDate subscriptionBegin;
    private LocalDate subscriptionEnd;
    
    public Adherent(long id, String name, String firstname, String subscription){
        super(id, name, firstname);
        this.subscriptionType = subscription;
    }
    
    public LocalDate getSubscriptionBegin() {
        return subscriptionBegin;
    }

    public void setSubscriptionBegin(LocalDate newSubscription) {
        this.subscriptionBegin = newSubscription;
    }

    public String getsubscriptionType() {
        return subscriptionType;
    }

    public void setsubscriptionType(String newSubscriptionType) {
        this.subscriptionType = newSubscriptionType;
    }

    public LocalDate getsubscriptionEnd() {
        return subscriptionEnd;
    }

    public void setsubscriptionEnd(LocalDate newSubscriptionEnd) {
        this.subscriptionEnd = newSubscriptionEnd;
    }
    
    
}
