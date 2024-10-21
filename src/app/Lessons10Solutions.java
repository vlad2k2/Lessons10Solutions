package app;

import java.util.Arrays;
import java.util.Scanner;

public class Lessons10Solutions {



    public static void main(String[] args) {

        double radius = 5.0;
        double height = 7.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scan.nextInt();
        Lessons10MetodSolutions.printSquare(number);
        Lessons10MetodSolutions.printLn();


        double cylinder = Lessons10MetodSolutions.calculateCylinder(radius, height);
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %.6f.%n",radius, height, cylinder);
        Lessons10MetodSolutions.printLn();

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Масив чисел: " + Arrays.toString(array));
        System.out.println("Сума елементів масиву = " + Lessons10MetodSolutions.arrSum(array));
        Lessons10MetodSolutions.printLn();

        // "Поглинаємо" символ нового рядка після введення числа
        scan.nextLine();  // Додаємо цей виклик для поглинання \n

        System.out.print("Введіть рядок: ");
        String string = scan.nextLine();
        String revers = Lessons10MetodSolutions.reversString(string);
        System.out.println("Рядок в зворотньому порядку: " + revers);
        Lessons10MetodSolutions.printLn();

        System.out.print("Введіть a: ");
        int a = scan.nextInt();
        System.out.print("Введіть b: ");
        int b = scan.nextInt();
        int result = Lessons10MetodSolutions.power(a, b);
        System.out.printf("Результат %d^%d дорівнює %d.\n ",a , b, result);
        Lessons10MetodSolutions.printLn();

        System.out.print("Введіть ціле число n: ");
        int countLine = scan.nextInt();
        // "Поглинаємо" символ нового рядка після введення числа
        scan.nextLine();  // Додаємо цей виклик для поглинання \n
        System.out.print("Введіть текстовий рядок: ");
        String textLn = scan.nextLine();
        Lessons10MetodSolutions.printTextNTimes(countLine, textLn);
    }

    //    /*public static void printLn() {
//        System.out.println();
//    }
//
//
//    // Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
//    public static void printSquare(int number) {
//        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number));
//    }
//
//    //  метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
//    //  Виведіть об'єм циліндра на екран.
//    public static double calculateCylinder(double radius, double height) {
//        return Math.PI * radius * radius * height;
//    }
//
//    // метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
//    public static int arrSum(int[] numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }
//
//    // метод, який приймає рядок (String) як аргумент та повертає новий рядок,
//    // який складається з букв цього рядка у зворотньому порядку.
//    public static String reversString(String text) {
//        StringBuilder rev = new StringBuilder(text);
//        return rev.reverse().toString();
//    }
//
//    //  метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
//    public static int power(int a, int b) {
//        return (int) Math.pow(a, b);
//    }
//
//    // метод, який приймає параметри: ціле число n і рядок text.
//    // Метод повинен вивести текстовий рядок text n рази,
//    // розділяючи кожен рядок символом переносу.
//    public static void printTextNTimes(int n, String text) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(text);
//        }
//    }*/
}


