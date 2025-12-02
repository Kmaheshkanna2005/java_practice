import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {

    public static void main(String[] args) {
        String date1 = "2019-06-29";
        String date2 = "2019-06-09"; 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate d1 = LocalDate.parse(date1, formatter);
            LocalDate d2 = LocalDate.parse(date2, formatter);

            long days = ChronoUnit.DAYS.between(d1, d2);
            System.out.println(Math.abs(days)); 

        } catch (Exception e) {
            System.out.println("Invalid date provided!");
        }
    }
}
