
// normal
public class Database {

    private static Database instance;
    private Database(){

    }

    public synchronized static Database getInstance(){
        if (instance==null){
            return new Database();
        }

        return instance;
    }
}