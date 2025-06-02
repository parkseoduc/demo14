package demo17;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang {
    String quocTich;
    int donGia=2000;

    public KhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngayInHoaDon, int soLuong, String quocTich) {
        super(maKH, hoTen, ngayInHoaDon, soLuong);
        this.quocTich = quocTich;

    }

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void hienThi() {
        System.out.println("[NN] " + maKhach + " | " + hoTen + " | " + ngayInHoaDon + " | " + quocTich +
                " | " + soLuong + "KW | Thành tiền: " + thanhTien());
    }
}
