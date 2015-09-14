package Model;

import java.util.Date;

public class Actor {
    
    private int actorID;
    private String firstName;
    private String lastName;
    private Date lastUpdate;
    
    public Actor(){
        
    }
    
    public  Actor(int actorID,String firstName, String lastName)
    {
        setActorID(actorID );
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public  Actor(int actorID,String firstName, String lastName,Date lastUpdate)
    {
        setActorID(actorID );
        setFirstName(firstName);
        setLastName(lastName);
        setLastUpdate(lastUpdate);
    }

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
      // validatio  will done in db
          this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    
    
    
    
}
