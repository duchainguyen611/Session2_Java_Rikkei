import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;
        System.out.print("Nhap thang: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap nam: ");
        year = Integer.parseInt(scanner.nextLine());
        if (year>0){
            if (month >= 1 && month <= 12) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.printf("Thang %d nam %d co 31 ngay", month, year);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.printf("Thang %d nam %d co 30 ngay", month, year);
                        break;
                    case 2:
                        if (year % 4 == 0 && year % 100 != 0)
                            System.out.printf("Thang %d nam %d co 29 ngay", month, year);
                        else System.out.printf("Thang %d nam %d co 28 ngay", month, year);
                        break;
                }
            } else System.out.print("Khong ton tai thang nay");
        }else{
            System.out.print("Khong ton tai nam nay");
        }
    }
}
