/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ablo1
 */
public class Adherent extends Person implements SubjectAdherent {
    
    private String subscriptionType;
    private LocalDate subscriptionBegin;
    private LocalDate subscriptionEnd;
    
    public Adherent(String name, String firstname){
        super(name, firstname);
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

    public void borrowToy(){
    Toy toy = new Toy("materialToy", "nameToy", "manufacturerToy");
    }


    private List<ObserverManager> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();


    public Adherent() { this.observers=new ArrayList<ObserverManager>(); }


    public void register(ObserverManager obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) observers.add(obj);
        }
    }


    public void unregister(ObserverManager obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }


    public void notifyObservers() {
        List<ObserverManager> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<ObserverManager>(this.observers);
            this.changed=false;
        }
        for (ObserverManager obj : observersLocal) {
            obj.update();
        }

    }

    public Object getUpdate(ObserverManager obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
