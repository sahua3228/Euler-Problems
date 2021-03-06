/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. */

public class Problem2 {

	public static int series(int n)
{
	if(n==0)
		return 1;
	else if(n==1)
		return 2;
	else
		return series(n-1)+series(n-2);
	
}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
     
      int sum=0,n,r;
      n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 r=series(i);
    	 if(r%2==0)
    	 {
    		 sum+=r;
    	 }
    	 System.out.print(r+"  ");
     }
     System.out.println();
     System.out.println("sum="+sum);
	}

}
		
//Output=4613732
