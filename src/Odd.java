import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        // viết chương trình nhập vào 1 số nguyên và kiểm tra là số chẵn hay số lẻ
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Chẵn");
        } else {
            System.out.println("lẻ");
        }

        // tính giai thừa của 1 số nhập vào
        int giaithua=1;
        for(int i=1;i<=number;i++) {
            giaithua=giaithua*i;
        }
        System.out.println(number + "! = " + giaithua);

        // nhập vào 1 số nguyên n và kiểm tra xem nó có phải số nguyên tố không
        int uocthu3= 1;
        for(int i=2;i<=number;i++) {
            if(number%i==0) {
                uocthu3=i;
            }
        }
        if(uocthu3 !=1) {
            System.out.println(" đây không phải số nguyên tố");
        }else {
            System.out.println(" đây là số nguyên tố ");
        }
    }
}
