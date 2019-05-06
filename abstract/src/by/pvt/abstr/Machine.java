package by.pvt.abstr;

/**
 *
 */
public abstract class Machine {

    public void work() {
        System.out.println("Machine is working");
    }

    public abstract void drive();

    public Machine() {
        super();
        System.out.println("Construct Machine");
    }


}