/*
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar her rakam, bir önceki rakamla toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır. (Yani sonuç her zaman 2.sayı olmuş olur)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, first = 0, second = 1, next;

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi kaç elemanlı olsun? : ");
        n = input.nextInt();

        System.out.print(n +" Elemanlı Fibonacci Serisi : ");

        for (int i = 0; i < n; i++) {
            if (i <= 1)
                next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}
