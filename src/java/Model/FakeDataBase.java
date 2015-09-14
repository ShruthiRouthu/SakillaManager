package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FakeDataBase {
    
    //List<Actor> actorList = new ArrayList<>();
    

     //actorList.add(); // new Actor(1,"Hugh", "Jackman", new Date());
   
    private Actor[] actorList = { 
          
        new Actor(1,"Hugh", "Jackman", new Date()),
        new Actor(2,"Halle", "Berry", new Date()),
        new Actor(3,"Patrick", "Stewart", new Date()),
        new Actor(4,"Ian", "McKelly", new Date()),
        new Actor(5,"James", "Marsden", new Date()),
        new Actor(6,"Anna", "PAquin", new Date())
    
    };
  
    public Actor[] getAllActors(){
        return actorList;
    }
}
