package demo4;

public class IntegerNumber extends MyNumber {
    int value;

    @Override
    MyNumber add(MyNumber other) {
        IntegerNumber total = new IntegerNumber();  // tạo ra 1 object để tính tổng
        IntegerNumber o = (IntegerNumber) other;// ép kiểu tham số về dạng số nguyên
        total.value = value + o.value; // tính tổng
        return total;// trả về kết quả
    }

    @Override
    MyNumber subtract(MyNumber other) {
        IntegerNumber effect = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        effect.value = value - o.value;
        return effect;
    }

    @Override
    MyNumber multiply(MyNumber other) {
        IntegerNumber nhan = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        nhan.value = value * o.value;
        return nhan;
    }

    @Override
    MyNumber divide(MyNumber other) {
        IntegerNumber chia = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        chia.value = value / o.value;
        return chia;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
