import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class work2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 9, 4, 6, 7};
        BubbleSort(arr);
    }

    public static void  BubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            logArray(arr);
            if (!swapped) {
                break;
            }
        }
        logArray(arr);
    }

    public static void logArray(int[] arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(Arrays.toString(arr));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}