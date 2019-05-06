package DZ81_24;


    public class Main {
        public static void main(String[] args) {
            MobilePhone zero = new MobilePhone();
            MobilePhone first = new Samsung();
            Samsung inter = new Samsung();
            zero.sayName();
            first.sayName();


            inter.sayCharacteristics();
            inter.connect();
            inter.sayName();
            inter.disconnect();
            }

    }
