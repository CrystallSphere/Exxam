import java.util.Random;


public class Exam {
    public static void main(String[] args) {

        int[] mas = new int[100];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++)
            mas[i] = rand.nextInt(100) - 50;
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        for (int value : mas) {
            if (value < 0) {
                System.out.println(value);
            }
        }
        int[] negativeMas = new int[mas.length];
        int negativeIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0)
                negativeMas[negativeIndex++] = mas[i];

        }
        int negativeNumber = 0;

        for (int i = 0; i < mas.length; i++) {

            if (negativeMas[i] < 0)
                negativeNumber++;
        }
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) count++;
        }
        System.out.println("Количество отрицательных чисел:" + count);
        int m = -1;
        int s = -50;
        int EvenNegativeNumbers = 0;
        for (int i = s; i <= m; i++) {
            if (i % 2 == 0) EvenNegativeNumbers++;
        }

        System.out.println("Количество четных отрицательных чисел:" + EvenNegativeNumbers);


        int max = getMax(mas);
        int min = getMin(mas);
        int x = -25, y = 25;
        System.out.println("Самое большое  число в массиве: " + max);
        System.out.println("Самое маленькое число в массиве: " + min);
        System.out.println("Cреднее отрицательное число:" + x);

        for (int value : mas) {
            if (value > 0) {
                System.out.println(value);
            }
        }

        int[] positiveMas = new int[mas.length];
        int positiveIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0)
                positiveMas[positiveIndex++] = mas[i];

        }
        int positiveNumber = 0;

        for (int i = 0; i < mas.length; i++) {

            if (positiveMas[i] < 0)
                positiveNumber++;
        }
        int coun = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) coun++;
        }
        System.out.println("Количество положительных чисел:" + coun);
        int a = 1;
        int z = 50;
        int EvenPositiveNumbers = 0;
        for (int i = a; i <= z; i++) {
            if (i % 2 == 0) EvenPositiveNumbers++;
        }

        System.out.println("Количество четных положительных чисел:" + EvenPositiveNumbers);

        System.out.println("Cреднее положительное число:" + y);

        int counterNumbers = 0;
        int counter = 0;
        int EXC = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                if (mas[i] == mas[j] && mas[j] != EXC) {
                    counterNumbers++;
                    mas[counter] = mas[j];
                }
            }

            if (counterNumbers > 1) {
                System.out.println("Число " + mas[i] + " встречается " + counterNumbers + " раз");
                for (int j = 0; j < mas.length; j++) {
                    if (mas[j] == mas[counter]) mas[j] = EXC;
                }
                counterNumbers = 0;
                counter++;

            }

        }
        for (int i = 0; i < mas.length; i++) {
            int miin = mas[i];
            int min_i = i;
            for (int o= i + 1; o < mas.length; o++) {
                if (mas[o] < miin) {
                    miin = mas[o];
                    min_i = o;
                }
            }

            if (i != min_i) {
                int tmp = mas[i];
                mas[i] = mas[min_i];
                mas[min_i] = tmp;
            }



        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }



    public static int getMax(int[] Array) {
        int maxValue = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > maxValue) {
                maxValue = Array[i];
            }

        }

        return maxValue;

    }

    public static int getMin(int[] Array) {
        int minValue = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < minValue) {

                minValue = Array[i];
            }

        }

        return minValue;
    }
}































