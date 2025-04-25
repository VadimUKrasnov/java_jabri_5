import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[10];
        String[] names = {"Ilya", "Elena", "Андрей"};


        //System.out.println(numbers);

        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        /*
        for (String name : names) {
            System.out.println(name);
        }
         */

        // Запись значение
        numbers[0] = 1;

        // System.out.println(numbers[0]);
        // System.out.println(names[1]);
        // System.out.println(names.length);

        // System.out.println(average(1000));
        // System.out.println(averageV2(1000));

        int[][] matrix = new int[10][10];
        int[][] grid = {{1, 2}, {3, 4}};

        // print(matrix);
        // print(grid);

        // printIndex(matrix);
        // printIndex(grid);

        int[][] data = createMatrix(100);
        print(data);
        sum(data);

        // ДЗ- 5
        // 1.
        int[] arr = {2, 4, 6, 8, 10};
        printArr(arr);

        // 2.
        int[] arr1 = {2, 4, 6, 8, 11};
        System.out.println(sumArr(arr1));

        // 3.
        int[] arr2 = {3, 5, 1, 8, 2};
        int minValue = minElement(arr2);
        System.out.println("Минимальный элемент массива: " + minValue);

        // 4.
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        printMonthsStartingWithM(months);

        //5.
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив:");
        printArray(myArray);
        invertArray(myArray);
        System.out.println("Инвертированный массив:");
        printArray(myArray);

        // 6.
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray2 = {1, 2, 3, 4, 5, 3};
        System.out.println("Массив 1 имеет дубликаты: " + hasDuplicates(myArray1));
        System.out.println("Массив 2 имеет дубликаты: " + hasDuplicates(myArray2));

        // 7.
        int[] numbersForReplace = {-3, 0, -7, -10, 5, -8};
        replaceNegativesWithAbsolute(numbersForReplace);

        // Многомерные массивы
        // 1.
        arrDiagonal();

        // 2.
        int[][] sumArr = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println("Сумма элементов: " + sumArr(sumArr));

        // 3.
        int[][] myMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        maxElement(myMatrix);
        System.out.println();

        // 4.
        int[][] anyMatrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Массив квадратный?- " + squareArr(anyMatrix));

        // 5.
        int[][] matrixToAnalyze = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(analyzeMatrix(matrixToAnalyze));

        // 6.
        int rows = 5;
        int cols = 5;

        // Получаем строку, представляющую матрицу
        String matrixString = fillMatrix(rows, cols);
        System.out.println(matrixString); // Выводим результат на экран
    }

    // O(2n)
    static int average(int size) {
        int[] arr = new int[size];

        // O(n)
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
        }

        int sum = 0;

        // O(n)
        for (int e : arr) {
            sum += e;
        }

        return sum / size;
    }

    // O(n)
    static int averageV2(int size) {
        int[] arr = new int[size];
        int sum = 0;

        // O(n)
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
            sum += arr[i];
        }


        return sum / size;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("(%s, %s)", i, j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = RANDOM.nextInt(100);
            }
        }
        return matrix;
    }

    static void sum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.printf("Строка %s: сумма = %s\n", i, sum);
        }
    }

    // ДЗ- 5.
    // Одномерные массивы.
    // 1. Создайте метод, который выводит массив в консоль.
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 2. Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
    static int sumArr(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        return (sum);
    }

    // 3. Реализуйте метод для поиска минимального элемента в одномерном массиве
    public static int minElement(int[] arr2) {
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        return min;
    }

    // 4. Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву "М"
    public static void printMonthsStartingWithM(String[] months) {
        System.out.println("Месяцы, начинающиеся на 'М':");
        for (String month : months) {
            if (month.startsWith("М")) {
                System.out.println(month);
            }
        }
    }

    // 5. Напишите метод, который инвертирует порядок элементов в одномерном массиве
    public static void invertArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 6. Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
    public static boolean hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 7. Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
    public static void replaceNegativesWithAbsolute(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Многомерные массивы.
    // 1. Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив
    public static int[][] arrDiagonal() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i == j) ? 1 : 0;
            }
        }
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        return arr;
    }

    // 2. Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
    public static int sumArr(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    // 3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
    public static int[] maxElement(int[][] arr) {
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.printf("Максимальное значение: " + max + " (%s, %s)", maxRow, maxCol);
        System.out.println();
        return new int[]{max, maxRow, maxCol};
    }

    // 4. Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
    public static boolean squareArr(int[][] matrix) {
        int rowCount = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rowCount) {
                return false;
            }
        }
        return true;
    }

    // 5. Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результаты
    public static String analyzeMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return "Матрица пустая или не задана.";
        }
        String result = "Суммы по строкам:" + System.lineSeparator();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int value : matrix[i]) {
                rowSum += value;
                if (value < min) min = value;
                if (value > max) max = value;
            }
            result += "Строка " + i + ": " + rowSum + System.lineSeparator();
        }
        result += "Минимальное значение в матрице: " + min + System.lineSeparator();
        result += "Максимальное значение в матрице: " + max;
        return result;
    }

    // 6. Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
    public static String fillMatrix(int rows, int cols) {
        StringBuilder result = new StringBuilder();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.append(matrix[i][j]);
                if (j < cols - 1) {
                    result.append(" ");
                }
            }
            if (i < rows - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}







