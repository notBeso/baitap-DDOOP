package digidinos.DAO;

public class singletonPattern {
    private static volatile singletonPattern instance;
    
    private singletonPattern() {
        // private constructor
    }
    
    public static singletonPattern getInstance() {
        if (instance == null) { // First check (no synchronization)
            synchronized (singletonPattern.class) {
                if (instance == null) { // Second check (with synchronization)
                    instance = new singletonPattern();
                }
            }
        }
        return instance;
    }
    public void doSomething() {
        System.out.println("Singleton using Enum");
    }
}
