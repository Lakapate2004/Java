public class getsum {
	 static int[] a = {2,4,5,6,8,9};
	public static void main (String[] args){
	
	System.out.println("sum using while loop :"+ getsum1(a));
	System.out.println("sum without using loop :"+ getsum2(a,0));
	}
	
	static int getsum1(int[]a){
		int i =0;
		int sum=0;
		while(i<a.length){
		sum += a[i];
		i++;
		}
		return sum;
		}
		
	static int getsum2(int[]a , int index){
		if(index==a.length){
		return 0;
		}else{
		return a[index]+ getsum2(a , index +1);
		}
		}
		}


	
