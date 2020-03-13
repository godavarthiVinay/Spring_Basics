package beans.DI;

public class DI_COnstructor {
//    DI_COnstructor(){
//
//    }
//
//
//    DI_COnstructor(String username){
//        this.username=username;
//    }
//
//    DI_COnstructor(int age){
//        this.age=age;
//    }

    DI_COnstructor(String username,int age){
     this.username=username;
     this.age=age;
    }


    private String username;
    private int age;

    public void printData(){
        System.out.println("name : "+username+" age : "+String.valueOf(age));
    }
}
