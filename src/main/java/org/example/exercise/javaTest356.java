package org.example.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:javaTest356
 * Project:test01
 * Package: org.example.exercise
 * Description
 *
 * @Author 徐艺
 * @Create 2023/7/7 9:39
 * @Version 1.0
 */
public class javaTest356 {
    public static int[] getGreatestArr(int[] arr){
        List<Integer> subArr = new ArrayList<Integer>();
        if (arr.length==0 || arr==null){
            return null;
        }
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
//            如果temp大于0，说明前面的数加起来大于0，那么就继续加
            temp += arr[i];

//            如果temp小于0，说明前面的数加起来小于0，那么就从当前数开始重新计算
            if (temp<0){
                temp = 0;
                if (subArr!=null)
                    subArr.clear();
            }
//            如果temp大于sum，说明当前的数加起来大于之前的数加起来，那么就将当前数加入到subArr中
            if (temp>sum){
                sum = temp;
                subArr.add(arr[i]);
            }

        }
        if (sum==0){
            sum = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>sum){
                    subArr.clear();
                    sum = arr[i];
                    subArr.add(arr[i]);
                }
            }
        }
        int[] arr2 = new int[subArr.size()];
        for (int i = 0; i < subArr.size(); i++) {
            arr2[i] = subArr.get(i);
        }
        return arr2;
    }
}
