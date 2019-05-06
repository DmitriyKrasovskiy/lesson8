package by.pvt.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Car car1 = new Car("BMW");
        car1.setManufactureDate(new Date());
        car1.setModelName("X6");
        System.out.println(car1);

        car1.setModelName("325i");
        String date = "10.04.2005";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date newDate = simpleDateFormat.parse(date);
        car1.setManufactureDate(new SimpleDateFormat("dd.MM.yyyy").parse("01.04.2005"));
        System.out.println(car1);
    }

}