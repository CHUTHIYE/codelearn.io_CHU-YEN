import java.util.Scanner;

/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị các số từ n về -n.*/
public class Code44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= -n; i--){
            System.out.println(i + " ");
        }
    }
}
