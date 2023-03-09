import java.util.Scanner;
/*Bạn hãy viết phương thức hiển thị ra màn hình những xâu có độ dài lớn hơn 3 trong mảng arr.*/
public class Code78 {
    private static void show(String [] arr){
        for (int i = 0; i< arr.length; i++){
            if (arr[i].length() > 3){
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i <n; i++){
            arr[i] = sc.next();
        }
        show(arr);
    }
}
