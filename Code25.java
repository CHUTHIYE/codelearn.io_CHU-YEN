import java.util.Scanner;
/*Cho 2 biến kiểu số nguyên a và b được nhập từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình:
a % b = {P}*/
public class Code25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a % b = " + (a % b));
    }
}
