//take array input from user
import java.util.Scanner;
public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // create array of size n

        // Take input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the array
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//using builtin sort method 
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array using built-in Arrays.sort()
        Arrays.sort(arr);

        // Print sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Optional: To sort in descending order
        // Arrays.sort(arr);
        // for (int i = n - 1; i >= 0; i--) System.out.print(arr[i] + " ");
    }
}



//bubble sort
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 9};
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num : arr) System.out.print(num + " ");
    }
}


//selection sort
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int num : arr) System.out.print(num + " ");
    }
}


//insertion sort
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int num : arr) System.out.print(num + " ");
    }
}
