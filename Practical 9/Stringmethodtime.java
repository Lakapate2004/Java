public class Stringmethodtime{

	public static void main(String[] args){
	

	
	int k = (int) (System.nanoTime()%20+1);
	
	long  array []= new long [k];

	    for( int i=0;i<k;i++){
		array[i] = System.nanoTime()%20+1;
		}
	

	String s1 = "";
	
	int averagetime1 = 0;
	
		for(int i = 0 ; i < k ; i++){
			long starttime1 = System.nanoTime();
			s1 = s1 + array[i];
			long endtime1 = System.nanoTime();
			long duration1 = endtime1 - starttime1;
			averagetime1 = (int)duration1/k;
		}
	
	
	

	StringBuilder s2 = new StringBuilder();
		int averagetime2 = 0;
		for(int i = 0 ; i <k ; i++){
			long starttime2 = System.nanoTime();
			s2.append(array[i]);
			long endtime2 = System.nanoTime();
			long duration2 = endtime2 - starttime2;
			averagetime2 = (int)duration2/k;
		}
	
	
	

	StringBuffer s3 = new StringBuffer();
		int averagetime3 = 0;
		for(int i = 0 ; i <k ; i++){
			long starttime3 = System.nanoTime();
			s3.append(array[i]);
			long endtime3 = System.nanoTime();
			long duration3 = endtime3 - starttime3;
			averagetime3 = (int)duration3/k;
		}
	
	
	
	
	
	System.out.println("Requied time for s1 "+ averagetime1 + " nano second ");
	System.out.println("Requied time for s2 "+ averagetime2 + " nano second ");
	System.out.println("Requied time for s3 "+ averagetime3 + " nano second ");
	
	}
}
	
	
