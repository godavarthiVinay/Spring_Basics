package SingletonPattern;

public class Main {

    public static void main(String[] agrs){

        EagerIntialization innstance=EagerIntialization.getInstance();
        System.out.println(innstance);

        EagerIntialization instance=EagerIntialization.getInstance();
        System.out.println(innstance);

        LazyIntialization lazyIntialization=LazyIntialization.getInstance();
        System.out.println(lazyIntialization);

        LazyIntialization lazyIntialization1=LazyIntialization.getInstance();
        System.out.println(lazyIntialization1);


    }
}
