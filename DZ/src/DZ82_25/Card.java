package DZ82_25;

abstract class Card {

            String name;

        public Card(String name) {
            this.name = name;
        }

    public Card() {

    }

    @Override
        public String toString() {
            return name;
        }
    }




