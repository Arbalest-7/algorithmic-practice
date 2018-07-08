package exercise;

import java.util.Scanner;

/**
 * Created by mawu on 2018/7/8.
 */
public interface Handler {
    Scanner scanner = new Scanner(System.in);
    public void handle();
}
