import java.util.Scanner;

/*Bạn hãy viết phương thức trả về số lớn nhất trong 3 số được nhập và từ bàn phím.*/
public class Code79 {
    public static int max3(int a, int b, int c){
        if (a >= b && a >= c){
            return a;
        }
        if ( b >= 0){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max3(a, b, c));
    }
}
