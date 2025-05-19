package demo1;

public class Student {
    String name; // gọi là khai báo attribute
    int age;
    String telephone;
    String girlFriend;

    // hàm khởi tạo (constructor), giống tên lớp nhưng không có dữ liệu trả về (public + tên hàm)
    public Student(String n1, int a1, String t1) {
        this.name = n1;
        this.age = a1;
        this.telephone = t1;
        System.out.println("Student Constructor");
    }

    //method // thuật ngữ
    void eat(){
        System.out.println("Student eating...");
    }

    void run(){
        System.out.println("Running...");
    }

    void learn(){
        System.out.println("Learning...");
    }

}
