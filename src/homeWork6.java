import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so cong to dien dau thang:");
        int startMonth = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cong to dien cuoi thang:");
        int endMonth = Integer.parseInt(scanner.nextLine());

        int numElectric = endMonth - startMonth;

        String word;
        int price = 0;
        if (numElectric < 0) {
            word = "Loi he thong";
        } else if (numElectric < 50) {
            price = 10000 * numElectric;
            word = ("Gia tien gia dinh la: "+price);
        } else if (numElectric < 100) {
            price = 10000 * 49 + 15000 * (numElectric - 49);
            word = ("Gia tien gia dinh la: "+price);
        } else if (numElectric < 150) {
            price = 10000 * 49 + 15000 * 49 + 20000 * (numElectric - 98);
            word = ("Gia tien gia dinh la: "+price);
        } else if (numElectric < 200) {
            price = 10000 * 49 + 15000 * 49 + 20000 * 49 + 25000 * (numElectric - 147);
            word = ("Gia tien gia dinh la: "+price);
        } else {
            price = 10000 * 49 + 15000 * 49 + 20000 * 49 + 25000 * 49 + 30000 * (numElectric - 196);
            word = ("Gia tien gia dinh la: "+price);
        }

        System.out.printf(word);
    }
}
