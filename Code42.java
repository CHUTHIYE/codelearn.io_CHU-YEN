import java.util.Scanner;

/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n và hiển thị ra các số từ 1 tới n, mỗi số cách nhau bởi 1 khoảng trắng.*/
public class Code42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n;i++){
            System.out.println(i + " ");
        }
    }
}
