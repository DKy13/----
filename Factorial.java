package bite_java;
import java.util.Scanner;
//求n的阶乘
public class Factorial {
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n* factorial(n-1);//factorial 函数调用自己
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        factorial(i);
        int ret = factorial(i);//设置一个返回值，返回factorial的函数值
        System.out.println("ret = "+ ret);
    }
}
