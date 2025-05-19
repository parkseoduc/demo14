package demo6;

public class Vehicle {
    String licensePlate; // biển số xe
    String brand; // hãng xe

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Biển số: " + licensePlate + ", Hãng: " + brand;
    }

    public int tinhPhiGuiXe(int soGio) {
        return 0;
    }
}