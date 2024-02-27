import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài mảng
        do {
            System.out.print("Nhập độ dài mảng (tối đa 10): ");
            size = scanner.nextInt();
        } while (size > 20);

        // Khởi tạo mảng
        array = new int[size];

        // Nhập giá trị cho các phần tử mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tìm số lớn nhất trong mảng
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        // In kết quả
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}