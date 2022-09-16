package com.junbotan.javase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tan
 * @date 2022年09月10日 15:57
 */
public class Test1 {
    public static int result;

    public static void main(String[] args) {
//        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int count = 2;
            int n = scanner.nextInt();//宝藏数量
            int[] rooms = new int[4000];//房间
            int[] weight = new int[4000];//价值
            int[] values = new int[4000];//总值
            for(int i = 1; i <= n; i++) {
                rooms[i] = scanner.nextInt();
            }
            rooms[0] = 1;
            for(int i = 1; i <= n; i++) {
                weight[rooms[i]] = scanner.nextInt();
            }
            String str1 = Arrays.toString(rooms);
            System.out.println("rooms"+str1);
            String str2 = Arrays.toString(weight);
            System.out.println("weight"+str2);
            String str3 = Arrays.toString(values);
            System.out.println("values"+str3);

            //计算总值
            while(count <= rooms[n]) {
                values[count] = values[(count-1) / 2] + weight[count];
                count++;
            }
            String str4 = Arrays.toString(values);
            System.out.println("values2"+str4);


            //输出最大值
            Arrays.sort(values);
            int max = values[values.length - 1];
            System.out.println(max);
        }
    }
}


