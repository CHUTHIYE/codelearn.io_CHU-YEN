import java.util.Scanner;

/*Cho xâu s được nhập và từ bàn phím, bạn hãy viết chương trình đảo ngược xâu s và hiển thị ra màn hình.*/
public class Code75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = "";
        for (int i = s.length() - 1 ; i >= 0; i--){
            answer += s.charAt(i);
        }
        System.out.println(answer);
    }
}
