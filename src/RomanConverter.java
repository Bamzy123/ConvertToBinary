import java.util.Scanner;

public class RomanConverter {
    public static String toRoman(int number) {
        if (number < 1 || number > 100) throw new IllegalArgumentException("Number must be between 0 and 100");
        String[] hundreds = {"", "C"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return hundreds[number / 100] + tens[(number % 100) / 10] + ones[number % 10];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for (int index = 1; index <= number; index++) System.out.println(toRoman(index));
    }
}
