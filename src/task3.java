import java.util.Scanner;

public class task3 {
    static void task_three(){
        Scanner a = new Scanner(System.in);

        System.out.println("Введите оператор + или -:  ");
        String ch = a.nextLine();

        System.out.println("Введите число 1:  ");
        int num1 = a.nextInt();

        System.out.println("Введите число 2:  ");
        int num2 = a.nextInt();

        if (ch.equals("+")){
            System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        }
        else {
            System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        }

    }

    }

