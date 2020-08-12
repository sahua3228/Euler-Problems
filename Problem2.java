
public class Problem2 {

	public static void main(String[] args) {
		int n=4000000;
		int a=0;
		int b=1;
		int sum=0;
		int c=0;
		for(;c<n;c++)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0) {
				sum=sum+c;
			}
		}
System.out.println("Sum="+sum);
	}

}
//Output=4613732