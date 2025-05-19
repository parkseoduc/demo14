package demo3;
class NhanVienVanPhong extends NhanVien {
    int soNgayLamViec;
    double heSoPhuCap;

    // Ghi đè phương thức tính lương
    @Override
    double tinhLuong() {
        return luongCoBan + soNgayLamViec * 100000 + heSoPhuCap * 500000;
    }

    // Ghi đè phương thức hiển thị thông tin
    @Override
    void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
        System.out.println("Hệ số phụ cấp: " + heSoPhuCap);
        System.out.println("Lương: " + tinhLuong());
    }
}
