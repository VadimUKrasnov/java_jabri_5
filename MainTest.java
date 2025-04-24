import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    // 2. Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
    @Test
    public void sumArr() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 15;
        assertEquals(expected, Main.sumArr(input));
    }

    // 3. Реализуйте метод для поиска минимального элемента в одномерном массиве
    @Test
    public void minElement() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 1;
        assertEquals(expected, Main.minElement(input));
    }

    // 5. Напишите метод, который инвертирует порядок элементов в одномерном массиве
    @Test
    public void invertArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        Main.invertArray(input);
        assertArrayEquals(expected, input);
    }

    // 6. Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
    @Test
    public void hasDuplicates() {
        int[] input = {7, 3, 1, 4, 2, 5, 5, 6};
        boolean expected = true;
        assertEquals(expected, Main.hasDuplicates(input));
    }

    // 7. Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
    @Test
    public void replaceNegativesWithAbsoluteTest() {
        int[] input = {-1, 2, -3, 4, -5};
        int[] expected = {1, 2, 3, 4, 5};
        Main.replaceNegativesWithAbsolute(input);
        assertArrayEquals(expected, input);
    }

    // Многомерные массивы
    // 1. Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив

    @Test
    public void arrDiagonal() {
        int[][] result = Main.arrDiagonal();
        int[][] expected = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertArrayEquals(expected, result);
    }


    // 2. Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
    @Test
    public void calcSumArr() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 45;
        assertEquals(expected, Main.sumArr(array));
    }


    // 3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
    @Test
    public void searchMaxElement() {
        int[][] matrix = {
                {3, 5, 7},
                {2, 9, 1},
                {8, 4, 6}
        };
        int[] expected = {9, 1, 1};
        int[] result = Main.maxElement(matrix);
        assertArrayEquals(expected, result);
    }

    // 4. Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
    @Test
    public void testSquareArr() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        boolean expected = true;
        boolean result = Main.squareArr(matrix);
        assertEquals(expected, result);
    }

    // 5. Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результа
    @Test
    public void analyzeMatrixStandardCaseTest() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String expected = "Суммы по строкам:" + System.lineSeparator() +
                "Строка 0: 6" + System.lineSeparator() +
                "Строка 1: 15" + System.lineSeparator() +
                "Строка 2: 24" + System.lineSeparator() +
                "Минимальное значение в матрице: 1" + System.lineSeparator() +
                "Максимальное значение в матрице: 9";
        String result = Main.analyzeMatrix(matrix);
        assertEquals(expected, result);
    }

    // 6. Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
    @Test
    public void testFillMatrix() {
        String result = Main.fillMatrix(5, 5);
        String expectedOutput = "0 1 0 1 0\n" +
                "1 0 1 0 1\n" +
                "0 1 0 1 0\n" +
                "1 0 1 0 1\n" +
                "0 1 0 1 0";
        assertEquals(expectedOutput.trim(), result.trim());
    }






}