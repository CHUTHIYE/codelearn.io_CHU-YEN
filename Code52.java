import java.util.Scanner;

/*Bạn hãy viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình số các ước số của n.*/
public class Code52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int answer = 0;
        while (i <= n) {
            if (n % 1 == 0){
                answer++;
            }
            i++;
        }
        System.out.println(answer);
    }
}
