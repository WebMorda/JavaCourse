package JavaCourse.lesson3;

import java.time.Year;

public class lesson3 {
    public static void main(String[] args) {

        // Задание 1
        {
            byte clientOS = 1;

            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("------------------------------------------------------------------------");

        // Задание 2
        {
            byte clientOS = 0;
            int clientDeviceYear = 2015;

            if (clientOS == 0) {

                if (clientDeviceYear < 2019) {
                    System.out.println("Установите lite версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            } else if (clientOS == 1) {

                if (clientDeviceYear < 2019) {
                    System.out.println("Установите lite версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }

        System.out.println("-------------------------------------------------------------------------");

        // Задание 3
        {
            int year = 2000;

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("Високосный год");
            } else {
                System.out.println("Год не високосный");
            }

            //Такой вариант считается? :)
            if (Year.isLeap(year)) {
                System.out.println("Високосный год");
            } else {
                System.out.println("Год не високосный");
            }
        }

        System.out.println("------------------------------------------------------------------------");

        //Задание 4
        {
            int deliveryDistance = 95;
            int deliveryDay = 0;

            if (deliveryDistance > 0) {
                deliveryDay++;
            }
            if (deliveryDistance > 20) {
                deliveryDay++;
            }
            if (deliveryDistance > 60) {
                deliveryDay++;
            }

            System.out.println("Доставка займет " + deliveryDay + " д.!");

            //Второй вариант
            deliveryDay = 0;
            if (deliveryDistance > 0 && deliveryDistance <= 20) {
                deliveryDay += 1;
            }
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryDay += 2;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDay += 3;
            }

            System.out.println("Доставка займет " + deliveryDay + " д.!");
        }

        System.out.println("------------------------------------------------------------------------");

        //Задание 5
        {
            int mount = 12;

            switch (mount) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }

        System.out.println("------------------------------------------------------------------------");

        //Задание 6
        {
            int age = 19;
            int salary = 58_000;
            int limit = 0;

            if (age < 23) {
                limit = salary * 2;
            } else {
                limit = salary * 3;
            }

            if (salary > 50_000 && salary < 80_000) {
                limit *= 1.2;
            } else if (salary > 80_000) {
                limit *= 1.5;
            }

            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        }

        System.out.println("------------------------------------------------------------------------");

        //Задача 7
        {
            int age = 25;
            int salary = 60_000;
            int wantedSum = 330_000;
            float percent = 10;
            int creditTerm = 12;
            int maxPayment = (salary / 100) * 50;
            float sumCredit = 0;
            float payMonth = 0;
            boolean result = false;

            if (age < 23) {
                percent += 1;
            } else if (age < 30) {
                percent += 0.5;
            }

            if (salary > 80_000) {
                percent -= 0.7;
            }

            sumCredit = wantedSum * (percent / 100 + 1);

            payMonth = sumCredit / creditTerm;

            result = maxPayment > payMonth;

            System.out.println("Кредитная ставка " + percent);
            System.out.println("Сумма кредита " + sumCredit);
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payMonth + " рублей");

            if (result == true) {
                System.out.println("Одобрено");
            } else {
                System.out.println("Отказано");
            }
        }
    }
}
