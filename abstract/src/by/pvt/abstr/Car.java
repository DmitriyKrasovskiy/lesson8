package by.pvt.abstr;

import by.pvt.abstr.auto.Auto;

/**
 *
 */
public class Car extends Auto implements Playable {

    @Override
    public void playMusic() {
        System.out.printf("Auto is playing music");
    }

    public Car() {
        this(0);
        System.out.println("Construct Car");
    }

    public Car(int price) {
        super(price);
        System.out.println("Construct Car " + price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getPrice(int defaultPrice) {
        return price == 0 ? defaultPrice : price;
    }

    void readPrice() {
        int p = price;
    }
}