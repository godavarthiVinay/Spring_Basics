package beans.DI;

public class DI_Setter {

    DI_Setter(){
        System.out.println("Test_Setter Obj is created ");
    }

    private String username;
    private int age;
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printData(){
        System.out.println("name : "+username+" age : "+String.valueOf(age));
    }

}
