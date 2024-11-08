import org.apache.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    private static final Logger logger = Logger.getLogger(Homework3.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Квадрат чисел
        try {
            logger.info("Введите два целых числа для возведения в квадрат:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            logger.info("Квадрат первого числа: " + (num1 * num1));
            logger.info("Квадрат второго числа: " + (num2 * num2));
        } catch (InputMismatchException e) {
            logger.error("Ошибка ввода: введено не целое число.");
        }

        // 3. Деление чисел
        try {
            logger.info("Введите два целых числа для деления:");
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            if (divisor == 0) throw new ArithmeticException("Деление на ноль");
            logger.info("Результат деления: " + (dividend / divisor));
        } catch (InputMismatchException e) {
            logger.error("Ошибка ввода: введено не целое число.");
        } catch (ArithmeticException e) {
            logger.error("Ошибка: " + e.getMessage());
        }

        // 5. Ввод возраста
        try {
            logger.info("Введите ваш возраст:");
            int age = scanner.nextInt();
            if (age < 0) throw new AgeNegativeException("Age must be positive");
            logger.info("Ваш возраст: " + age);
        } catch (AgeNegativeException e) {
            logger.error("Ошибка возраста: " + e.getMessage());
        }

        // 8. Преобразование строки в число
        try {
            logger.info("Введите числовую строку:");
            String text = scanner.next();
            int number = Integer.parseInt(text);
            logger.info("Преобразованное значение: " + number);
        } catch (NumberFormatException e) {
            logger.error("Ошибка преобразования: введено нечисловое значение.");
        } finally {
            logger.info("Завершение программы.");
        }

        // Генерация массива и преобразования
        int[] randomArray = generateRandomArray(10);
        logger.info("Сгенерированный массив: ");
        for (int value : randomArray) {
            logger.info(value + " ");
        }
    }

    // Метод для генерации массива с преобразованиями
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt(233) - 88;
            if (value % 2 == 0 && value < 0) {
                array[i] = value * -1;
            } else if (value % 2 == 0) {
                array[i] = value + 10;
            } else if (value % 2 != 0 && value < 0) {
                array[i] = value * -2;
            } else if (value % 2 != 0) {
                array[i] = value - 20;
            } else {
                array[i] = value;
            }
        }
        return array;
    }
}

// Кастомное исключение для отрицательного возраста
class AgeNegativeException extends Exception {
    public AgeNegativeException(String message) {
        super(message);
    }
}
