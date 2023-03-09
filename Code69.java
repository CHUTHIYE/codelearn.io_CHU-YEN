import java.util.Scanner;

/*Cho xâu s và số nguyên k được nhập từ bàn phím.
Bạn hãy viết chương trình in ra màn hình ký tự thứ k trong xâu s.*/
public class Code69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(s.charAt(k - 1));
    }
}
