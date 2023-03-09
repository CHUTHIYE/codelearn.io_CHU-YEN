import java.util.Scanner;

/*Bạn hãy viết chương trình nhập vào từ bàn phím số 2 nguyên a và b. Sau đó hiển thị ra màn hình:
Nếu a lớn hơn hoặc bằng b thì hiển thị ra: a is greater than or equal to b
Ngược lại nếu a nhỏ hơn b thì hiển thị ra: a is smaller than b*/
public class Code34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b){
            System.out.println("a is greater than or equal to b");
        }else {
            System.out.println("a is smaller than b");
        }
    }
}
