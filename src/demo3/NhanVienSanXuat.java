package demo3;
class NhanVienSanXuat extends NhanVien {
    int soSanPham;

    // Ghi đè phương thức tính lương
    @Override
    double tinhLuong() {
        return luongCoBan + soSanPham * 50000;
    }

    // Ghi đè phương thức hiển thị thông tin
    @Override
    void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số sản phẩm: " + soSanPham);
        System.out.println("Lương: " + tinhLuong());
    }
}