package demo2;

public class Car {
    String brand;
    int year;
    String color;

    void run(){
        System.out.println(" Car is running: 40km/h");
    }

    void run(int speed){
        System.out.println(" Car is running: " +speed+"km/h");
    }

    void speedUp(){
        System.out.println(" Car speeds up");
    }
}
