package math.basic.binary;

/**
 * @ClassName : Lesson1_4
 * @Author : Zhai Zhibin
 * @Date : 2020/9/24 13:50
 * @Description : 思考题：不使用BigInteger如何实现二进制和十进制的转换
 * @Modified_by :
 * @Version : 1.0
 **/
public class Lesson1_4 {

    static public void Transform_to_Binary(int decimal) {
        if(decimal==0)
            return;
        else {
            Transform_to_Binary(decimal/2);
            System.out.print(decimal%2);
        }
    }

    public static void main(String[] args) {
        Transform_to_Binary(10);
    }

}
