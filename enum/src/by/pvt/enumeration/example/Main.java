package by.pvt.enumeration.example;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek + " " + dayOfWeek.ordinal()
                + " " + dayOfWeek.getOrderInBy());

        System.out.println(DayOfWeek.TUESDAY + " "
                + DayOfWeek.TUESDAY.ordinal() + " "
                + DayOfWeek.TUESDAY.getOrderInBy());

        System.out.println(DayOfWeek.FRIDAY + " "
                + DayOfWeek.FRIDAY.ordinal() + " "
                + DayOfWeek.FRIDAY.getOrderInBy());
    }
}
