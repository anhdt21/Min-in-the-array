import java.util.Scanner;

public class FindTheMinValue {
    public static void main(String[] args) {
        int[] array = new int[100];
        Scanner sc = new Scanner(System.in);
        //kiem tra gia tri nhap vao
        int size;
            System.out.print("Nhap vao so phan tu cua mang:");
            size = sc.nextInt();
        //nhap vao tung gia tri cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("\tGia tri phan tu " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        //in ra danh sach mang
        System.out.print("Danh sach cua mang:\n");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //tim gia tri min cua mang da nhap
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nGia tri nho nhat la " + min + " ,la phan tu thu " + index);
    }
}
