import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        int day = 24;
        int month = 10;
        int year = 2010;

        String dayOfWeek = findDayOfWeek(day, month, year);
        System.out.println("Output: " + dayOfWeek);
    }

    public static String findDayOfWeek(int day, int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeekNum = calendar.get(Calendar.DAY_OF_WEEK);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return daysOfWeek[dayOfWeekNum - 1];
    }
}
