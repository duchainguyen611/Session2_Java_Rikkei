import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Nhap 3 canh tam giac:");
            float a = Float.parseFloat(scanner.nextLine());
            float b = Float.parseFloat(scanner.nextLine());
            float c = Float.parseFloat(scanner.nextLine());

            String word;

            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && b == c) {
                    word = "3 canh nay la tam giac deu";
                    check = true;
                }
                else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a == b ||
                        Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) && b == c ||
                        Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) && a == c) {
                    word = "3 canh nay la tam giac vuong can";
                    check = true;
                }
                else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                        Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                        Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
                    word = "3 canh nay la tam giac vuong";
                    check = true;
                }
                else if (a == b || b == c || a == c) {
                    word = "3 canh nay la tam giac can";
                    check = true;
                }
                else {
                    word = "3 canh nay la tam giac thuong";
                    check = true;
                }
            } else {
                word = "3 canh nay khong phai la tam giac";
                check = false;
            }

            System.out.println(word);
        }while (!check);

    }
}
