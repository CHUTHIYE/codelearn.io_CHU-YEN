import java.util.Scanner;
/*Bạn hãy viết chương trình nhập từ bàn phím chiều dài và chiều rộng của một hình chữ nhật (chiều dài và chiều rộng của hình chữ nhật này là một số nguyên) sau đó hiển thị ra màn hình:
Area = {P}*/
public class Code24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("Area = " + (length * width));

    }
}
