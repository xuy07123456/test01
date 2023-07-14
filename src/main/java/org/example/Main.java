package org.example;

import org.example.exercise.arrayApi;
import org.example.exercise.classTest;
import org.example.exercise.fulei;
import org.example.exercise.zilei;
import org.example.xishuarray.xishuArray;


public class Main {
    public static void testXishu(){
        //    初始化一个稀疏数组
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        arr[3][4] = 2;
        arr[4][5] = 2;
        arr[5][6] = 2;
        arr[6][7] = 2;
        arr[7][8] = 2;
        arr[8][9] = 2;
        arr[9][10] = 2;
//        遍历稀疏数组
        for (int[] row : arr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        int[][] arr2 = xishuArray.toXiShuArray(arr);
        for (int[] row : arr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        int[][] arr3 = xishuArray.xiShuToArray(arr2);
        System.out.println();
        for (int[] row : arr3) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
    public static void testDuilie(){

    }
    public static void javaTest134(){
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        i = ++i1;
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        i = i2--;
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        i = --i2;
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);

        System.out.println("5+5="+5+5);
        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);
        int i3 = 1;
        int j = i3++ + ++i3 * i3++;
        System.out.println("j = " + j);
        int m = 2;
        m = m++;
        System.out.println("m = " + m);
    }
    public static void javaTest197(){
        int num = 1;
        for (System.out.printf("a");num<3; System.out.printf("c"),num++){
            System.out.printf("b");
        }
    }
    public static void tst(String[]args,int...a){
        System.out.println("a.length = " + a.length);
    }

    public static void main(String[] args) {
        Integer x = 127;
        Integer y = 127;
        System.out.println(x==y);
        System.out.println("helloGit");
        System.out.println("helloGitFix");
        System.out.println("masterCommit");
        System.out.println("helloGitFix2");
        System.out.println("helloGitFix3");
    }

}