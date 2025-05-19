package demo14;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        children.add(new Child("Nguyễn Văn A", LocalDate.of(2015, 6, 15)));
        children.add(new Child("Trần Thị B", LocalDate.of(2016, 5, 30)));
        children.add(new Child("Lê Văn C", LocalDate.of(2014, 12, 1)));
        children.add(new Child("Phạm Thị D", LocalDate.of(2013, 11, 2)));
        children.add(new Child("Hoàng Văn E", LocalDate.of(2012, 1, 10)));

        LocalDate today = LocalDate.now();
        Child nearestChild = null;
        long minDays = Long.MAX_VALUE;

        for (Child child : children) {
            LocalDate nextBirthday = child.getNextBirthday();
            long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

            if (daysUntilBirthday < minDays) {
                minDays = daysUntilBirthday;
                nearestChild = child;
            }
        }

        if (nearestChild != null) {
            LocalDate nextBirthday = nearestChild.getNextBirthday();
            System.out.println("Người có sinh nhật gần nhất là:");
            System.out.println("Họ tên: " + nearestChild.getFullName());
            System.out.println("Sinh nhật: " + nextBirthday.getDayOfMonth() + "/" + nextBirthday.getMonthValue());
        } else {
            System.out.println("Không tìm thấy dữ liệu.");
        }
    }
}
