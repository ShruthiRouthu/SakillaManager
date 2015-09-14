package Model;

public class ActorDAO implements IActorDAO{
    
    private FakeDataBase db = new FakeDataBase();
    
    @Override
    public Actor[] getAllActors() {
        return   db.getAllActors();  
    }
    
}
