package demo10;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> phone;
    public PhoneNumber(String name, String phoneNumber) {
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phoneNumber);
    }
}
