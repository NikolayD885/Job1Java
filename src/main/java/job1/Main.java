package job1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    System.out.print(ex1());
    //    ex2();
    //    System.out.print(ex3());
    //    ex4();
    //    ex5();
    //    ex6();
    //    ex7();
    //    ex8();
        ex9();

    }




    private static boolean ex1() {
        System.out.print("Введите два целых числа через пробел: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if (a + b >= 10 && a + b <= 20) {
        return true;
        } else {
            return false;
        }
    }
    private static void ex2() {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a >= 0) {
            System.out.print("Число положительное");
        } else {
            System.out.print("Число отрицательное");
        }

    }
    private static boolean ex3() {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    private static void ex4() {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Введите сколько раз напечатать строку: ");
        int a = Integer.parseInt(sc.next());
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }

    }
    private static void ex5() {
        System.out.print("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a % 400 == 0) {
            System.out.print("Год високосный");
        } else if (a % 100 == 0){
            System.out.print("Год не високосный");
        } else if (a % 4 == 0){
            System.out.print("Год високосный");
        } else {
            System.out.print("Год не високосный");
        }
    }
    private static void ex6() {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length - 1; i ++){
            arr[i] = rd.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        while (i < arr.length){
            if (arr[i] == 0){
                arr[i] = 1;
            } else{
                arr[i] = 0;
            }
            i ++;
        }
        System.out.print(Arrays.toString(arr));
    }
    private static void ex7() {
        int[] arr = new int[100];
        int count = 1;
        for (int i = 0; i < arr.length; i ++){
            arr[i] = count;
            count ++;
        }
        System.out.print(Arrays.toString(arr));
    }
    private static void ex8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(arr));

    }
    private static void ex9() {


    }
}
