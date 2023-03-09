import javax.security.sasl.SaslClient;
import java.util.Scanner;

/*Bạn hãy viết chương trình nhập từ bàn phím hai số nguyên dương a và b. Sau đó hiển thị ra màn hình kết quả của ab.*/
public class Code53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 1;
        while (b > 0){
            answer *= a;
            b--;
        }
        System.out.println(answer);
    }
}
