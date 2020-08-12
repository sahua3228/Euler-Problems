/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class Problem9 {

	public static void main(String[] args) {
		int a=0, b=0, c=0, s=1000;
		int d=0;
		for(a=1;a<s/3;a++)
		{
			for(b=a;b<s/2;b++)
			{
				c=s-a-b;
				if(a*a+b*b==c*c)
				{
					d++;
					break;
				}
			}
			if(d>0)
			{
				break;
			}
		}
System.out.println(a*b*c);
	}

}
//Output=31875000
