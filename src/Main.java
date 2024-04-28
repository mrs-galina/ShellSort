import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

            int[] arr = {0, 5, 8, 2, 7, 9, 10, 1, 4, 3, 6};
            shellSort(arr);
            System.out.println(Arrays.toString(arr));

        }
// ну вроде работает
        public static void shellSort (int[] array) {
            int numberOfElements = array.length;
            int gap = numberOfElements / 2;
            while (gap != 1) {
                for (int i = 0; i <= (array.length/2); i++) {
                    if (array[i] > array[i+gap]) {
                        int mem = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = mem;
                    }
                }
                gap = gap / 2;
            }
            // gap теперь единица и мы делаем обычную сортировку вставками
            for (int i = 1; i < array.length; i++) {
                int now = array[i];
                int j = i;
                while (j > 0 && array[j - 1] > now) {
                    array[j] = array [j - 1];
                    j--;
                }
                array[j] = now;
            }
        }
    }
