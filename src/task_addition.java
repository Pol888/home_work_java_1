
public class task_addition {
    static void task_add() {
        String xyz = "2? + ?5 - 5? + 6??55 - 1??? = 65556";  // приммер любой сложности, с любым количеством - "?" +

        String[] arr_xyz = xyz.split(" ");

        int count_vopros = 0;

        for (int i = 0; i < arr_xyz.length; i++) {             // узнали сколько вхождений - "?"
            for (int j = 0; j < arr_xyz[i].length(); j++) {
                char q = arr_xyz[i].charAt(j);
                String qq = Character.toString(q);
                if (qq.equals("?")) {
                    count_vopros++;
                }
            }
        }

        int[] index_arr = new int[count_vopros * 3];   // массив с индексом "?" и начальным значением каждого вхождения
        // [0, 1,-индекс   0,-значение |||  2, 0,   0]
        int go_to_the_index_arr = 0;
        for (int i = 0; i < arr_xyz.length; i++) {             // записываем массив index_arr
            for (int j = 0; j < arr_xyz[i].length(); j++) {
                char q = arr_xyz[i].charAt(j);
                String qq = Character.toString(q);
                if (qq.equals("?")) {
                    index_arr[go_to_the_index_arr] = i;
                    index_arr[go_to_the_index_arr + 1] = j;
                    go_to_the_index_arr += 3;
                    arr_xyz[i] = arr_xyz[i].substring(0, j) + "0" + arr_xyz[i].substring(j + 1);
                }
            }
        }


        boolean flag = false;
        while (!flag) {
            if (index_arr[index_arr.length - 1] == 9){
                System.out.print("Не найденно подходящих значений!");
                break;
            }

                int result = Integer.parseInt(arr_xyz[0]);
            for (int i = 1; i < arr_xyz.length - 2; i++) {    // счет уровнения
                if (arr_xyz[i].equals("+")) {
                    result += Integer.parseInt(arr_xyz[i + 1]);
                }
                else if (arr_xyz[i].equals("-")) {
                    result -= Integer.parseInt(arr_xyz[i + 1]);
                }

            }
            if (result == Integer.parseInt(arr_xyz[arr_xyz.length - 1])) {
                System.out.println("Свершилось, значения найденны");
                for (String w : arr_xyz) {
                        System.out.print(w);
                        System.out.print(" ");
                    }
                flag = true;
            }

            index_arr[2]++;       // генератор значений для уровнения
            if (index_arr[2] == 10) {
                index_arr[2] = 0;
                if (count_vopros > 1) {
                    index_arr[5]++;
                }
            }
            if (count_vopros > 1) {
                for (int i = 5; i < index_arr.length; i += 3) {
                    if (index_arr[i] == 10) {
                        index_arr[i] = 0;
                        index_arr[i + 3] += 1;
                    }
                }
            }
            // ====================================================
            // подставляем новое значение
            for (int z = 0; z < index_arr.length; z += 3) {

                for (int i = 0; i < arr_xyz.length; i++) {             // перезаписываем arr_xyz
                    for (int j = 0; j < arr_xyz[i].length(); j++) {
                        if (i == index_arr[z] && j == index_arr[z + 1]) {
                            arr_xyz[i] = arr_xyz[i].substring(0, j) + index_arr[z + 2] + arr_xyz[i].substring(j + 1);
                        }
                    }
                }
            }
        }
    }
}


