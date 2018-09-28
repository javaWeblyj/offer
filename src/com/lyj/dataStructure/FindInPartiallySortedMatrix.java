package com.lyj.dataStructure;

/**
 * @program: offer
 * @description: 查找二维数组中某值是否存在
 * @author: lyj
 * @createDate: 2018-09-26 23:59
 **/
public class FindInPartiallySortedMatrix {

    public boolean Find(int target, int [][] array) {
        boolean found = false;
        if (array == null)
            return false;
        int rows = array.length;
        int columns = array[0].length;
        if (rows > 0 && columns > 0){
            int row = 0;
            int column = columns - 1;

            while (row < rows && column >= 0){
                if (array[row][column] == target){
                     System.out.println("找到了！");
                    found = true;
                    break;
                }else if (array[row][column] > target){
                    column--;
                }else {
                    row++;
                }
            }
        }
        return found;
    }

}
