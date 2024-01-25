import java.math.BigInteger;

public class question3 {
    public static void main(String[] args) {
        int num = 5;

        BigInteger[] sequence = new BigInteger[num];
        if (num >= 1) sequence[0] = BigInteger.ZERO;
        if (num >= 2) sequence[1] = BigInteger.ONE;

        for (int i = 2; i < num; i++) {
            sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(2)).add(sequence[i - 2].multiply(BigInteger.valueOf(3)));
        }

        for (int i = 0; i < num; i++) {
            System.out.println(sequence[i]);
        }
    }
}