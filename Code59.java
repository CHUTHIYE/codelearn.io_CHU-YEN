import java.util.Scanner;

/*Bạn hãy viết chương trình nhập vào từ bàn phím 10 số nguyên và hiển thị ra 10 số vừa nhập.*/
public class Code59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];

        for (int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.print(a[i] + " ");
        }
    }
}
