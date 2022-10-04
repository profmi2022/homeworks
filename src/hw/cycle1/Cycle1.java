package hw.cycle1;

public class Cycle1 {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 1.2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 1.3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задание 1.4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 2.1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задание 2.2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("Задание 2.3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задание 3.1");
        int sum = 0;
        for (int month=1; month <= 12; month++ ) {
            sum += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum);
        }
        System.out.println("Задание 3.2");
        int sum2 = 29000;
        float total = (float) 0;
        for (int month=1; month <= 12; month++ ) {
            total = total + total / 100;
            total = total + sum2;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
    }
}
