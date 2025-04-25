import java.util.Scanner;

public class ConvertTOBinary {

    public static String toBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 2);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();
        System.out.println(toBinary(num));
    }
}
