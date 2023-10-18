import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String date1 = today.format(fmt);
        DateTimeFormatter fmt2  = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date2 = today.format(fmt2);
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String date3 = today.format(fmt3);
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm");
        String date4 = today.format(fmt4);

        System.out.println("This is the local time: ");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}
