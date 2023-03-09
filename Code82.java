import java.util.Scanner;

/*Cho số nguyên n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về tổng các số lẻ từ 1 tới n.*/
public class Code82 {
    public static int sum(int n){
        if (n == 1) return 1;
        if (n % 2 == 0){
            return sum(n - 1);
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
