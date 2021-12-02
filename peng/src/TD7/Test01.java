package TD7;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入您的选择：（1~3 之间的整数）");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("error");
            break;
        }
    }
}