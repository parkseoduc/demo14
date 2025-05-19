package demo2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.year = 2024;
        c1.color = "pink";
        c1.run();

        SportCar sc1 = new SportCar();
        sc1.brand = "Honda";
        sc1.year = 2022;
        sc1.color = "Red";
        sc1.nitro = "N2";
        sc1.run();


    }
}
