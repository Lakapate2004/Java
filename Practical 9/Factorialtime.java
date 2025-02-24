public class Factorialtime{

	public static int factorial1(int num){
	
		int fact = 1;
		if(num<=1){
		    return 1 ;
		}
		for(int i = 2 ; i<=num; i++){
			fact = fact*i;
		}

		   return fact;
	}
	
	
	public static int factorial2(int num){
		if(num<=1){
		     return 1;
		}
		return num * factorial2(num-1);
	}
	
	
	
	public static void main(String[] args){
	
	
	int k = (int) (System.nanoTime()%10);
	
	long  array []= new long [k];

	    for( int i=0;i<k;i++){
		array[i] = System.nanoTime()%10;
		}
	
	 int avgfactorial1time = 0;
	 int avgfactorial2time = 0;
	 long  requiredtime   = 0;
	 long  requiredtime1  = 0;
	

	   for( int i=0;i<k;i++){
		int num = (int) array[i];
	
	long starttime = System.nanoTime();
	int result = factorial1(num);
	long endtime = System.nanoTime();
	requiredtime = requiredtime + (endtime-starttime);
	avgfactorial1time = (int) requiredtime/k;
	
	
	
	long starttime1 = System.nanoTime();
	int result1 = factorial2(num);
	long endtime1 = System.nanoTime();
        requiredtime1 = requiredtime1 + (endtime1-starttime1);
	avgfactorial2time = (int)requiredtime1/k;
	}
	
	


	System.out.println("required time for factorial1 : " + avgfactorial1time + " nano second");
	System.out.println("required time for factorial2 : " + avgfactorial2time + " nano second");
	
	
	}
}
