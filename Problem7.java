
public class Problem7 {

	public static void main(String[] args) {
		int npr=1;
		int n=1;
		while (npr<10001)
		{
			n=n+2;
			if(isPrime(n))
				npr++;
		}
  System.out.println(n);
	}
static boolean isPrime(int n)
{
	if (n<=1)
		return false;
	else if(n==2)
		return true;
	else if (n%2==0)
		return false;
	else {
		int a=3;
		while(a*a<=n)
		{
			if(n%a==0)
				return false;
			a+=2;
		}
		return true;
	}
}
}
//Output=104743
