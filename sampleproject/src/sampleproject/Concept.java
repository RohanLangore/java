package sampleproject;

public class Concept {
	
	static int a=10;
	int b =20;
       static void display() {
    	 
    	  
       }
       
       void show() {
    	   System.out.println(a+" "+b);
    	   System.out.println("non ststic is printed");
       }
       
	public static void main(String[] args) {
		display();
		Concept c = new Concept();
		c.show();
	}

}
