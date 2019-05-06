package by.pvt.abstr;

/**
 *
 */
public interface Playable {

    void playMusic();

    default void playMusic(int money) {
        System.out.println("Play music for money");
    }
}
