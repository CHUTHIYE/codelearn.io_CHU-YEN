import java.util.Scanner;

/*Viết chương trình nhập vào bán kính r của một hình tròn và hiển thị ra màn hình chu vi của hình tròn đó biết π = 3.14:
Circumference = {P}
*/
public class Code29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14;
        System.out.println("Circumference = " + (2 * pi * r));
    }
}
