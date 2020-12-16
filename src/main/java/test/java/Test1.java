package test.java;

import java.util.Scanner;

/**
 * @Package: java.test
 * @ClassName: Test1
 * @Author: maml
 * @CreateTime: 2020/11/30 18:29
 * @Description:将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        num(a);
    }
    public static void num(int num){
        String mm=num+"=";
        for (int i = 2; i < num-1 ; i++) {
            if(num%i==0){
                mm+=i+"*";
                num=num/i;
            }
        }
        System.out.println(mm+num);
    }
}
