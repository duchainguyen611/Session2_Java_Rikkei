import java.util.Scanner;

public class homeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        System.out.print("Nhap ngay: ");
        day = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap thang: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap nam: ");
        year = Integer.parseInt(scanner.nextLine());
        if(year>0){
            if (month >=1 && month <= 12) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (day>0 && day<=31) System.out.printf("Ngay %d thang %d nam %d hop le",day, month, year);
                        else System.out.print("Khong hop le");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day>0 && day<=30) System.out.printf("Ngay %d thang %d nam %d hop le",day, month, year);
                        else System.out.print("Khong hop le");
                        break;
                    case 2:
                        if (year % 4 == 0 && year % 100 != 0){
                            if (day>0 && day<=29) System.out.printf("Ngay %d thang %d nam %d hop le",day, month, year);
                            else System.out.print("Khong hop le");
                        }
                        else {
                            if (day>0 && day<=28) System.out.printf("Ngay %d thang %d nam %d hop le",day, month, year);
                            else System.out.print("Khong hop le");
                        }
                        break;
                }
            } else System.out.print("Khong hop le");
        }else System.out.print("Khong hop le");

    }
}
