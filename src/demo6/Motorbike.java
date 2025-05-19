package demo6;

public class Motorbike extends Vehicle {
    int engineCapacity;

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String toString() {
        return "[Xe máy] " + super.toString() + ", Dung tích: " + engineCapacity + "cc";
    }

    public int tinhPhiGuiXe(int soGio) {
        int phi = 5000 * soGio;
        if (engineCapacity > 150) {
            phi += 2000 * soGio;
        }
        return phi;
    }
}