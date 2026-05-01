package TasksOnAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums = {1,1,1,2,2,3,3,3,3};
        int[] nums1 = {1, 5, 3, 4, 2};

        TasksOnAlgorithm tasks = new TasksOnAlgorithm();

        System.out.println(getValueForArray(array, 4));
        System.out.println(isNumberEven(60));
        System.out.println("Последний элемент для массива: " + Arrays.toString(array) + " - " + getLastElementArray(array));
        getSumAllElementsArray(array);
        divideByTwo(60);
        tasks.divisionAlgorithm(20);
        System.out.println("Самая длинная серия чисел: " + tasks.longestStreak(nums));
        System.out.println(tasks.shortenString("aaabbc"));
        System.out.println(tasks.hasPairWithDiff(nums1, 2));
        System.out.println(Arrays.toString(changeTwoElementsArray(array)));
    }

    /* Задача №1
     * Асимптотическая сложность данного алгоритма - константная "O(1)",
     * так как мы получаем значение по индексу.
     */
    public static int getValueForArray(int[] array, int index) {
        int result = 404;

        if (index >= 0 && index < array.length) {
            result = array[index];
        } else {
            System.out.println("Введён некорректный индекс для данного массива!");
        }
        return result;
    }

    /* Задача №2
     * Асимптотическая сложность этого алгоритма, так же константная "O(1)".
     * Достаточно произвести одно действие для его выполнения.
     */
    public static boolean isNumberEven(int number) {
        boolean result;

        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /* Задача №3
     * Асимптотическая сложность данного алгоритма - линейная "O(n)".
     * В коде используется конструкция "for-each", поэтому метод будет
     * проходить по каждому элементу целочисленного массива.
     */
    public static int[] changeTwoElementsArray(int[] array) {
        int countIndex = -1;
        int indexOne = 0;
        int indexTwo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Принят массив целых чисел:");
        System.out.println(Arrays.toString(array));
        System.out.println("Введите первый элемент который хотите поменять:");
        int elementOne = scanner.nextInt();
        System.out.println("Введите второй элемент:");
        int elementTwo = scanner.nextInt();


        for (int element : array) {
            countIndex++;
            if (element == elementOne) {
                indexOne = countIndex;
            } else if (element == elementTwo) {
                indexTwo = countIndex;
            }
        }
        array[indexOne] = elementTwo;
        array[indexTwo] = elementOne;
        System.out.println("Вывод массива после замены:");

        return array;
    }

    /* Задача №4
     * В решении этой задачи используется вызов по последнему индексу массива.
     * Асимптотическая сложность - константная "O(1)".
     */
    public static int getLastElementArray(int[] array) {
        int lastIndex = array.length - 1;
        int result = array[lastIndex];

        return result;
    }

    /* Задача №5
     * Здесь так же идёт перебор каждого элемента массива для расчёта их суммы.
     * Асимптотическая сложность - линейная "O(n)". Количество шагов алгоритма
     * будет зависеть от количества входных данных.
     */
    public static void getSumAllElementsArray(int[] array) {
        int sum = 0;
        System.out.println("\n" + "Принят массив целых чисел - " + Arrays.toString(array));

        for (int num : array) {
            sum += num;
        }

        System.out.println("Сумма всех элементов массива: " + sum + "\n");
    }

    /* Задача №6
     * Асимптотическая сложность этого алгоритма - логарифмическая "O(log(n))". С каждым новым шагом в цикле
     * "while" значение перезаписывается и делится пополам при условии, что значение больше единицы.
     */
    public static void divideByTwo(int number) {
        int count = 0;
        int divide = 0;

        if (number > 1) {
            divide = number;
        }

        while (divide > 1) {
            divide /= 2;
            count++;
        }
        System.out.println("Число " + number + " можно разделить на 2 - " + count + " раз(а).");
    }
}
