package DZ81_24;

public class MobilePhone extends Device{


        public void sayName(){
            System.out.println("It's a MobilePhone");
        }

        public MobilePhone()  {

        memory = 6;
        price = 2300;
        LifeTime = 2;

        }

    @Override
    public int sayCharacteristics() {
        return 0;
    }
}

