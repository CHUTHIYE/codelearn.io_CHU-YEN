/*Bạn hãy điền code vào dấu ... để màn hình hiển thị ra các số lẻ từ 1 tới 100.*/
public class Code56 {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
