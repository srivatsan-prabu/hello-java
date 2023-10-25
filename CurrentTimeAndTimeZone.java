import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeAndTimeZone {
    public static void main(String[] args) {
        // Get the current time and time zone
        ZonedDateTime currentTime = ZonedDateTime.now();

        // Define a date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss zzzz");

        // Format and print the current time and time zone
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current time and time zone: " + formattedTime);
    }
}