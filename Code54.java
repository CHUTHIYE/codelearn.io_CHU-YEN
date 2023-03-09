import java.util.Scanner;

/*Bạn hãy viết chương trình nhập từ bàn phím hai số nguyên a và b. Sau đó hiển thị ra màn hình các số từ a tới b mà chia hết cho cả 3 và 5.*/
public class Code54 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
