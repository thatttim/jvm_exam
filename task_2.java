import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. 10 ელემენტიანი მასივი
        int[] array1 = new int[10];

        // 2. შევაყნანინოთ რიცხვები
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანე 10 მთელი რიცხვი:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        // 3. დავბეჭდოთ მასივი
        System.out.println("შეყვანილი მასივი:");
        System.out.println(Arrays.toString(array1));

        // 4. 20 ელემენტიანი მასივი
        int[] array2 = new int[20];

        // 5-6. რენდომული რიცხვებით ვავსებთ მასივს [-88, 144]
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(144 - (-88) + 1) - 88;
        }

        // ვბეჭდავთ მეორე მასივს
        System.out.println("რენდომული მასივი:");
        System.out.println(Arrays.toString(array2));

        // 7. მასივის დალაგება
        Arrays.sort(array2);
        System.out.println("დალაგებული მასივი:");
        System.out.println(Arrays.toString(array2));

        // 8. მედიანას პოვნა
        double median = findMedian(array2);
        System.out.println("მასივის მედიანა: " + median);

        // 9. ვქმნით და ვავსებთ პირველ მატრიცას
        int[][] matrix1 = {
                {4, 8, 19, 0},
                {-55, 934, 67, 1},
                {4, 7, 144, 88},
                {0, -123, -7, 1488}
        };
        System.out.println("პირველი მეტრიცა:");
        printMatrix(matrix1);

        // 11. პირველი მატრიცის ელემენტთა ჯამი
        int sumMatrix1 = sumMatrixElements(matrix1);
        System.out.println("პირველი მატრიცის ელემენტთა ჯამი: " + sumMatrix1);

        // 12. ვქმნით მეორე მატრიცას
        int[][] matrix2 = {
                {43, 81, 1, 10},
                {-5, 94, 7, 11},
                {43, 17, 14, 9},
                {-8, -13, 7, 1}
        };
        System.out.println("მეორე მატრიცა:");
        printMatrix(matrix2);

        // 13. მატრიცათა ჯამი
        System.out.println("მატრიცათა ჯამი:");
        printMatrix(addMatrices(matrix1, matrix2));

        // 14. ზედა დიაგონალის ჯამი
        System.out.println("ზედა დიაგონალის ჯამი: " + sumUpperDiagonal(matrix1));

        // 15. ქვედა დიაგონალის ჯამი
        System.out.println("ქვედა დიაგონალის ჯამი: " + sumLowerDiagonal(matrix1));

        // 16. მთავარი დიაგონალის ჯამი
        System.out.println("მთავარი დიაგონალის ჯამი: " + sumMainDiagonal(matrix1));
    }

    // მედიანას პოვნა
    public static double findMedian(int[] array) {
        int mid = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[mid - 1] + array[mid]) / 2.0;
        } else {
            return array[mid];
        }
    }

    // მატრიცის ბეჭდვა
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // ელემენტთა ჯამი
    public static int sumMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    // მატრიცათა შეკრება
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // ზედა მედიანა
    public static int sumUpperDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // ქვედა მედიანა
    public static int sumLowerDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // მთავარი მედიანა
    public static int sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
