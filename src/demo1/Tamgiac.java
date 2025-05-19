package demo1;

public class Tamgiac {
    int canh1;
    int canh2;
    int canh3;

    int chuvi(){
     int cv = this.canh1 + this.canh2 + this.canh3;
//     System.out.println("chu vi" + cv);
        return cv;
    }

    double dientichtamgia(){
        double p = chuvi() / 2.0;
        double s = Math.sqrt(p* (p - this.canh1) * (p - this.canh2) * (p - this.canh3));
        return s;

    }
}
