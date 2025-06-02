package demo17;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang {
        String doiTuong;
        int dinhMuc=100;

    public KhachHangVietNam(String maKhach, String hoTen, LocalDate ngayInHoaDon, int soLuong, String doiTuong) {
        super(maKhach, hoTen, ngayInHoaDon, soLuong);
    }
    private int donGia(int soKW) {
        if (soKW < 50) return 1000;
        else if (soKW <= 100) return 1200;
        else if (soKW <= 200) return 1500;
        else return 2000;
    }

    @Override
    public double thanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia(soLuong);
        } else {
            return dinhMuc * donGia(dinhMuc) + (soLuong - dinhMuc) * 2000;
        }
    }

    @Override
    public void hienThi() {
        System.out.println("[VN] " + maKhach + " | " + hoTen + " | " + ngayInHoaDon + " | " + doiTuong +
                " | " + soLuong + "KW | Thành tiền: " + thanhTien());
    }
}
