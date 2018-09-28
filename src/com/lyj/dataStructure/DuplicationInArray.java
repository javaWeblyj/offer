package com.lyj.dataStructure;
//题目描述
//        在一个长度为n的数组里的所有数字都在0到n-1的范围内。
//        数组中某些数字是重复的，但不知道有几个数字是重复的。
//        也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
//        例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
//        那么对应的输出是第一个重复的数字2。

/**
 * @program: offer
 * @description: 寻找数组中重复的数字
 * @author: lyj
 * @createDate: 2018-09-26 17:21
 **/
public class DuplicationInArray {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        // 判断数组是否为空，长度是否为0
        // 数组长度跟数组为空还是不一样的，数组为空会报空指针异常
        if(numbers==null || length<=0)
            return false;

        if(numbers.length != length)
            return false;

        // 要求数组中数要符合 0 ~ n-1
        for (int i = 0; i < length; i++){
            if (numbers[i] < 0 || numbers[i] > length - 1)
                return false;
        }

        for (int i = 0; i < length; i++){
            while (i != numbers[i]){
                // 判断第i位是否等于i
                if (numbers[i] == numbers[numbers[i]]){
                    //System.out.println(numbers[i]);
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return false;
    }
}
