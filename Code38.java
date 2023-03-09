import java.util.Scanner;

/*Viết chương trình nhập từ bàn phím số nguyên a. Bạn hãy kiểm tra xem a có nằm trong đoạn [10, 100] không,
nếu có thì hiển thị ra màn hình: {P} is in the range [10, 100]
Ngược lại hiển thị ra màn hình: {P} is not in the range [10, 100]*/
public class Code38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 10 && a <= 100){
            System.out.println(a + "is in the range [10, 100]");
        }else {
            System.out.println(a + "is not in the range [10, 100]");
        }
    }
}
