public class task2 {
    static void task_two() {
        for (int i = 1; i <= 1000 ; i++) {
            int flag = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){
                    flag++;
                }

            }
            if (flag < 3){

                System.out.print(i);
                System.out.print(" ");
            }
        }

    }
}
