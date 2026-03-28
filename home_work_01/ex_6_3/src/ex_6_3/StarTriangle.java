package ex_6_3;
import java.util.Scanner;

public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Vòng lặp in khoảng trắng để căn lề giữa
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Vòng lặp in số dấu sao tương ứng (2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }
        
        sc.close();
    }
}
