package Model;

public class Service {
    
    private IActorDAO actorDao;

    public Service(IActorDAO actorDao) {
        this.actorDao = actorDao;
    }
    
    public final Actor[] getAllActors(){
        return actorDao.getAllActors();
    }

    public IActorDAO getActorDao() {
        return actorDao;
    }

    public void setActorDao(IActorDAO actorDao) {
        this.actorDao = actorDao;
    }  
  
}
