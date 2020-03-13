package beans;

import java.util.Properties;
import java.util.Set;

public class DataBaseProperties {
    private Properties driver;

    public void setDriver(Properties driver) {
        this.driver = driver;
    }
    public void printDate(){
        Set keys=driver.keySet();
        for (Object key :keys){
            System.out.println(key+":"+driver.getProperty(key.toString()));
        }
    }


}
