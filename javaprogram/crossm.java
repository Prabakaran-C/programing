package workout;

import java.util.Arrays;

public class crossm {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]=new int [a.length];
		char d[]=new char [a.length];
		  for (int i = 0; i < a.length; i++) {
			  for(int j=1;j<5;j++) {
				  if(a.length==5) {
					  for(int x=0;x>=1;x++) {
						  for(int z =1;z==1;z++) {
							c[i] = a[x]+b[z];
							if (c[i] % 2 == 0) {
				                d[i] = 's';
				            } else {
				                d[i] = 'd';
				            }
				        
						  }
					  }
					  for(int x=2;x==2;x++) {
						  for(int z =2;z==2;z++) {
							c[i] = a[x]+b[z];
							if (c[i] % 2 == 0) {
				                d[i] = 's';
				            } else {
				                d[i] = 'd';
				            }
				        
						  }
						  
					  }
					  for(int x=3;x>=5;x++) {
						  for(int z =4;z==5;z++) {
							c[i] = a[x]+b[z];
							if (c[i] % 2 == 0) {
				                d[i] = 's';
				            } else {
				                d[i] = 'd';
				            }
				        
						  }
					  }
				
					  
				  }/*
	            c[i] = a[i] + b[j];
	            if (c[i] % 2 == 0) {
	                d[i] = 's';
	            } else {
	                d[i] = 'd';
	            }*/
	        }
		  }
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(c[i] + " ");
	        }
	        System.out.println();

	        for (int i = 0; i < 5; i++) {
	            System.out.print(d[i] + " ");
	        }
	        System.out.println();
		
	}

}
