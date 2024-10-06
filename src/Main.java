import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе числo:");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " < " + secondNumber);
        }
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        }
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " = " + secondNumber);
        }

        int sum = (firstNumber + secondNumber);
        int difference = (firstNumber - secondNumber);
        int multiply = (firstNumber * secondNumber);
        int division = (firstNumber / secondNumber);

        System.out.println("Сумма " + sum);
        System.out.println("Разница " + difference);
        System.out.println("Умножение " + multiply);
        System.out.println("Деление " + division);

        // Задание 2
        int[] arrayInteger = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayEvenNumbers = Arrays.stream(arrayInteger)
                .filter(number -> number % 2 == 0).toArray();

        System.out.println("Массив четный: " + Arrays.toString(arrayEvenNumbers));

        // Задание 3
        scanner.nextLine();
        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();
        scanner.close();

        String resultMessage = "Строки ";
        if (firstString.equals(secondString)) {
            resultMessage += "идентичны";
        } else {
            resultMessage += "неидентичны";
        }
        System.out.println(resultMessage);
    }
}




