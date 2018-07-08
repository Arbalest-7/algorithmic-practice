package exercise;

/**
 * Created by mawu on 2018/7/8.
 */

import org.junit.Test;

import java.util.Scanner;

/**
 * 输入正整数n≤20，输出一个n层的倒三角形。例如，n＝5时输出如下：
 #########
 #######
 #####
 ###
 #
 */
public class Triangle implements Handler{
    int n;

    @Override
    public void handle() {
        int num = n * 2 - 1;
        String blank = "";
        String triangleLine = "";
        for(int i = num; i > 0; --i) {
            triangleLine += "#";
        }
        for(int i = 0; i < n; ++i) {
            String line = blank + triangleLine.substring(i,triangleLine.length() - i);
            System.out.println(line);
            blank += " ";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.n = scanner.nextInt();
        triangle.handle();
    }
}
