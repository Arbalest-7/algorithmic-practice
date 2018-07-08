package exercise;

/**
 * Created by mawu on 2018/7/8.
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * 相传韩信才智过人，从不直接清点自己军队的人数，只要让士兵先后以三人一排、五人
 一排、七人一排地变换队形，而他每次只掠一眼队伍的排尾就知道总人数了。输入包含多组
 数据，每组数据包含3个非负整数a，b，c，表示每种队形排尾的人数（a＜3，b＜5，c＜
 7），输出总人数的最小值（或报告无解）。已知总人数不小于10，不超过100。输入到文件
 结束为止。
 样例输入：
 2 1 6
 2 1 3
 样例输出：
 Case 1: 41
 Case 2: No answer
 */
public class Hanxin implements Handler{
    int a, b, c;

    @Override
    public void handle() {
        boolean find = false;
        int i = 10;
        for(; i <= 100; ++i) {
            find = (i%3 == a) && (i%5 == b) &&(i%7 == c);
            if(find) {
                break;
            }
        }
        if(find) {
            System.out.println(i);
        }else {
            System.out.println("No answer");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hanxin hanxin = new Hanxin();
        hanxin.a = scanner.nextInt();
        hanxin.b = scanner.nextInt();
        hanxin.c = scanner.nextInt();
        hanxin.handle();
    }
}
