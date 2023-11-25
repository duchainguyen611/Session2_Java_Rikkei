import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice > 4 || choice < 1) {
            System.out.print("Menu\n" +
                    "1. Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2. Tính chu vi và diện tích hình tam giác\n" +
                    "3. Tính chu vi và diện tích hình tròn.\n" +
                    "4. Thoát\n");
            System.out.print("Moi nhap lua chon:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap chieu dai, chieu rong cua hinh chu nhat:");
                    int d = Integer.parseInt(scanner.nextLine());
                    int r = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Chu vi hinh chu nhat = %d\nDien tich hinh chu nhat = %d",(d+r)*2,d*r);
                    break;
                case 2:
                    System.out.print("Nhap 3 canh cua tam giac:");
                    int c1 = Integer.parseInt(scanner.nextLine());
                    int c2 = Integer.parseInt(scanner.nextLine());
                    int c3 = Integer.parseInt(scanner.nextLine());
                    int nuaPTamGiac = (c1+c2+c3)/2;
                    double sTamGiac =  Math.sqrt(nuaPTamGiac*(nuaPTamGiac-c1)*(nuaPTamGiac-c2)*(nuaPTamGiac-c3));
                    System.out.printf("Chu vi tam giac = %d\nDien tich tam giac = %.2f",c1+c2+c3,sTamGiac);
                    break;
                case 3:
                    System.out.print("Nhap ban kinh cua tam giac:");
                    int bk = scanner.nextInt();
                    System.out.printf("Chu vi hinh tron= %.2f\nDien tich hinh trong = %.2f",2*Math.PI*bk,Math.PI*Math.pow(bk,2));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong hop le! Moi nhap lai!");
                    break;
            }
        }
    }
}
