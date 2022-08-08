import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nhap phan tu thu [" + i + "," + j + "] :" );
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i][2];
        }
        System.out.println("Tong cac so o cot 2 cua mang la : " + sum);
    }
}
