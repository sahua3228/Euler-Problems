/*n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!*/

import java.math.BigInteger;
import java.util.Scanner;
public class Problem20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BigInteger fact= BigInteger.valueOf(1);
		for(long i=1; i<=100; i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		BigInteger sum= BigInteger.valueOf(0);
		BigInteger zero=BigInteger.valueOf(0);
		while(!fact.equals(zero))
		{
			sum=sum.add(fact.remainder(BigInteger.valueOf(10)));
			fact=fact.divide(BigInteger.valueOf(10));
		}
		System.out.println("Sum of 100!="+sum);
	}

}
//Output=648
