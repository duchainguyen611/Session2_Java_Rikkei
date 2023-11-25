import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String word;
        System.out.print("Nhap so de kiem tra:");
        num = scanner.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            word = "Chia het cho 3 va 5";
        } else if (num % 3 == 0) {
            word = "Chi chia het cho 3";
        } else if (num % 5 == 0) {
            word = "Chi chia het cho 5";
        } else {
            word = "Khong chi het cho 3 va 5";
        }
        System.out.println(word);
    }
}
