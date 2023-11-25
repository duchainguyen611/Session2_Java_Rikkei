import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 1 so:");
        int number = scanner.nextInt();

        String word = "";
        if (number % 2 == 0) word = " La so chan";
        else word = "La so le";

        System.out.print(word);
    }
}
