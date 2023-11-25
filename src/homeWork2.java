import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 3 diem html css js lan luot:");
        float markHtml = scanner.nextFloat();
        float markCss = scanner.nextFloat();
        float markJs = scanner.nextFloat();

        float avgMark = (markHtml + markCss + markJs) / 3;

        String conduct = "";

        if (0 <= avgMark && avgMark < 5) conduct = "Yeu";
        else if(5 <= avgMark && avgMark < 7) conduct = "Trung binh";
        else if(7 <= avgMark && avgMark < 8) conduct = "Kha";
        else if(8 <= avgMark && avgMark < 9) conduct = "Gioi";
        else conduct = "Xuat sac";

        System.out.printf("Diem: %.2f\nHanh kiem: %s",avgMark,conduct);
    }
}
