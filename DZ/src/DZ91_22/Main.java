package DZ91_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Sec: ");
        int sec = in.nextInt();

        TimeInterval t1 = new TimeInterval(sec);
        TimeInterval t2 = new TimeInterval(2, 15, 20);

        System.out.println(t1.currentTime());
        System.out.println(t2.currentTime());
    }
}
