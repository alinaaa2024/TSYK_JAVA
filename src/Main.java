import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // operations with numbers
        System.out.println("Введите 1 целых числа в консоль");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите 2 целых числа в консоль");
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

        // search even numbers
        int[] arrayInteger = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayEvenNumbers = Arrays.stream(arrayInteger)
                .filter(number -> number % 2 == 0).toArray();

        System.out.println("Массив четный: " + Arrays.toString(arrayEvenNumbers));

        // comparison strings
        scanner.nextLine();
        System.out.println("Введите 1 строку в консоль");
        String firstString = scanner.nextLine();
        System.out.println("Введите 2 строку в консоль");
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




