package demo3;

public class Main {
    public static void main(String[] args) {
        // Tạo nhân viên văn phòng
        NhanVienVanPhong nv1 = new NhanVienVanPhong();
        nv1.hoTen = "Nguyễn Văn A";
        nv1.ngaySinh = "01/01/1990";
        nv1.luongCoBan = 5000000;
        nv1.soNgayLamViec = 20;
        nv1.heSoPhuCap = 1.2;

        // Tạo nhân viên sản xuất
        NhanVienSanXuat nv2 = new NhanVienSanXuat();
        nv2.hoTen = "Trần Thị B";
        nv2.ngaySinh = "02/02/1992";
        nv2.luongCoBan = 4500000;
        nv2.soSanPham = 50;

        // Hiển thị thông tin
        System.out.println("== Nhân viên văn phòng ==");
        nv1.hienThiThongTin();

        System.out.println("\n== Nhân viên sản xuất ==");
        nv2.hienThiThongTin();
    }
}