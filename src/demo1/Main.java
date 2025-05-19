package demo1;

public class Main {
    //program
    public static void main(String[] args) {
        Student s1 = new Student("John",22,"555-555-5555"); // tạo ra 1 object từ class Student, s1 là 1 object
//        s1.name="John"; // s1 là
//        s1.age=22;
//        s1.telephone="555-555-5555";

        Student s2 = new Student("ohsehun",23, "555-555-5554");
//        s2.name="ohsehun";
//        s2.age=23;
//        s2.telephone="555-555-5554";
//     //   s2.girlFriend = " Trình hà lân ";

        s1.run();
        s2.run();

        s1.eat();
        s2.learn();

        Number a = new Number();
        a.n = 199;
        a.chanle();

        Tamgiac a1 = new Tamgiac();
        a1.canh1 = 10;
        a1.canh2 = 20;
        a1.canh3 = 30;
        int cccv = a1.chuvi();

    }
}
