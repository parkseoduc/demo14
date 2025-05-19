package demo3;


public class NhanVien {
    String hoTen;
    String ngaySinh;
    double luongCoBan;

    // Hàm tính lương cơ bản
    double tinhLuong() {
        return luongCoBan;
    }

    // Hàm hiển thị thông tin
    void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}