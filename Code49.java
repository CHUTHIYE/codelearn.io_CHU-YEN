import java.util.Scanner;

/*Bạn hãy viết chương trình nhập từ bàn phím một số nguyên n và hiển thị ra màn hình các ước của n (n > 0).*/
public class Code49 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if ( n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
