package demo6;
    public class Truck extends Vehicle {
        double loadCapacity;

        public void setLoadCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public String toString() {
            return "[Xe tải] " + super.toString() + ", Trọng tải: " + loadCapacity + " tấn";
        }

        public int tinhPhiGuiXe(int soGio) {
            int phi = 15000 * soGio;
            if (loadCapacity > 5) {
                phi += 5000 * soGio;
            }
            return phi;
        }
    }