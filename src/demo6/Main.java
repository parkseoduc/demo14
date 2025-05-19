package demo6;

public class Main {
    public static void main(String[] args) {
        Vehicle[] ds = new Vehicle[3];

        // Tạo xe máy
        Motorbike xeMay = new Motorbike();
        xeMay.setLicensePlate("99A-12345");
        xeMay.setBrand("Vison");
        xeMay.setEngineCapacity(160);
        ds[0] = xeMay;

        // Tạo ô tô
        Car oTo = new Car();
        oTo.setLicensePlate("999A-12344");
        oTo.setBrand("BMW");
        oTo.setSeatNumber(5);
        ds[1] = oTo;

        // Tạo xe tải
        Truck xeTai = new Truck();
        xeTai.setLicensePlate("99A-99999");
        xeTai.setBrand("MECJ");
        xeTai.setLoadCapacity(9);
        ds[2] = xeTai;

        int soGio = 3; // Số giờ gửi

        for (Vehicle v : ds) {
            System.out.println(v.toString());
            System.out.println("Phí gửi " + soGio + " giờ: " + v.tinhPhiGuiXe(soGio) + " đồng");
            System.out.println("--------------------------");
        }
    }
}