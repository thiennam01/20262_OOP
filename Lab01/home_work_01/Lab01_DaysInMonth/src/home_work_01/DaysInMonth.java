package home_work_01;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = -1;
        int year = -1;

        while (true) {
            // Bước 1: Nhập và kiểm tra tháng
            System.out.print("Enter month (Full name, Abbreviation, 3 letters, or Number): ");
            String monthInput = sc.next().trim();
            month = getMonthNumber(monthInput);

            // Bước 2: Nhập và kiểm tra năm
            System.out.print("Enter year (non-negative number, all digits): ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
            } else {
                sc.next(); // Clear input lỗi
                year = -1;
            }

            // Bước 3: Kiểm tra tính hợp lệ tổng thể
            if (month != -1 && year >= 0) {
                break; // Hợp lệ thì thoát vòng lặp
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        // Bước 4: Tính số ngày
        int days = calculateDays(month, year);
        System.out.println("The number of days is: " + days);
        sc.close();
    }

    // Hàm chuyển đổi mọi kiểu nhập tháng về số 1-12
    public static int getMonthNumber(String input) {
        input = input.toLowerCase();
        if (input.equals("january") || input.equals("jan.") || input.equals("jan") || input.equals("1")) return 1;
        if (input.equals("february") || input.equals("feb.") || input.equals("feb") || input.equals("2")) return 2;
        if (input.equals("march") || input.equals("mar.") || input.equals("mar") || input.equals("3")) return 3;
        if (input.equals("april") || input.equals("apr.") || input.equals("apr") || input.equals("4")) return 4;
        if (input.equals("may") || input.equals("5")) return 5;
        if (input.equals("june") || input.equals("jun.") || input.equals("jun") || input.equals("6")) return 6;
        if (input.equals("july") || input.equals("jul.") || input.equals("jul") || input.equals("7")) return 7;
        if (input.equals("august") || input.equals("aug.") || input.equals("aug") || input.equals("8")) return 8;
        if (input.equals("september") || input.equals("sept.") || input.equals("sep") || input.equals("9")) return 9;
        if (input.equals("october") || input.equals("oct.") || input.equals("oct") || input.equals("10")) return 10;
        if (input.equals("november") || input.equals("nov.") || input.equals("nov") || input.equals("11")) return 11;
        if (input.equals("december") || input.equals("dec.") || input.equals("dec") || input.equals("12")) return 12;
        return -1;
    }

    // Hàm tính số ngày dựa vào tháng và năm nhuận
    public static int calculateDays(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Kiểm tra năm nhuận
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}