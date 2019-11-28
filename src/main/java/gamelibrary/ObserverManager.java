package gamelibrary;

/**
 *
 */
public interface ObserverManager {


    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(SubjectAdherent subjectAdherent);
}
