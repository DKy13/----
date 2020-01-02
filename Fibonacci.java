package bite_java;

import java.util.Scanner;

//递归求斐波那契数列的第 N 项
public class Fibonacci {
    //Fibonacci数列最明显的特点：前面相邻两项之和构成后一项
    //Fibonacci数列：1,1,2,3,5,8...
    public static int Fibonacci(int n){
        if(n <= 0 ){
            System.out.println("您的输入有误，请输入一个大于1的整数！");
            return  -1;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入一个大于1的整数：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Fibonacci(i);
        int ret = Fibonacci(i);
        System.out.println("ret = "+ret);
    }
}
