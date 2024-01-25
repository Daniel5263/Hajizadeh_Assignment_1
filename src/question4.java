import java.math.BigInteger;

public class question4 {
    public static void main(String[] args) {
        int num = 1;

        BigInteger[] sequence = new BigInteger[num + 1];
        sequence[0] = BigInteger.ZERO;
        sequence[1] = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(2)).add(sequence[i - 2].multiply(BigInteger.valueOf(3)));
        }

        BigInteger target = BigInteger.valueOf(num);
        int position = -1;
        for (int i = 0; i <= num; i++) {
            if (sequence[i].equals(target)) {
                position = i;
                break;
            }
            if (sequence[i].compareTo(target) > 0) {
                position = i - 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Position of the integer: " + (position + 1));
        } else {
            System.out.println("Position of the closest integer: " + num);
        }
    }
}
