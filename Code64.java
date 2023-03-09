import java.util.Scanner;

/*Cho một mảng các số nguyên n phần tử arr. Bạn hãy viết chương trình tính tổng các số lẻ lớn hơn 0 trong mảng.*/
public class Code64 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 != 0 && arr[i] > 0){
                answer += arr[i];
            }
        }
        System.out.print(answer);
    }

}
