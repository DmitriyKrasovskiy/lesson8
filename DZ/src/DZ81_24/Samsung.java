package DZ81_24;


public class Samsung extends MobilePhone implements Connect {
    int counter = 1;
    public Samsung(){
        //int price = 2300;
        //int LifeTime = 2;
        counter++;
    }
    public void sayName(){
        System.out.println("It's a Samsung S9 Mobile");
    }

    public int sayCharacteristics(){
       // System.out.println("It's a number " + counter + " Samsung Mobile");
        System.out.println("Memory=" + memory + "Price=" + price + "LifeTime=" +LifeTime);
        return 0;
    }
    boolean work;

   // @Override
  //  public void getName() {

   // }

    public void connect(){
        System.out.println("It's connect now.");
        work = true;
    }
    public void disconnect(){
        System.out.println("It's disconnect now");
        work = false;
    }
}