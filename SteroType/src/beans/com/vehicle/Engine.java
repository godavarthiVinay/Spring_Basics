package beans.com.vehicle;

import org.springframework.stereotype.Component;


public class Engine {
    private String modelyear;

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }

    public String getModelyear() {
        return modelyear;
    }
}
