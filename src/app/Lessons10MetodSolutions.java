package app;

public class Lessons10MetodSolutions {

    public static void printLn() {
        System.out.println();
    }


    // Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number));
    }

    //  метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
    //  Виведіть об'єм циліндра на екран.
    public static double calculateCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
    public static int arrSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // метод, який приймає рядок (String) як аргумент та повертає новий рядок,
    // який складається з букв цього рядка у зворотньому порядку.
    public static String reversString(String text) {
        StringBuilder rev = new StringBuilder(text);
        return rev.reverse().toString();
    }

    //  метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // метод, який приймає параметри: ціле число n і рядок text.
    // Метод повинен вивести текстовий рядок text n рази,
    // розділяючи кожен рядок символом переносу.
    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.print(text + "\n");
        }
    }

}
