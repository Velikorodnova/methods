public class Main {
    public static void main(String[] args) {
        seeLeapYear(2022);
        getDeviceCharacteristics(0, 2022);
        getDeliveryDays(0, 100);
    }

    public static void seeLeapYear(int year) {
        System.out.println("Задание 1");
        if (year % 100 == 0 && year % 400 >= 1 || year % 4 >= 1) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
    }

    public static void getDeviceCharacteristics(int clientOs, int yearVersion) {
        System.out.println("Задание 2");
        String os = "iOS";
        if (clientOs == 0) {
            os = "iOS";
        } else {
            os = "Android";
        }
        if (yearVersion >= 2015)
            System.out.println("Установите полную версию приложения для " + os);
        else if (yearVersion < 2015) {
            System.out.println("Установите облегченную версию приложения для " + os);
        }
    }

    public static void getDeliveryDays(int days, int deliveryDistance) {
        System.out.println("Задание 3");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (days + days));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + days + days));
        }
    }
}




















