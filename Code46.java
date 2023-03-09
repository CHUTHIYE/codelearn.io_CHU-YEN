import java.util.Scanner;

/*Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị ra tổng các số lẻ từ 0 tới n.*/
public class Code46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i <= n; i++){
            if (i % 2 != 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
