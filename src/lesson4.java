import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong so nguyen to can in ra:");
        int n = scanner.nextInt();

        System.out.println("Cac so nguyen to la:");
        int count = 0;
        int N = 2;
        boolean check;
        while (count < n) {
            if (N == 2) {
                check = true;
            } else {
                if (N % 2 == 0) check = false;
                else {
                    for (int i = 3; i <= Math.sqrt(N); i++) {
                        if (N % i == 0) {
                            check = false;
                        }
                    }
                    check = true;
                }
            }
            if (check) {
                System.out.print(" " + N + " ");
                count++;
            }
            N++;
        }
    }
}
