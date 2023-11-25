import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 2 so nguyen:");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap phep tinh toan hoc:");
        char c = scanner.nextLine().charAt(0);

        int result;
        switch (c) {
            case '+':
                result = a + b;
                System.out.printf("%d + %d = %d", a, b, result);
                break;
            case '-':
                result = a - b;
                System.out.printf("%d - %d = %d", a, b, result);
                break;
            case '*':
                result = a * b;
                System.out.printf("%d * %d = %d", a, b, result);
                break;
            case '/':
                if (b == 0) System.out.printf("Loi vi so bi chia phai khac 0");
                else {
                    result = a / b;
                    System.out.printf("%d / %d = %f", a, b, (float)result);
                }
                break;
            default:
                System.out.print("Loi ki tu phep tinh toan hoc");
                break;
        }
    }
}
