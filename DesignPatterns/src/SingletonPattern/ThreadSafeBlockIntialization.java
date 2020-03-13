package SingletonPattern;

public class ThreadSafeBlockIntialization {

    private static ThreadSafeBlockIntialization instance;

    private ThreadSafeBlockIntialization(){
        System.out.println("ThreadSafeBlockIntialization constructor");

    }
    public static synchronized ThreadSafeBlockIntialization getInstance() {
        if (instance == null) {

            synchronized (ThreadSafeBlockIntialization.class) {
                if (instance == null) {
                    instance = new ThreadSafeBlockIntialization();

                }

            }

        }
        return instance;
    }
}
