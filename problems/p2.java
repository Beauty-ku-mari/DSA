import java.util.Scanner;

class p2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(product);

        }

    }
}