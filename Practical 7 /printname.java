class printname {
    public static void main(String[] args) {
    	int size = Integer.parseInt(args[0]);

        displayPattern(size);
    }
    static public void displayPattern(int size){
    	         size = size*2+1;
    		 int width = size;
    		 
    		 
    	for(int line = 0;line<size;line++){
       	        for (int col = 0;col<width;col++){   //P
       	   	 	if(col ==0 || line ==(size/2) || line==0 || line<(size/2)&&col==width-1 ){
       	   	    		System.out.print("+");
       	   	    	}else{
       	   	    		System.out.print(" ");
       	   	    	}
       	   	    }
       	   	     
       	   	System.out.print("   ");
       	   	     
       	   
       		for (int col = 0;col<width;col++){  //R
       	   		if(col == 0 || line == 0 || line == size / 2 || 
                    (col == width - 1 && line < size / 2) || 
                    (line > size / 2 && col == (line - size / 2)*2) ){
       	   	    		System.out.print("+");
       	   	    	}else{
       	   	    		System.out.print(" ");
       	   	    }
       	   	    }
       	   	    
       	   	System.out.print("  ");
       	   	
       	   	    

       	        for (int col = 0;col<width;col++){  //A
       	   	  	if((line == 0 && col > 0 && col < size-1) || (line == size / 2) || ((col == 0 || col == size - 1) && line != 0)){
       	   	   		 System.out.print("+");
       	   	        }else{
       	   	   		 System.out.print(" ");
       	   	    }
       	   	    }
       	   	    
       	   	  System.out.print("  ");
       	   	  

       		for (int col= 0;col<width;col++){   //T
          		 if(line==0||col==(width/2)){
            		    	System.out.print("+");
            		 }else{
               		  	System.out.print(" ");
           		 }	
       		 }
       		 
  		 System.out.print(" ");
  		 

       	        for (int col = 0;col<width;col++){   //H
       	   		if(col ==0 || col==width-1|| line ==(size/2)){
       	   	   		 System.out.print("+");
       	   	    	}else{
       	   	   		 System.out.print(" ");
       	   	   	 }
       	   	    }
       	   	    
       	   	    System.out.print("  ");
       	   	    
       	   	    
       	   	      for (int col = 0;col<width;col++){  //A
       	   	  	if((line == 0 && col > 0 && col < size-1) || (line == size / 2) || ((col == 0 || col == size - 1) && line != 0)){
       	   	   		 System.out.print("+");
       	   	        }else{
       	   	   		 System.out.print(" ");
       	   	    }
       	   	    }
       	   	    
       	   	  System.out.print("  ");
       	   	
       	   	  
       	   	      

       	        for (int col = 0;col<width;col++){   //M
       	   		if(col == 0 || col == width - 1 || (line == col && col <= width/ 2) || (line + col == size - 1 && col >= size/2))  {
       	   	   		 System.out.print("+");
       	   	 	 }else{
       	   	   		 System.out.print(" ");
       	   	   	 }
       	   	    }
       	   	    System.out.print("  ");
       	   	    

       		 for (int col= 0;col<width;col++){    //E
          		  if(line==0||col==0 || line==size-1 || line==(size/2)){
            		  	  System.out.print("+");
            		}else{
               		 	 System.out.print(" ");
           		 }	
       		 }
  		  
  		  System.out.print("  ");
  		  

       		 for (int col= 0;col<width;col++){	   //S
       			 if(line==0||line==size-1||line==(size/2)|| col==0&&line<=(size/2)||col==width-1&&line>=(size/2)){
       			  	System.out.print("+");
            		 }else{
               		 	 System.out.print(" ");
           		 }	
       		 }
  		  
  		  System.out.print("  ");
  		  
  		  
       	        for (int col = 0;col<width;col++){    //H
       	   		if(col ==0 || col==width-1|| line ==(size/2)){
       	   	   		 System.out.print("+");
       	   	    	}else{
       	   	   		 System.out.print(" ");
       	   	   	 }
       	   	    }
       	   	    
       	   	    System.out.print("\n");
       	   	    
  		  
       	   	    
       	   	    
       	   	  }
       	   	
       	   	  }
}
