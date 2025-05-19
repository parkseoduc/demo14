package demo10;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.insertPhone("An", "0123456789");
        myPhoneBook.insertPhone("Bình", "0987654321");
        myPhoneBook.insertPhone("An", "0987000000"); // Thêm số mới cho An

        myPhoneBook.searchPhone("An");

        myPhoneBook.updatePhone("Bình", "0111222333");

        myPhoneBook.removePhone("Không Tồn Tại"); // Không làm gì cả
        myPhoneBook.removePhone("An"); // Xoá An

        myPhoneBook.insertPhone("Dũng", "0123123123");
        myPhoneBook.insertPhone("Cường", "0456456456");

        myPhoneBook.sort();

        myPhoneBook.printPhoneList();
    }
}

