package Oops.Interface;

public class Main {
    public static void main(String[] args) {
        // Engine car= new Car();

        // car.acc();
        // car.start();
        // car.stop();

        // Media carMedia= new Car();
        // carMedia.stop();

        //creating problems

        NiceCar car= new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
         car.start();
        car.startMusic();

    }
}
