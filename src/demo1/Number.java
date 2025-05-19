package demo1;


public class Number {
    int n;

    void chanle(){
        if (n % 2 == 0) {
            System.out.println("Chẵn");
        } else {
            System.out.println("lẻ");
        }
    }

    void giaithua(){
        int giaithua=1;
        for(int i=1;i<=n;i++) {
            giaithua=giaithua*i;
        }
        System.out.println(n + "! = " + giaithua);
    }

    void songuyento(){
        int uocthu3= 1;
        for(int i=2;i<=n;i++) {
            if(n%i==0) {
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
