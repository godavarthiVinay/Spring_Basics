package SingletonPattern;

public class ThreadSafeMethodIntialization {

    private static   ThreadSafeMethodIntialization instance;

    private ThreadSafeMethodIntialization(){
        System.out.println("ThreadSafeMethodIntialization constructor");

    }
    public static synchronized ThreadSafeMethodIntialization getInstance(){
        if(instance ==null){
            instance=new ThreadSafeMethodIntialization();
            return instance;
        }else{
            return instance;
        }
    }
}
