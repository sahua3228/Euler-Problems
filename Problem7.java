/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/

public class Problem7 {

	public static boolean isprime(long n)
	{
		 int flag=1;
		 for(long i=2;i<Math.sqrt(n);i++)
		 {
			 if(n%i==0)
			 {
				 flag=0;
				 break;
			 }
		 }
		if(flag==1)
			return true;
		else
			return false;
		
	}
     public static void main(String args[])
     {
    int count=0;
    int i=2;
    int pno=0;
    while(count!=10001)
    {
    	if(isprime(i))
    	{
    		pno=i;
    		count++;
    	}
      i++;
    }
    	 
    	 System.out.println(pno);
    	 
     }
	
}
//Output=104743
