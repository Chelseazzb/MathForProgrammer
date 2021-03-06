package math.basic.binary;

/**
 * @ClassName : Lesson1_3
 * @Author : Zhai Zhibin
 * @Date : 2020/9/24 13:47
 * @Description : 与、或、异或操作
 * @Modified_by :
 * @Version : 1.0
 **/

import java.math.BigInteger;

import static math.basic.binary.Lesson1_1.decimalToBinary;

public class Lesson1_3 {

    /**
     * @Description: 二进制按位“或”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“或”的结果
     */
    public static int or(int num1, int num2) {

        return (num1 | num2);

    }

    /**
     * @Description: 二进制按位“与”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“与”的结果
     */
    public static int and(int num1, int num2) {

        return (num1 & num2);

    }

    /**

     * @Description: 二进制按位“异或”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“异或”的结果
     */

    public static int xor(int num1, int num2) {

        return (num1 ^ num2);

    }


    public static void main(String[] args) {

        int a = 53;
        int b = 35;

        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘或’结果是%d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), Lesson1_3.or(a, b), decimalToBinary(Lesson1_3.or(a, b)))); //获取十进制数53和35的按位“或”

        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘与’结果是%d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), Lesson1_3.and(a, b), decimalToBinary(Lesson1_3.and(a, b))));  //获取十进制数53和35的按位“与”

        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘异或’结果是%d(%s)",
                a, decimalToBinary(a), a, decimalToBinary(a), Lesson1_3.xor(a, a), decimalToBinary(Lesson1_3.xor(a, a))));  //获取十进制数53和35的按位“异或”

    }


}