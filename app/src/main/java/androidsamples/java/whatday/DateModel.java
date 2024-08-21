package androidsamples.java.whatday;

import java.util.Calendar;
import java.text.DateFormatSymbols;
import java.util.Locale;

import androidx.annotation.NonNull;

public class DateModel {
  private static String message;

  private static boolean isLeapYear(int year) {
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          return true;
        }
        return false;
      }
      return true;
    }
    return false;
  }

  /**
   * Initializes the {@link DateModel} with the given year, month, and date.
   * If the date is not valid, it sets the appropriate error message.
   * If it is valid, it sets the appropriate day of the week message.
   *
   * @param yearStr  a {@code String} representing the year, e.g., "1947"
   * @param monthStr a {@code String} representing the month, e.g., "8"
   * @param dateStr  a {@code String} representing the date, e.g., "15"
   */
  public static void initialize(String yearStr, String monthStr, String dateStr) {
    try {
      // Validate year
      int year = Integer.parseInt(yearStr);
      if (year < 1 || year > 9999) {
        message = "Invalid year";
        return;
      }

      // Validate month
      int month = Integer.parseInt(monthStr);
      if (month < 1 || month > 12) {
        message = "Invalid month";
        return;
      }

      // Validate date
      int date = Integer.parseInt(dateStr);
      Calendar calendar = Calendar.getInstance();
      calendar.set(year, month - 1, 1); // Set to the first day of the given month
      int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

      if (date < 1 || date > maxDate) {
        // Check specific error messages
        if (month == 2 && date == 29) {
          if (!isLeapYear(year)) {
            message = "February of " + year + " does not have 29 days";
            return;
          }
        }
        else if(date>31)message="Invalid date";
        else message = "This month does not have " + date + " days";
        return;
      }

      // If valid, get the day of the week
      calendar.set(year, month - 1, date);
      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

      // Convert the day of the week to a string
      String dayOfWeekStr = new DateFormatSymbols(Locale.getDefault()).getWeekdays()[dayOfWeek];
      message = dayOfWeekStr;

    } catch (NumberFormatException e) {
      message = "Enter values in a proper numeric format";
    }
  }

  /**
   * Retrieves the message from the {@link DateModel}.
   * It can be an error message like "February of 2019 does not have 29 days"
   * or a success message like "Friday".
   *
   * @return the message from the model
   */
  @NonNull
  public static String getMessage() {
    return message != null ? message : "No date set.";
  }
}
