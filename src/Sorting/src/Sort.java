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
//        int[] massive = new int[] {9, 3, 5, 1, 8, 12, 7};
        Instant start =Instant.now();// Запускаем таймер 1

        System.out.print("Рандомный массив: ");

        int massive[] = new int[10]; // создаем рандомный массив из 10 целых чисел + печатаем их
        for (int q = 0; q < massive.length; q++) {
            massive[q] = (int)(Math.random()*100);
            System.out.print(massive[q] + " ");
        }
//        for (int j : massive) {
//            System.out.print(j + " ");
//        }
        System.out.println();

        System.out.print("Сортированный массив с помощью метода sort(): ");
        Arrays.sort(massive);// Сортированный массив с помощью метода sort
        for (int w = 0; w < massive.length; w++) {
            System.out.print(massive[w] + " "); // Выводим на экран сортированные числа с помощью метода sort()
        }
        System.out.println();

        Thread.sleep(1000);
        Instant finish = Instant.now(); // Останавливаем таймер 1
        long speed = Duration.between(start, finish).toMillis(); // Рассчитываем время
        System.out.println("Время работы метода sort: " + speed); // Выводим на экран в мс

//        final long then = System.nanoTime();
//        TimeUnit.SECONDS.sleep(1);
//        final  long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - then);
//        System.out.println("Время работы: " + millis );


        Instant start2 =Instant.now(); // Запускаем таймер 2
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
        for (int j : massive) {
            System.out.print(j + " ");
        }
        System.out.println();

        Thread.sleep(1000);
        Instant finish2 = Instant.now(); // Останавливаем таймер 2
        long speed2 = Duration.between(start, finish2).toMillis(); //Рассчитываем время 2
        System.out.println("Время работы метода sort: " + speed);


//        final long then2 = System.nanoTime();
//        TimeUnit.SECONDS.sleep(1);
//        final  long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - then2);
//        System.out.println("Время работы: " + millis2 );
    }
}
