import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private Scanner sc;
    private int selection;

    public Driver(Scanner sc) {
        this.sc = sc.useDelimiter("\n");
    }

    public void run() {
        do {
            System.out.println("PHAN CONG HUY - FX16513");
            System.out.println("Enter number of array (1 to 10): ");
            selection = sc.nextInt();
            if (!isValid(selection)) {
                System.out.println("Only type number from 1 to 10. Try again.");
            }
        } while (!isValid(selection));
        int[] arr = new int[selection];
        System.out.println("Type " + selection + " number in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Insertion Sort: ");
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    public boolean isValid(int selection) {
        for (int i = 1; i < 11; i++) {
            if (selection == i) {
                return true;
            }
        }
        return false;
    }

    public void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

    public void insertionSort(int[] a) {
        if (a[0] > a[1]) {
            swap(a, 0, 1);
        }

        for (int i = 2; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }
    }
}
