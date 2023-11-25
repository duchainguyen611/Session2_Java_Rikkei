import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap khoang so tu nhien:");
        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for(int i=firstNum;i<=lastNum;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.printf("Tong cac gia tri chan trong khoang %d den %d la: %d",firstNum,lastNum,sum);
    }
}
