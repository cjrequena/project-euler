
package com.projecteuler.problem1;

import lombok.Data;

/**
 * <p>
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Problem 1 Find the sum of all the multiples of 3 or 5 below 1000.
 * <p>
 *
 * @author cjrequena
 * @version 1.0
 * @see <a href="https://projecteuler.net/problem=1">https://projecteuler.net/problem=1</a>
 * <p>
 * @see
 * @since JDK1.8
 */
@Data
public class MultiplesOf3And5 {


    public MultiplesOf3And5() {
    }

    /**
     *
     * @param n
     * @param target
     * @return
     */
    public Integer sumDivisibleBy(Integer n, Integer target) {
        Integer p = target / n;
        return n * (p * (p + 1)) / 2;
    }


    /**
     *
     * @param target
     * @return
     */
    public Integer sumMultiplesOf3And5Bellow1000(Integer target) {
        MultiplesOf3And5 m = new MultiplesOf3And5();
        return m.sumDivisibleBy(3, target) + m.sumDivisibleBy(5, target) - m.sumDivisibleBy(15, target);
    }

    /**
     *
     * @param target
     * @return
     */
    public Integer sumMultiplesOf3And5(Integer target) {
        int sum = 0;
        for (int i = 1; i <= target; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * @param arg
     */
    public static void main(String arg[]) {
        MultiplesOf3And5 m = new MultiplesOf3And5();
        System.out.println(m.sumMultiplesOf3And5(999));
        System.out.println(m.sumMultiplesOf3And5Bellow1000(999));
    }
}


