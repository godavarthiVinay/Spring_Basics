package SingletonPattern;

public class EagerIntialization {
    private static EagerIntialization instance=new EagerIntialization();
    private EagerIntialization(){
        System.out.println("EagerIntialization constructor");
    }
    public static EagerIntialization getInstance(){
        return  instance;
    }
}
