import java.math.BigInteger;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                BigInteger numBig = scanner.nextBigInteger();
                System.out.println(numBig + " can be fitted in:");

                checkDataType(numBig, Byte.MIN_VALUE, Byte.MAX_VALUE, "byte");
                checkDataType(numBig, Short.MIN_VALUE, Short.MAX_VALUE, "short");
                checkDataType(numBig, Integer.MIN_VALUE, Integer.MAX_VALUE, "int");
                checkDataType(numBig, Long.MIN_VALUE, Long.MAX_VALUE, "long");

                if (numBig.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 ||
                        numBig.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
                    System.out.println(numBig + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }

    private static void checkDataType(BigInteger num, long min, long max, String type) {
        if (num.compareTo(BigInteger.valueOf(min)) >= 0 && num.compareTo(BigInteger.valueOf(max)) <= 0) {
            System.out.println("* " + type);
        }
    }
}