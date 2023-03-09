import java.util.Scanner;

/*Bạn hãy viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình n! (n giai thừa).*/
public class Code48 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        for (int i = 1; i <=n; i++){
            answer *= i;
        }
        System.out.print(answer);
    }
}
