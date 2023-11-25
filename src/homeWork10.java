import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong co ban:");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so ngay cong thuc te:");
        int day = Integer.parseInt(scanner.nextLine());
        float salaryStaff;
        if(day <= 26){
            salaryStaff = salary*((float) day /26);
            System.out.printf("Luong nhan vien = %f",salaryStaff);
        }else {
            salaryStaff = (float) (salary+(day-26)*((salary/26)*1.5));
            System.out.printf("Luong nhan vien = %f",salaryStaff);
        }

    }
}
