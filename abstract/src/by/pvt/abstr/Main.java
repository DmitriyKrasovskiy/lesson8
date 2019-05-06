package by.pvt.abstr;

import by.pvt.abstr.auto.Auto;

/**
 *
 */
public class Main {
    public static <ArrayList> void main(String[] args) {
        Machine machine = new Auto();
        machine.drive();
        machine.work();

        Auto auto = new Auto();
        auto.drive();
        auto.work();
        //((Car)auto).playMusic();

        Car car1 = new Car();
        car1.playMusic();
        car1.drive();
        car1.work();

        Auto auto2 = new Car();
        auto2.work();
        auto2.drive();
        ((Car) auto2).playMusic(); ///No such method!

        Auto[] autos = {
                new Car(), new Auto()
        };

        Machine machine1 = new Auto();
        ((Machine) machine1).work();

        CdPlayer cdPlayer = new CdPlayer();
        cdPlayer.playMusic();
        cdPlayer.playMusic(50);

        Playable playable = new CdPlayer();
        playable.playMusic();
        playable.playMusic(100);

        Playable playable1 = new Car();
        playable1.playMusic();
        playable1.playMusic(200);

    }

}