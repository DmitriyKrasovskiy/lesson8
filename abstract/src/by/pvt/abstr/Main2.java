package by.pvt.abstr;

/**
 *
 */
public class Main2 {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.getPrice());
        System.out.println(car1.getPrice(1999));

        Car car2 = new Car(2999);
        System.out.println(car2.getPrice());
        System.out.println(car2.getPrice(3999));

        //System.out.println(car1.price);

    }

}