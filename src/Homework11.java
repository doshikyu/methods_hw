import java.time.LocalDate;
import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {

        task1();

        short randOSType = (short) new Random().nextInt(2);
        int randYear = new Random().nextInt(5) + 2020;
        task2(randOSType, randYear);

        int deliveryDistance = 95;
        task3(deliveryDistance);

    }

    private static void task1() {
        int[] years = {2024, 2025, 2026, 2027, 2028, 2029, 2030};
        for (int year : years) {
            System.out.println(year + " год " + (isLeapYear(year) ? "-- високосный год" : "-- невисокосный год"));
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static void task2 (short osType, int launchYear){
        String osName;
        if (osType == 0) osName = "iOS";
        else osName = "Android";

        if (launchYear == LocalDate.now().getYear()){
            System.out.println("Установите версию приложения для " + osName + " по ссылке");
        } else
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
    }

    private static void task3 (double distance){
        int deliveryDays;

        if (distance <= 20.0) {
            deliveryDays = 1;
        } else if (distance > 20.0 && distance <= 60.0){
            deliveryDays = 2;
        } else if (distance > 60.0 && distance <= 100.0){
            deliveryDays = 3;
        } else {
            System.out.println("Свыше 100 км доставки нет.");
            return;
        }

        System.out.println("Потребуется дней: " + deliveryDays +".");
    }
}