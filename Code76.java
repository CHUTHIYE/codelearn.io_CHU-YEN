import java.util.Scanner;

/*Bạn hãy viết phương thức trả về tổng của các phần tử trong mảng các số nguyên arr được nhập vào từ bàn phím.*/
public class Code76 {
    public static int sumOfArray(int[] arr){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfArray(arr));
    }
}
