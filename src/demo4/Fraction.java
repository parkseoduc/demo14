package demo4;

public class Fraction extends MyNumber {
    int numerator;
    int denominator;

    @Override
    MyNumber add(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.denominator;
        total.numerator = this.numerator * o.denominator + this.denominator * o.numerator;
        return total;
    }

    @Override
    MyNumber subtract(MyNumber other) {
        Fraction effect = new Fraction();
        Fraction o = (Fraction) other;
        effect.denominator = this.denominator * o.denominator;
        effect.numerator = this.numerator * o.denominator - this.denominator * o.numerator;
        return effect;
    }

    @Override
    MyNumber multiply(MyNumber other) {
        Fraction nhan = new Fraction();
        Fraction o = (Fraction) other;
        nhan.denominator = this.denominator * o.denominator;
        nhan.numerator = this.numerator * o.denominator;
        return nhan;
    }

    @Override
    MyNumber divide(MyNumber other) {
        Fraction chia = new Fraction();
        Fraction o = (Fraction) other;
        chia.denominator = this.denominator * o.numerator;
        chia.numerator = this.numerator * o.denominator;
        return chia;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void simplify() {
    }
}


