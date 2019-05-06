package DZ91_22;

public class TimeInterval {

    private int hour;
    private int min;
    private int sec;

    public TimeInterval(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public TimeInterval(int fullSec) {
        this.hour = fullSec / 3600;
        this.min = (fullSec - (hour * 3600)) / 60;
        this.sec = fullSec - (hour * 3600 + min * 60);
    }

    public int currentTime() {
        System.out.println(hour + " часов " + min + " минут " + sec + " секунд");
        return 0;
    }
}
