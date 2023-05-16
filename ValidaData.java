
// Crie uma classe que valide data em java
public class ValidaData {
  public static boolean isDay(String day) {
    int dayInt = Integer.parseInt(day);
    if (dayInt < 1 || dayInt > 31) {
      return false;
    }
    return true;
  }

  public static boolean isMonth(String month) {
    int monthInt = Integer.parseInt(month);
    if (monthInt < 1 || monthInt > 12) {
      return false;
    }
    return true;
  }

  public static boolean isYear(String year) {
    int yearInt = Integer.parseInt(year);
    if (yearInt < 0) {
      return false;
    }
    return true;
  }
}
