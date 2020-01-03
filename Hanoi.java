package bite_java;

import java.util.Scanner;
public class Hanoi {
    public static void main(String[] args) {
        System.out.println("Enter disks number:");
        Scanner scanner = new Scanner(System.in);
        int nDisks = scanner.nextInt();
        doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk " + topN + " from " + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}