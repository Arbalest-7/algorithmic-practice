package exercise;

/**
 * Created by mawu on 2018/7/8.
 */

import org.junit.Test;

import java.util.*;

/**
 * 用1，2，3，…，9组成3个三位数abc，def和ghi，每个数字恰好使用一次，要
 求abc：def：ghi＝1：2：3。按照“abc def ghi”的格式输出所有解，每行一个解。提示：不必
 太动脑筋。
 */
public class Permutation implements Handler{

    public static final Integer SUM_CONSTANT = 45;
    public static final Integer BEAT_CONSTANT = 362880;


    public List<Integer> numSplit(int num) {
        int i = num%10;
        int j = (num/10)%10;
        int k = num/100;
        List<Integer> lists = new ArrayList<>();
        lists.add(i);
        lists.add(j);
        lists.add(k);
        return lists;
    }
    public boolean numCheck(int num1, int num2, int num3){
        List<Integer> n1 = numSplit(num1);
        List<Integer> n2 = numSplit(num2);
        List<Integer> n3 = numSplit(num3);
        int y1 = 0;
        int y2 = 1;
        for(int t1 : n1) {
            y1 += t1;
            y2 *= t1;
        }
        for(int t1 : n2) {
            y1 += t1;
            y2 *= t1;
        }
        for(int t1 : n3) {
            y1 += t1;
            y2 *= t1;
        }
        if(y1 == SUM_CONSTANT && y2 == BEAT_CONSTANT) {
            return true;
        }else {
        return false;
        }
    }
    @Test
    @Override
    public void handle() {
        for(int i = 123; i < 329; ++i) {
            int i2 = i*2;
            int i3 = i*3;
            if(numCheck(i, i2, i3)) {
                System.out.println(i + " " + i2 + " " + i3);
            }
        }
    }
}
