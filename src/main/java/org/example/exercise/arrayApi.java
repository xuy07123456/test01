package org.example.exercise;

/**
 * ClassName:javaTest372
 * Project:test01
 * Package: org.example.exercise
 * Description
 *
 * @Author 徐艺
 * @Create 2023/7/10 9:11
 * @Version 1.0
 */
public class arrayApi {
    public static int erfenchazhao(int[]arr,int value){
        int index = -1;
        int head = 0;
        int end = arr.length-1;
        while (head<=end){
            int mid = (end+head)/2;
            if (arr[mid]==value){
                index = mid;
                break;
            } else if (arr[mid]>value) {
                end = mid-1;
            }
            else if (arr[mid]<value){
                head = mid+1;
            }
        }
        return index;
    }
}
