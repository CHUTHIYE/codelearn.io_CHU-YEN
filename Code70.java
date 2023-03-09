import java.util.Scanner;

/*Cho xâu s và ký tự c được nhập từ bàn phím.
Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.*/
public class Code70 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
