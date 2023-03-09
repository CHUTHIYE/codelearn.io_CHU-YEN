import java.util.Scanner;

/*Cho số nguyên a và b được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình các số từ a tới b.*/
public class Code43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++){
            System.out.println(i + " ");
        }
    }
}
