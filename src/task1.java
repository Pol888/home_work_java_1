import java.util.Scanner;

public class task1 {
    static void task_one(){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число:  ");
        int num = a.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
