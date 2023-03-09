import java.util.Scanner;

/*Bạn hãy viết phương thức hiển thị ra màn hình các số chia hết cho 3 mà không chia hết cho 5 trong mảng các số nguyên arr được nhập vào từ bàn phím.*/
public class Code77 {
    private static void show(int[] arr){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 3 == 0 && arr[i] % 5 !=0){
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        show(arr);
    }
}
