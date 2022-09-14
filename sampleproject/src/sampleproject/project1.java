package sampleproject;

public class project1 {

	public static void main(String[] args) {
	int num = 729;
	int rem,max=0 ,rev=0;
	
	while(num>0) {
		rem=num%10;
		num/=10;
		
		rev=rev*10+rem;
		
	}
	System.out.println(rev);
	

	}

}
