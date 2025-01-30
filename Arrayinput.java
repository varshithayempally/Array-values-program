import java.util.Scanner;

public class Arrayinput {
        public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = Scanner.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            Scanner.close();
        }
    }
}


