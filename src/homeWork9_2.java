import java.util.Scanner;

public class homeWork9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 4 so: ");
        float a = Float.parseFloat(scanner.nextLine());
        float b = Float.parseFloat(scanner.nextLine());
        float c = Float.parseFloat(scanner.nextLine());
        float d = Float.parseFloat(scanner.nextLine());

        float min = a;
        float between1;
        float between2;
        float max = d;

        if (min > b) min = b;
        else if (min > c) min = c;
        else if (min > d) min = d;

        if (max < b) max = b;
        else if (max < c) max = c;
        else if (max < a) max = a;


        if (max == a && min == d || max == d && min == a) {
            if(b > c) {
                between1 = b;
                between2 = c;
            }
            else {
                between1 = c;
                between2 = b;
            }
        }else if(max == a && min == b || max == b && min == a){
            if(c > d) {
                between1 = c;
                between2 = d;
            }
            else {
                between1 = d;
                between2 = c;
            }
        }else if(max == a && min == c || max == c && min == a){
            if(b > d) {
                between1 = b;
                between2 = d;
            }
            else {
                between1 = d;
                between2 = b;
            }
        }else if(max == b && min == c || max == c && min == b){
            if(a > d) {
                between1 = a;
                between2 = d;
            }
            else {
                between1 = d;
                between2 = a;
            }
        }else if(max == b && min == d || max == d && min == b){
            if(c > a) {
                between1 = c;
                between2 = a;
            }
            else {
                between1 = a;
                between2 = c;
            }
        }else {
            if(b > a) {
                between1 = b;
                between2 = a;
            }
            else {
                between1 = a;
                between2 = b;
            }
        }

        System.out.printf("4 so theo thu tu giam dan: %.2f %.2f %.2f %.2f", max,between1,between2,min);
    }
}
