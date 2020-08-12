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