import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //nhập thông tin sinh viên sau đó in ra thông tin vừa nhập
        String name;
        int age;
        //input thông tin sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.println(" vui long nhap ten sinh vien:");
        name=sc.nextLine();
        System.out.println("Vui long nhap tuoi sinh vien");
        age=sc.nextInt();

        //output thông tin sinh viên
        System.out.println("\n--- Thông tin sinh viên ---");
        System.out.println("Sinh vien:" + name +  "tuoi " + age);

    }
}
