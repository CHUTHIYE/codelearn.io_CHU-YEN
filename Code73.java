import java.util.Scanner;

/*Cho xâu s được nhập vào từ bàn phím,
bạn hãy viết chương trình hiển thị ra màn hình những ký tự không phải là số trong xâu s.*/
public class Code73 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (char c = '0'; c <= '9'; c++){
            s = s.replace(c + "", "");
        }
        System.out.println(s);
    }
}
