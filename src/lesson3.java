import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so nguyen to tu 2 den 100:");
            n = scanner.nextInt();
            if (n<2) System.out.println("Sai dieu kien! Moi nhap lai!");
        }while (n<2);

        String word = "";
        if (n == 2) word = " so nguyen to";
        else {
            if (n % 2 == 0) word = "khong la so nguyen to";
            else {
                for (int i = 3; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        word = "khong la so nguyen to";
                    }
                }
                word = "la so nguyen to";
            }
        }

        System.out.printf("So %d %s",n,word);

    }
}
