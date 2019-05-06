package by.pvt.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Car {

    /*private String brandName;
    private String modelName;
    private Date manufactureDate;*/

    Map properties = new HashMap();


    public Car(String brandName) {
        //this.brandName = brandName;
        properties.put("brandName", brandName);
    }

    public String getBrandName() {
        //return brandName;
        return (String)properties.get("brandName");
    }

    public String getModelName() {
        //return modelName;
        return (String)properties.get("model");
    }

    public Date getManufactureDate() {
        //return manufactureDate;
        return (Date)properties.get("date");
    }

    public void setModelName(String modelName) {
        //this.modelName = modelName;
        properties.put("model", modelName);
    }

    public void setManufactureDate(Date manufactureDate) {
        //this.manufactureDate = manufactureDate;
        properties.put("date", manufactureDate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + getBrandName() + '\'' +
                ", modelName='" + getModelName() + '\'' +
                ", manufactureDate=" + getManufactureDate() +
                '}';
    }
}
