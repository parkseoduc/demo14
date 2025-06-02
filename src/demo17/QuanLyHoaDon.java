package demo17;

import java.util.*;
import java.time.LocalDate;

public class QuanLyHoaDon {
    private List<KhachHang> danhSach = new ArrayList<>();

    public void them(KhachHang kh) {
        danhSach.add(kh);
    }

    public void xuatDanhSach() {
        for (KhachHang kh : danhSach) {
            kh.hienThi();
        }
    }

    public void tinhTongSoLuongTheoLoai() {
        int tongVN = 0, tongNN = 0;
        for (KhachHang kh : danhSach) {
            if (kh instanceof KhachHangVietNam) {
                tongVN += kh.soLuong;
            } else {
                tongNN += kh.soLuong;
            }
        }
        System.out.println("Tổng số KW khách Việt Nam: " + tongVN);
        System.out.println("Tổng số KW khách Nước ngoài: " + tongNN);
    }

    public void tinhTrungBinhTienNN() {
        double tong = 0;
        int dem = 0;
        for (KhachHang kh : danhSach) {
            if (kh instanceof KhachHangNuocNgoai) {
                tong += kh.thanhTien();
                dem++;
            }
        }
        double tb = dem == 0 ? 0 : tong / dem;
        System.out.println("Trung bình thành tiền khách nước ngoài: " + tb);
    }

    public void xuatHoaDonThang1Nam2019() {
        for (KhachHang kh : danhSach) {
            if (kh.getNgayInHoaDon().getMonthValue() == 1 && kh.getNgayInHoaDon().getYear() == 2019) {
                kh.hienThi();
            }
        }
    }
}

