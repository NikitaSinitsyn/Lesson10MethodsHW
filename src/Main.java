import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        checkIfTheYearIsALeap(2023);

        // Exercise 2
        checkTypeOfOCAndNeededVersion(1, 15);

        // Exercise 3
        int deliveryDistance = 95;
        int daysForDelivery = calculateDaysForDelivery(deliveryDistance);
        System.out.println("Необъодимо лней для достаки карты - " + daysForDelivery);
    }

    public static void checkIfTheYearIsALeap(int year) {
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " -  не високосный год");
        }
    }

    public static void checkTypeOfOCAndNeededVersion(int OC, int year) {
        int currentYear = LocalDate.now().getYear();
        if (OC == 0 || OC == 1) {
            if (OC == 0 && year >= currentYear) {
                System.out.println("Установите текущую версию приложения для iOS");
            } else if (OC == 0 && year < currentYear) {
                System.out.println("Установите lite версию приложения для iOS");
            }
            if (OC == 1 && year >= currentYear) {
                System.out.println("Установите текущую версию приложения для Android");
            } else if (OC == 1 && year < currentYear) {
                System.out.println("Установите lite версию приложения для Android");
            }
        } else {
            System.out.println("Invalid OC");
        }
    }

    public static int calculateDaysForDelivery(int distance) {
        int daysForDelivery = 1;
        if (distance < 20) {
            daysForDelivery = 1;
        } else if (distance >= 20 && distance < 60) {
            daysForDelivery++;
        } else if (distance >= 60 && distance < 100) {
            daysForDelivery = daysForDelivery + 2;
        }
        return daysForDelivery;
    }

}