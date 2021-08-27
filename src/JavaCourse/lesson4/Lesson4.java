package JavaCourse.lesson4;

public class Lesson4 {

    public static void main(String[] args) {

        // Задание 1
        task1();

        //Задание 2
        task2();

        //Задание 3
        task3();

        //Задание 4
        task4();

        //Задача 5
        task5();
    }

    private static void task5() {
        int one = 0;
        int two = 1;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(result + " ");
            result = one + two;
            two = one;
            one = result;
        }
    }

    private static void task4() {
        for (int i = 1; i <= 30; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("ping pong");
            } else if (i % 3 == 0) {
                System.out.println("ping");
            } else if (i % 5 == 0) {
                System.out.println("pong");
            }
        }
    }

    private static void task3() {
        int period = 79;
        int currentYear = 2021;

        for (int i = currentYear - period; i > currentYear - 200; i -= period) {
            System.out.println(i);
        }

        for (int i = currentYear + period; i < currentYear + 100; i += period) {
            System.out.println(i);
        }
    }

    private static void task2() {
        int friday = 6;

        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-ое число. Необходимо подготовить отчет.");
                friday += 7;
            }
        }

        //второй вариант
        int friday2 = 6;
        for (; friday2 <= 31; friday2 += 7) {
            System.out.println("Сегодня пятница, " + friday2 + "-ое число. Необходимо подготовить отчет.");
        }
    }

    private static void task1() {
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println("");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("");
    }
}