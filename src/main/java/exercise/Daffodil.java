package exercise;

/**
 * Created by mawu on 2018/7/8.
 */

import org.junit.Test;

/**
 *
 输出100～999中的所有水仙花数。若3位数ABC满足ABC＝A^3＋B^3＋C^3，则称其为水仙花
 数。例如153＝1^3＋5^3＋3^3，所以153是水仙花数。
 */
public class Daffodil implements Handler{

    @Override
    @Test
    public void handle() {
        int num = 100;
        while (num < 1000) {
            int t1 = num % 10;
            int t2 = (num/10) %10;
            int t3 = num/100;
            int sum = t1*t1*t1 + t2*t2*t2 + t3*t3*t3;
            if(num == sum) {
                System.out.println(num);
            }
            num++;
        }
    }
}
