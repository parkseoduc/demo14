package demo17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        QuanLyHoaDon ql = new QuanLyHoaDon();

        ql.them(new KhachHangVietNam("KH001", "Nguyen Van A", LocalDate.of(2019, 1, 15), 120, "Sinh hoạt"));
        ql.them(new KhachHangVietNam("KH002", "Tran Thi B", LocalDate.of(2019, 2, 10), 80, "Kinh doanh"));
        ql.them(new KhachHangNuocNgoai("KH003", "John Smith", LocalDate.of(2019, 1, 20), 200, "Mỹ"));
        ql.them(new KhachHangNuocNgoai("KH004", "Jane Doe", LocalDate.of(2020, 3, 12), 150, "Anh"));

        System.out.println("=== Danh sách hóa đơn ===");
        ql.xuatDanhSach();

        System.out.println("\n=== Tổng số lượng tiêu thụ theo loại ===");
        ql.tinhTongSoLuongTheoLoai();

        System.out.println("\n=== Trung bình thành tiền khách nước ngoài ===");
        ql.tinhTrungBinhTienNN();

        System.out.println("\n=== Hóa đơn tháng 01 năm 2019 ===");
        ql.xuatHoaDonThang1Nam2019();
    }
}
