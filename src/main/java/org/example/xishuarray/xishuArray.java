package org.example.xishuarray;


public class xishuArray {
//    将二维数组转换为稀疏数组
    public static int[][] toXiShuArray(int[][] arr){
//        初始化稀疏数组的高
        int height = 0;
//        稀疏数组的宽固定三列
        int width = 3;
//        遍历二维数组，得到稀疏数组的高
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]!=0){
                    System.out.print(i+","+j+","+arr[i][j]+" ");
                    height+=1;
                }
            }
        }
        System.out.println(height);
//        初始化稀疏数组
        int[][] arr2 = new int[height+1][width];
        arr2[0][0] = arr.length;
        arr2[0][1] = arr[0].length;
        arr2[0][2] = height;
        int k = 1;
//        遍历二维数组，将非零值存入稀疏数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                    if (arr[i][j]!=0){
                        arr2[k][0] = i;
                        arr2[k][1] = j;
                        arr2[k][2] = arr[i][j];
                        k++;
                    }
            }
        }
        return arr2;
    }
    public static int[][] xiShuToArray(int[][] arr){
//        初始化二维数组
        int[][]arr2 = new int[arr[0][0]][arr[0][1]];
//        遍历稀疏数组，将对应的值存入二维数组
        for (int i = 1; i < arr.length; i++) {
            arr2[arr[i][0]][arr[i][1]] = arr[i][2];
        }
        return arr2;
    }
}
