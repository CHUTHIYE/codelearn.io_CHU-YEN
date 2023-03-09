import java.util.Scanner;

/*Cho xâu s và ký tự c được nhập từ bàn phím, bạn hãy viết chương trình in ra vị trí đầu tiên mà ký tự c xuất hiện trong xâu s,
nếu ký tự c không xuất hiện trong s thì in ra -1.*/
public class Code71 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int answer = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
}
