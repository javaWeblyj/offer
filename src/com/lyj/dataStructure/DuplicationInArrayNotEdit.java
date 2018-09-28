package com.lyj.dataStructure;
// 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的
// 请在不修改数组的前提下找出任意一个重复数字

import java.util.ArrayList;

/**
 * @program: offer
 * @description: 不修改数组前提下找出重复数组
 * @author: lyj
 * @createDate: 2018-09-26 19:45
 **/
public class DuplicationInArrayNotEdit {

    public void getDupication(int[] numbers){
        int n = numbers.length - 1;
        ArrayList result = new ArrayList();

        if (numbers == null) {
            System.out.println("错误输入，数组为空！");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 1 || numbers[i] > n){
                System.out.println("错误输入，数组中值必须在1到numbers.length-1之间！");
                return;
            }
        }
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            if( sb.indexOf(numbers[i] + " ") != sb.lastIndexOf(numbers[i] + " ") ){
                // System.out.println(numbers[i]);
                if(!result.contains(numbers[i]))
                    result.add(numbers[i]);
                //break;
            }
        }

        System.out.println(result);
    }
}
