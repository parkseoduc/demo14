package demo17;

import java.time.LocalDate;

public abstract class KhachHang {
    String maKhach;
    String hoTen;
    LocalDate ngayInHoaDon;
    int soLuong;

    public KhachHang(String maKhach, String hoTen, LocalDate ngayInHoaDon, int soLuong) {
        this.maKhach = maKhach;
        this.hoTen = hoTen;
        this.ngayInHoaDon = ngayInHoaDon;
        this.soLuong = soLuong;
    }
    public LocalDate getNgayInHoaDon() {
        return ngayInHoaDon;
    }

    public abstract double thanhTien();

    public abstract void hienThi();
}