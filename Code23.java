import java.util.Scanner;
/*Bạn hãy viết chương trình tạo ra 2 biến kiểu số nguyên a và b. Sau đó nhập giá trị cho biến a và b từ bàn phím và hiển thị ra màn hình:
a + b = {P}*/
public class Code23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a + b = " + (a + b));
    }
}
