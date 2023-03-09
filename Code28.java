import java.util.Scanner;
/*Cho 2 biến kiểu số nguyên a và b được nhập từ bàn phím, bạn hãy viết chương trình hoán đổi giá trị của biến a và biến b. Sau đó hiển thị ra màn hình:
after swapping, a = {P1}, b = {P2}=*/
public class Code28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping, a = " + a + ", b = " + b);
    }
}
