package id.akdev.number;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        //parameternya string
        BigInteger a = new BigInteger("1000000000000000000000000000");
        BigInteger a2 = new BigInteger("10000000000");
        BigDecimal b = new BigDecimal("1000000000000000000000000000");

        System.out.println(a.add(a2));
        System.out.println(a.subtract(a2));
        System.out.println(a.divide(a2));
        System.out.println(a.multiply(a2));
        System.out.println(a.mod(a2));
    }
}
