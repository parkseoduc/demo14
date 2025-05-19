package demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    private ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(name)) {
                if (!p.phone.contains(phone)) {
                    p.phone.add(phone);
                }
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        PhoneList.removeIf(p -> p.name.equals(name));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(name)) {
                p.phone.clear(); // Xoá tất cả số cũ
                p.phone.add(newphone); // Thêm số mới
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(name)) {
                System.out.println("Tên: " + p.name + " - Số điện thoại: " + p.phone);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng tên: " + name);
    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber p1, PhoneNumber p2) {
                return p1.name.compareToIgnoreCase(p2.name);
            }
        });
    }

    // Phương thức in toàn bộ danh bạ (bổ sung để kiểm tra dễ hơn)
    public void printPhoneList() {
        for (PhoneNumber p : PhoneList) {
            System.out.println("Tên: " + p.name + " - Số điện thoại: " + p.phone);
        }
    }
}
