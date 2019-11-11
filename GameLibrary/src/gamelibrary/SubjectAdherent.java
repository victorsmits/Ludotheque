package gamelibrary;

public  abstract interface SubjectAdherent {

    //methods to register and unregister observers
    public void register(ObserverManager obj);
    public void unregister(ObserverManager obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(ObserverManager obj);
}
