package SingletonPattern;

public class LazyIntialization {
   private static   LazyIntialization instance;

   private LazyIntialization(){
       System.out.println("LazyIntilaizaton constructor");

   }
   public static LazyIntialization getInstance(){
       if(instance ==null){
           instance=new LazyIntialization();
           return instance;
       }else{
           return instance;
       }
   }

}
