import java.io.OptionalDataException;
import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sort {
    public static void main (String[] args) throws InterruptedException {
        System.out.print("Рандомный массив: ");
        int massive[] = new int[10]; // создаем рандомный массив из 10 целых чисел + печатаем их
        for (int q = 0; q < massive.length; q++) {
            massive[q] = (int)(Math.random()*100);
            System.out.print(massive[q] + " ");
        }
        System.out.println();

        System.out.print("Сортированный массив с помощью метода sort(): ");
        long start3 = System.nanoTime();
        Arrays.sort(massive);// Сортированный массив с помощью метода sort
        for (int w = 0; w < massive.length; w++) {
            System.out.print(massive[w] + " "); // Выводим на экран сортированные числа с помощью метода sort()
        }
        Thread.sleep(1000);
        long finish3 = System.nanoTime();
        System.out.println();

        Long millis = finish3 - start3;

        System.out.println("Время работы метода Sort: " + millis );

        Long start4 = System.nanoTime();
        int temp;
        System.out.print("Сортированный массив методом пузырика: " );
        for (int k = massive.length - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (massive[i] > massive[i + 1]) {
                    temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                }// Сортируем с помощью "пузырика"
            }
        }
        Thread.sleep(1000);
        long finish4 = System.nanoTime();
        for (int j : massive) {
            System.out.print(j + " ");
        }
        System.out.println();
        long millis2 = finish4 - start4;

        System.out.println("Время работы метода Пузырика: " + millis2 );
        System.out.println("Сравнение методов Пузырика и Start: " +(millis2 - millis));

        long start5 = System.nanoTime();// Запускаем таймер метода Выбора
        Thread.sleep(1000);
        System.out.print("Сортированный массив методом Выбора: " );
        for (int i =0; i < massive.length; i++){
            int min = massive[i];
            int minId = i;
            for (int a = i+1; a < massive.length; a++) {
                if (massive[a]< min){
                    min = massive[a];
                    minId = a;
                }
            }
        }
        long finish5 = System.nanoTime();
        long millis3 = finish5 - start5;

        for (int w : massive) {
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("Время работы метода Выбора: " + millis3 );
        System.out.println("Сравнение методов Выбора и Start: " +(millis3 - millis));
        System.out.println("Сравнение методов Выбора и Пузырика: " +(millis3 - millis2));

        long[] massiveMillis = new long[] {millis, millis2, millis3};

        Arrays.sort(massiveMillis);// Сортированный массив с помощью метода sort
        System.out.println("Сортируем методы: ");
        for (int r = 0; r < massiveMillis.length; r++) {
            System.out.print(massiveMillis[r] + " "); // Выводим на экран сортированные числа с помощью метода sort()
        }
    }
}
