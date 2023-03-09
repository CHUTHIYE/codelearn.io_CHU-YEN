import java.util.Scanner;

/*Cho hai xâu ký tự s1 và s2 được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra vị trí đầu tiên mà s2 xuất hiện trong s1 (không phân biệt hoa thường).*/
public class Code72 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.print(s1.indexOf(s2));
    }
}
