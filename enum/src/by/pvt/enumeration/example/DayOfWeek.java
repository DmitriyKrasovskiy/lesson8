package by.pvt.enumeration.example;

/**
 *
 */
public enum DayOfWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int orderInBy;

    DayOfWeek(int orderInBy) {
        this.orderInBy = orderInBy;
    }

    public int getOrderInBy() {
        return orderInBy;
    }
}
