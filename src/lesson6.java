import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice > 4 || choice < 1) {
            System.out.print("Menu\n" +
                    "1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2. Kiểm tra số nguyên tố.\n" +
                    "3. Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4. Thoát\n");
            System.out.print("Moi nhap lua chon:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Thanh cong!");
                    break;
                default:
                    System.out.println("Khong hop le! Moi nhap lai!");
                    break;
            }
        }
    }
}
