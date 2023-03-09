import java.util.Scanner;

/*Cho xâu s được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình số các ký tự in hoa trong xâu s.*/
public class Code74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
