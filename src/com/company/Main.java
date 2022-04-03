package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         task67();
         task92();
        task142();
        task42();
        task117();
    }

    public static void randomArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 15 + 1);
        }
    }

    public static void realNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30 - 15);
        }
    }


    /**
     * 67. Найти сумму всех элементов массива целых чисел, удовлетворяющих условию: остаток от деления на 3 равен 2
     */
    private static void task67() {
        System.out.print("Amount of elements: ");
        Scanner console = new Scanner(System.in);
        int amount = console.nextInt();
        int[] arr = new int[amount];
        int sum = 0;
        randomArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 2) {
                sum += arr[i];
            }
        }
        System.out.print(sum+"\n");
    }

    /**
     * 92.Удалить k-й элемент массива целых чисел A(50).
     */
    private static void task92() {
        int[] arr = new int[50];
        randomArr(arr);
        System.out.print("k =  ");
        Scanner console = new Scanner(System.in);
        int k = console.nextInt();
        int[] second = new int[arr.length];
        System.out.print(Arrays.toString(arr) + "\n");
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == (arr.length )) {
                arr[i] = 0;
                break;
            }
            if (i != k) {
                second[j++] = arr[i];
            }
        }
        System.out.print(Arrays.toString(second));
    }

    /**
     * 142. Дана последовательность вещественных чисел а1, а2, ..., an.
     * Требуется умножить все члены последовательности а1, а2, ..., an на квадрат ее наименьшего члена, если аk ≥ 0
     */
    private static void task142() {
        Scanner console = new Scanner(System.in);
        System.out.print("\nAmount of elements: ");
        int amount = console.nextInt();
        int[] arr = new int[amount];
        int[] secondArr = new int[amount];
        realNumbers(arr);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            secondArr[i] = arr[i] * (min * min);
        }
        System.out.print(min+"\n");
        System.out.print(Arrays.toString(arr)+"\n");
        System.out.print(Arrays.toString(secondArr)+"\n");
    }

    /**
     * 42. Пригодность детали оценивается по размеру В, который должен лежать в интервале (А – δ, А + δ).
     * Определить, имеются ли в партии из N деталей бракованные.
     * Если да, то подсчитать их количество, в противном случае выдать отрицательный ответ.
     */
    private static void task42() {
        int count = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter part size: ");
        int goodPart = console.nextInt();
        System.out.print("Deviation is: ");
        int deviation = console.nextInt();
        System.out.print("Number of details: ");
        int num = console.nextInt();
        int[] arr = new int[num];
        randomArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= goodPart - deviation && arr[i] <= goodPart + deviation) {
                System.out.println("\nGood details: " + arr[i]);
            }
            else {
                count++;
                System.out.print("\nBad details: " + arr[i]);
            }
        }
        System.out.print("\nBad parts: " + count);
    }

    /**
     * 117.Задан массив. Создать два массива, в одном из которых находятся все четные по номеру элементы,
     * в другом нечетные по номеру элементы массива.
     */
    private static void task117() {
        System.out.print("\nSize =  ");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arr = new int[size];
        realNumbers(arr);
        if(size % 2 == 1)
        {
            size ++;
        }
        int[] even = new int[size/2];
        int[] odd = new int[size/2];
        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if(i % 2 == 0)
            {
                even[j++] = arr[i];
            }
        }
        for (int i = 0, l = 0; i < arr.length; i++)
        {
            if(i % 2 != 0)
            {
                odd[l++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Even:"+ Arrays.toString(even));
        System.out.println("Odd:"+Arrays.toString(odd));
    }
    }

