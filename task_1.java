class Operation {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        System.out.println("ჯამი: " + operation.add(10, 5));
        System.out.println("სხვაობა: " + operation.subtract(10, 5));
        System.out.println("გამრავლება: " + operation.multiply(10, 5));
        System.out.println("გაყოფა: " + operation.divide(10, 5));

        int[] numbers = {14, 88, -8, 109, 44, 1488, -55, 321, 74, 99};

        // მასივიდან ამობეჭდვა
        System.out.println("ელემენტები:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // ინდექსზე გამრავლება
        multiplyByIndex(numbers);

        // ელემენტთა ჯამი
        System.out.println("ელემენტთა ჯამი: " + sumArray(numbers));

        // კენტი ელემენტები
        System.out.println("კენტი ელემენტები:");
        printOddElements(numbers);

        // ლუწი ელემენტები
        System.out.println("ლუწი ელემენტები:");
        printEvenElements(numbers);

        // ელემენტები კენტი ინდექსით
        System.out.println("ელემენტები კენტი ინდექსით:");
        printElementsAtOddIndices(numbers);

        // ელემენტები ლუწი ინდექსით
        System.out.println("ელემენტები ლუწი ინდექსით:");
        printElementsAtEvenIndices(numbers);
    }

    public static void multiplyByIndex(int[] array) {
        System.out.println("ინდექსზე გამრავლებული ელემენტები:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * i);
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static void printOddElements(int[] array) {
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    public static void printEvenElements(int[] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    public static void printElementsAtOddIndices(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printElementsAtEvenIndices(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
