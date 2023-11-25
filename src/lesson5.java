import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        int N = 1;
        boolean check;
        while (N>0) {
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0) {
                check = true;
                break;
            }
            N++;
        }
        System.out.println(N);
    }
}
