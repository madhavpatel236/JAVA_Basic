public class Test {

    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + countDigits(number / 10);
        }
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static boolean isArmstrong(int number, int n) {
        if (number == 0) {
            return true;
        } else {
            int digit = number % 10;
            return (power(digit, n) + isArmstrong(number / 10, n));
        }
    }

    public static void main(String[] args) {
        int number = 153;
        int numDigits = countDigits(number);
        boolean armstrong = isArmstrong(number, numDigits);
        
        if (armstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
