public class getFactorial{
	public static void main (String[] args){
	
	System.out.println("factorial using for loop :" + getfactorial1(5));
	System.out.println("factorial using while loop :"+ getfactorial2(5));
	System.out.println("factorial without using loop :"+ getfactorial3(5));
   }

	
	static int getfactorial1(int n){
		if(n<0){
			return -1;
		}else if (n<2){
			return 1;
		}else {
			int fact=1;
			for(int i=2;i<=n;i++){
				fact *=i;
		}
		return fact;
		}
	}
	static int getfactorial2(int n){
		if(n<0){
			return -1;
		}else if (n<2){
			return 1;
		}else {
			int count=2;
			int fact =1;
			while(count<=n){
			fact *=count;
			count++;
		}
		return fact;
		}
		}
		
	static int getfactorial3(int n){
		if(n<0){
			return -1;
		}else if (n<2){
			return 1;
		}else{
			return  n * getfactorial3(n-1);
		}
		}
		}
		
		
