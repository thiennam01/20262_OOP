package home_work_01;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        double[] my_array = new double[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            my_array[i] = sc.nextDouble();
        }
        
        // Sắp xếp mảng
        Arrays.sort(my_array);
        
        // Tính tổng
        double sum = 0;
        for (double val : my_array) {
            sum += val;
        }
        
        // Tính trung bình cộng
        double average = sum / n;
        
        System.out.println("Sorted array: " + Arrays.toString(my_array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value: " + average);
        
        sc.close();
    }
}
