import java.util.*;

public class Array {
    public static void array1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of elememt: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void matrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of elememt in row: ");
        int n = sc.nextInt();
        System.out.print("Enter the num of element in col: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the num of elememt in row for second matrix: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the num of element in col for second matrix: ");
        int m2 = sc.nextInt();
        int arr2[][] = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int c[][] = new int[n][m2];
        System.out.println("Matrix after multiplication");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += arr[i][k] * arr2[k][j];

                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix");
        int tran[][] = new int[n][m2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m2; j++) {
                tran[i][j] = c[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(tran[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        array1();
    }
}