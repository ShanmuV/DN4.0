
class Logger{
    private static Logger instance;
    private static int countOfLoggers = 0;

    private Logger(){  
        System.out.println("A new Logger has been created!");
        countOfLoggers++;
        instance = this;
    }

    public static Logger GetInstance(){
        System.out.println("Count of Loggers: " + String.valueOf(countOfLoggers));
        if(instance == null) return new Logger();
        else return instance;
    }

    public void Login(String username){
        System.out.println(username + " Logged in!");
    }
}

public class SingletonTest{
    public static void main(String args[]){
        
        // Get an instance of the Logger
        Logger logger = Logger.GetInstance();

        // Check if the logger class works
        logger.Login("Shanmu");


        // Check the "Singleton Properties"
        Logger logger2 = Logger.GetInstance();
        Logger logger3 = Logger.GetInstance();

        if(logger == logger2 && logger == logger3){
            System.out.println("They all are the same reference to a single object. Singleton pattern is preserved.");
        }
        else{
            System.out.println("Error. Multiple Singletons were created!");
        }
    }
}