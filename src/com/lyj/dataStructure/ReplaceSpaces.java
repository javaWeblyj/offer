package com.lyj.dataStructure;/**
 * @Auther: babyL FinlayL
 * @Date: 2018/9/28 00:49
 * @Description:
 */

/**
 * @program: offer
 * @description: 代替字符串中空格
 * @author: babyL.FinlayL
 * @createDate: 2018-09-28 00:49
 **/
public class ReplaceSpaces {
    public String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        StringBuffer str0 = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (' ' == str.charAt(i)){
                str0.append("%20");
            } else {
                str0.append(str.charAt(i));
            }
        }
        // System.out.println(str0);
        return str0.toString();
    }
}
