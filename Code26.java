import java.util.Scanner;
/*Bạn hãy viết chương trình nhập vào từ bàn phím 2 số nguyên a và b. Sau đó hiển thị ra các phép tính trên 2 số này giống như sau:
        a + b = {P1}
        a - b = {P2}
        a * b = {P3}
        a / b = {P4}
        a % b = {P5}*/
public class Code26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

    }
}
