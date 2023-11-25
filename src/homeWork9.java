import java.util.Scanner;

public class homeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 3 so: ");
        float a = Float.parseFloat(scanner.nextLine());
        float b = Float.parseFloat(scanner.nextLine());
        float c = Float.parseFloat(scanner.nextLine());

        float min = a;
        float between = a;
        float max = c;

        if (min > b) min = b;
        else if (min > c) min = c;

        if (max < b) max = b;
        else if (max < a) max = a;

        if (max == a && min == c || max == c && min == a) {
            between = b;
        }else if(max == a && min == b || max == b && min == a){
            between = c;
        }

        System.out.printf("3 so theo thu tu giam dan: %.2f %.2f %.2f", max,between,min);
    }
}
