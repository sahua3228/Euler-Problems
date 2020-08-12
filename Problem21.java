/*Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.*/


public class Problem21 {

	public static void main(String[] args) {
		int i,j,a;
		int sum=0,sum1=0,sum2=0;
		for(i=1;i<10000;i++)
		{
			sum=0;
			sum1=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
				sum1=0;
				for(a=1;a<sum;a++)
				{
					if (sum%a==0)
					{
						sum1=sum1+a;
					}
				}
			}
			if(i==sum1&&sum1!=sum)
			{
				sum2=sum2+i;
			}
		}
System.out.println("Sum="+sum2);
	}

}
//Output=31626
