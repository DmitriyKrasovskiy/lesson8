package by.pvt.annot;

import java.util.Date;

/**
 *
 */
public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Date date = new Date(2019 - 1900, 3, 29);
        System.out.println(date);

        MyClass myClass = new MyClass();
        String s = null;
        s = "test";
        myClass.doSomething(s);
    }

}