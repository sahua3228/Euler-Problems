
public class Problem1 {

	public static void main(String[] args) {
		int n, sum=0;
		for (n=0;n<1000;n++)
		{
			if(n%3==0 || n%5==0)
				sum=sum+n;
		}
		System.out.println("Sum="+sum);
	}

}
//Output=233168
