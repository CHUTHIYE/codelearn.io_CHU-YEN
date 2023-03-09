import java.util.Scanner;
/*Bạn hãy viết chương trình nhập vào từ bàn phím tên, tuổi của một người. Sau đó hiển thị ra màn hình:
In 15 years, age of {P1} will be {P2}*/
public class Code27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
    }
}
