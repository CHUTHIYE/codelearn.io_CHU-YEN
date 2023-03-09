import java.util.Scanner;

/*Bạn hãy viết chương trình nhập vào một ký tự từ bàn phím và thực hiện hiển thị ký tự tiếp trong bảng bảng chữ cái của ký tự đó ra màn hình.
Ví dụ nếu bạn nhập: c
thì chương trình sẽ hiển thị ra: d*/
public class Code30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = (char)(sc.next().charAt(0) + 1);
        System.out.println(c);
    }
}
