import java.util.Scanner;

class DescendingSort {
    public static void main(String args[]) {
        int i, j, temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in descending order:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
