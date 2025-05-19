package demo6;

public class Car extends Vehicle {
    int seatNumber;

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String toString() {
        return "[Ô tô] " + super.toString() + ", Số chỗ: " + seatNumber;
    }

    public int tinhPhiGuiXe(int soGio) {
        int phi = 10000 * soGio;
        if (seatNumber > 5) {
            phi += 3000 * soGio;
        }
        return phi;
    }
}
