class displayPattern{
	public static void main(String args[]){
		displayPattern pattern = new displayPattern();
		System.out.println("Pattern 1:");
		pattern.displayPattern1(3);
		System.out.println("Pattern 2:");
		pattern.displayPattern2(3);
		System.out.println("Pattern 3:");
		pattern.displayPattern3(3);
	}


	void displayPattern1(int size){
        for(int line =1;line<=size;line++){
          for(int space = size-line;space>0;space--){
            System.out.print(" ");
        }
        for (int plus= 2*line-1 ; plus>0; plus--)
        {
            System.out.print("+");
        }
        System.out.print("\n"); 
    }
    for(int line =size-1;line>=1;line--){
        for(int space = size-line;space>0;space--){
            System.out.print(" ");
        }
        for (int plus= 2*line-1 ; plus>0; plus--)
        {
            System.out.print("+");
        }
        System.out.print("\n");
}
}


void displayPattern2(int size){
    for (int line =1; line<=size; line++){
        for(int space = size-line;space>0;space--){
            System.out.print(" ");
        }
        for(int plus=2*line-1;plus>0;plus--){
            if (plus%2==0)
            {
               System.out.print(" ");
            } else{
                System.out.print("+");
            }

        }
        System.out.print("\n");

    }
     for (int line =size-1; line>=1; line--){
        for(int space = size-line;space>0;space--){
            System.out.print(" ");
        }
        for(int plus=2*line-1;plus>0;plus--){
            if (plus%2==0)
            {
                System.out.print(" ");
            } else{
                System.out.print("*");
            }

        }
        System.out.print("\n");

    }

}


void displayPattern3(int size){

    for(int line = 1; line<=3;line++){
       for(int space = size-line;space>0;space--){
        System.out.print(" ");
       }
       for(int pattern =2*line-1;pattern>0;pattern--)
       if(line%2==1){
        if(pattern%2==1){
            System.out.print("+");
        }else{
            System.out.print("*");
        }
        
       }
       else{
        if(pattern%2==1){
            System.out.print("*");
        }else{
            System.out.print("+");
        }   
    }
        System.out.print("\n");
    }

    for(int line = size; line>=1;line--){
       for(int space = size-line;space>0;space--){
        System.out.print(" ");
       }
       for(int pattern =2*line-1;pattern>0;pattern--)
       if(line%2==1){
        if(pattern%2==1){
            System.out.print("*");
        }else{
            System.out.print("+");
        }
        
       }
       else{
        if(pattern%2==1){
            System.out.print("+");
        }else{
            System.out.print("*");
        }   
    }
        System.out.print("\n");
    }

}
}
