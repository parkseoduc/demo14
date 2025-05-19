package demo14;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Child {
    private String fullName;
    private LocalDate dateOfBirth;

    public Child(String fullName, LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Trả về ngày & tháng sinh trong năm hiện tại hoặc năm sau nếu đã qua
    public LocalDate getNextBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(today.getYear(),
                dateOfBirth.getMonth(),
                dateOfBirth.getDayOfMonth());

        if (thisYearBirthday.isBefore(today) || thisYearBirthday.isEqual(today)) {
            // Nếu sinh nhật năm nay đã qua hoặc là hôm nay, trả về sinh nhật năm sau
            return thisYearBirthday.plusYears(1);
        }
        return thisYearBirthday;
    }
}

